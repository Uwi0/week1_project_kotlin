package utils

infix fun String.answer(function: () -> Unit){
    println("--- Jawaban dari $this ---")
    function()
    println()
}