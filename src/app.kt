fun main(args: Array<String>) {
    println("HELLO")
    howDefaultValueWorks()
    howDefaultValueWorks(null)
    howDefaultValueWorks("qwer")
}

fun howDefaultValueWorks(s: String? = "qwe") {
    println("s = $s")
}