package desafio3

fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado = 0

    for (i in numeroRomano!!.indices) {
        val atual = numerosRomanos.getValue(numeroRomano[i])

        val proximo = when (i + 1) {
            numeroRomano.length -> 0
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }

        resultado = when{
            resultado ==0 && atual >= proximo -> {atual + proximo}
            resultado ==0 && atual < proximo ->  {(proximo - atual)}
            resultado !=0 && atual >= proximo -> {(resultado + proximo)}
            resultado !=0 && atual < proximo ->  {(resultado - atual) + (proximo - atual)}
            else -> 0
        }
    }

    print(resultado)

}