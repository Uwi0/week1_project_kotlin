package main

import utils.answer

fun main(){
    "soal nomer 1".answer {
        val value = 3.0
        val print = convertDoubleToString(value)
        println(print)
    }

    "soal nomer 2".answer {
        val list = arrayListOf(1,2,3,4,5,6,7,8,9)
        printEven(list)
        println()
    }

    "soal nomer 3".answer {
        val list = arrayListOf("udacoding","tempat 2","tempat 3","tempat 4","tempat 5")
        printArrayString(list)
    }

    "soal nomer 4".answer {
        val value = (1..110).random()
        print("nilai anda $value : ")
        whenFunction(value)
    }

    "soal nomer 5".answer {
        val list = arrayListOf(
            "jakarta",
            "jakarta",
            "Padang",
            "Solo",
            "Padang",
            "Bandung",
            "Padang",
            "Malang",
            "Bali"
        )
        countItem(list)
    }
}

fun convertDoubleToString(double: Double) : String = "setelah di konversi ke String = $double"

fun printEven(list: List<Int>){
    list.forEach {
        if (it%2 == 0){
            print("$it,")
        }
    }
}

fun printArrayString(list: List<String>){
    if(list.contains("udacoding")){
        println("nah ini belajar coding yang keren")
    }
}

fun whenFunction(value: Int){
    when{
        value in 60..80 -> println("memuaskan")
        value in 81..90 -> println("sangat memuaskan")
        value in 91..100 -> println("terpuji")
        value < 60 -> println("Tidak lulus")
        value > 100 -> println("nilai tidak valid")
    }
}

fun countItem(list: List<String>){
    val resultMap: MutableMap<String, Long> = HashMap()
    list.forEach {element ->
        if (resultMap.containsKey(element)){
            resultMap[element]?.plus(1L)?.let { resultMap.put(element, it) }
        }else{
            resultMap[element] = 1L
        }
    }

    resultMap.forEach{(key, value) -> println("$key : $value")}
}