package br.com.alura.list

fun main() {
    listaDeLivros
        .groupBy { it.editora}
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora - ${livros.joinToString { it.titulo }}")
        }
}
