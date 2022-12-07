fun main() {
    print(solution("Ready[[[, steady, go!"))
}

fun solution(text: String): String {
    val list = mutableListOf<String>()

    var tempString = ""
    text.forEach {
        if (it.isLetter()) {
            tempString += it
        } else {
            list.add(tempString)
            tempString = ""
        }
    }

    if (tempString.isNotEmpty())
        list.add(tempString)

    return list.maxByOrNull { it.length } ?: ""
}
