package br.com.alura.array

fun main(){
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie){

    }

    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares){
        print("$numeroPar ")
    }

    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach{ println("$it") }

    val intervalo = 1500.0..5000.0
    val salario = 4000.0

    if (salario in intervalo){
        println("Está dentro do intervalo")
    }
    else{
        println("Não está dentro do intervalo")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'

    print(letra in alfabeto)
}