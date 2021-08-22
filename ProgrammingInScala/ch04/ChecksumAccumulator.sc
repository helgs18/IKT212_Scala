object calc {
    class ChecksumAccumulator {
        private var sum = 0
   
        def add(b: Byte): Unit = {
            sum += b
        }

        def checksum(): Int = {
            return ~(sum & 0xF0) + 1
        }

        def getsum(): Int = {
            return sum
        }
    }

    def main(args: Array[String]): Unit = {
        val acc = new ChecksumAccumulator()
        println(acc.getsum())
        acc.add(35)
        println(acc.getsum())
        println(acc.checksum())
    }
}

