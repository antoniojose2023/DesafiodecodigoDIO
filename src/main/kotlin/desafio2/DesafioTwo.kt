package desafio2

fun main() {
    val entrada: String? = readLine()

    // Utiliza o conceito de "destructuring" para atribuir cada parte da data (dia/mes/ano).
    // Referência: https://kotlinlang.org/docs/destructuring-declarations.html
    val (dia, mes, ano) = entrada!!.split("/")

    val mesTratado  = if(mes.substring(0) == "0"){
        mes.substring(1)
    }else{
        mes
    }

    val mesPorExtenso = when (mesTratado.toInt()) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Marco"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês Inválido!"
    }

    println("${dia} de ${mesPorExtenso} de ${ano}")
}