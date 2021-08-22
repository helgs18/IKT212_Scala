object SingleLineCalc {
    class ChecksumAccumulator {

        private var sum = 0

        def add(b: Byte): Unit = sum += b
        def checksum(): Int = ~(sum & 0xF0) + 1
        def printsum() = println(sum)
    }

    def main(args: Array[String])={
        val acc: ChecksumAccumulator = new ChecksumAccumulator()
        acc.add(35)
        acc.printsum()
        println(acc.checksum())
    }
}

