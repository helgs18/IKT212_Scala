/*global jQuery */
/*!
* FlexVerticalCenter.js 1.0
*
* Copyright 2011, Paul Sprangers http://paulsprangers.com
* Released under the WTFPL license
* http://sam.zoy.org/wtfpl/
*
* Date: Fri Oct 28 19:12:00 2011 +0100
*/
(function( $ ){

  $.fn.flexVerticalCenter = function( options ) {
    var settings = $.extend({
      cssAttribute:   'margin-top', // the attribute to apply the calculated value to
      verticalOffset: 0,            // the number of pixels to offset the vertical alignment by
      parentSelector: null,         // a selector representing the parent to vertically center this element within
      debounceTimeout: 25           // a default debounce timeout in milliseconds
    }, options || {});

    return this.each(function(){
      var $this   = $(this); // store the object
      var debounce;

      // recalculate the distance to the top of the element to keep it centered
      var resizer = function () {

        var parentHeight = (settings.parentSelector && $this.parents(settings.parentSelector).length) ?
          $this.parents(settings.parentSelector).first().height() : $this.parent().height();

        $this.css(
          settings.cssAttribute, ( ( ( parentHeight - $this.height() ) / 2 ) + parseInt(settings.verticalOffset) )
        );
      };

      // Call on resize. Opera debounces their resize by default.
      $(window).resize(function () {
          clearTimeout(debounce);
          debounce = setTimeout(resizer, settings.debounceTimeout);
      });

      // Call once to set after window loads.
      $(window).load(function () {
          resizer();
      });

      // Apply a load event to images within the element so it fires again after an image is loaded
      $this.find('img').load(resizer);

    });

  };

})( jQuery );

/**
 * Author: Tom Usborne
 * jQuery Simple Parallax for Page Header background
 *
 */
 
function generateHeaderHeight() {

	// Only run the function is the setting exists
	if ( ! jQuery('.generate-page-header.fullscreen-enabled')[0] )
		return;
		
	// Window height
	var windowHeight = jQuery(window).height();
		
	// Page Header element
	var $this = jQuery( '.generate-page-header.fullscreen-enabled' );
		
	// The space between the top of the window and the page header element
	var offset = $this.offset().top;
		
	// The height of the page header
	var height = $this.outerHeight();
	
	// Hide the element while it loads
	$this.hide();
		
	// Calculate the height of the window minus the header
	var availableHeight = Math.round( windowHeight - offset );

	// Return the height, then show the header
	return $this.css('height', availableHeight + 'px') + $this.show();

}

function generateHeaderParallax() {

	// Disable on mobile
	var mobile = jQuery( '.menu-toggle' );
	if ( mobile.is( ':visible' ) )
		return;

	// Only run the function if the setting exists
	if ( ! jQuery('.generate-page-header.parallax-enabled')[0] )
		return;
		
	// Page Header element
	var $this = jQuery( '.generate-page-header.parallax-enabled' );
			
	var x = jQuery(this).scrollTop();
	return $this.css('background-position', 'center ' + parseInt(-x / 3) + 'px');	

}

jQuery(document).ready(function($) {
	
	// Set up the resize timer
	var generateResizeTimer;
	
	if ( jQuery('.generate-page-header.fullscreen-enabled')[0] ) {
		// Initiate full window height on load
		generateHeaderHeight();
	}

	if ( jQuery('.generate-page-header.parallax-enabled')[0] ) {
		// Initiate parallax effect on scroll for our page header
		$(document).scroll(function() {			
			generateHeaderParallax();
		});
	}
	
	if ( jQuery('.generate-page-header.fullscreen-enabled')[0] ) {
		// Initiate full window height on resize
		$(window).resize(function() {
			clearTimeout(generateResizeTimer);
			generateResizeTimer = setTimeout(generateHeaderHeight, 200);
		});
	}
	
	if ( jQuery('.generate-content-header .vertical-center-enabled')[0] ) {
		// Vertically center content
		$('.generate-content-header .vertical-center-enabled').hide();
		$('.generate-content-header .vertical-center-enabled').flexVerticalCenter({ cssAttribute: 'padding-top' });
		$('.generate-content-header .vertical-center-enabled').fadeIn();
	}
	
});