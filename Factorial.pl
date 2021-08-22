#!/usr/bin/perl -w
sub factorial {
	$f = 1; 
	$n = $t = $_[0];
	for($i = 0; $i < $t; $i++)
	{
		$f = $f*$n;
		$n = $n-1;
	}
	return $f;
}
print "factorial(5) = " . factorial(5) . "\n";
print "factorial(30) = " . factorial(30) . "\n";

