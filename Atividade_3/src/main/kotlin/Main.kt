fun main(args: Array<String>) {

    do{

        println("ATIVIDADES!!")
        print("1 - EXERCÍCIO 1\n" +
                "2 - EXERCÍCIO 2\n" +
                "3 - EXERCÍCIO 3\n" +
                "4 - EXERCÍCIO 4\n" +
                "5 - SAIR\n" +
                "--->  ")

        val choose = readLine()!!.toInt()

        when (choose) {
            1 -> {exercise1()}
            2 -> {exercise2()}
            3 -> {exercise3()}
            4 -> {exercise4()}
            5 -> {println("GOODBYE!!")}
            else -> {println("ERROR\n" +
                    "OPTION NOT FOUND\n")}
        }

    } while(choose != 5)

}

fun exercise1(): Unit{

    do{

        print("LADO 1:\n" +
                "--->  ")
        val l1 = readLine()!!.toFloat()
        print("LADO 2:\n" +
                "--->  ")
        val l2 = readLine()!!.toFloat()
        print("LADO 3:\n" +
                "--->  ")
        val l3 = readLine()!!.toFloat()

        if(l1 - l2 < l3 || l2 - l3 < l1 || l3 - l1 < l2 && l1 + l2 > l3 || l2 + l3 > l1 || l3 + l1 > l2){

            if (l1 == l2 && l2 == l3 && l3 == l1){
                println("Triângulo Equilátero")
            }else if(l1 == l2 && l2 != l3 || l2 == l3 && l3 != l1 || l3 == l1 && l1 != l2){
                println("Triângulo Isósceles")
            }else{
                println("Triângulo Escaleno")
            }

        }else{
            println("Não é um triângulo!!!")
        }

        var choose : Int

        do {

            print("Testar novamente?\n" +
                    "1 - SIM 2 - NÃO\n" +
                    "--->  ")

            choose = readLine()!!.toInt()

            if (choose < 1 && choose > 2){
                println("Opção inválida\n")
            }

        }while (choose < 1 && choose > 2)

    } while (choose != 2)

}

fun exercise2(): Unit{

    do {

        print("ANO:\n" +
                "--->  ")
        val ano = readLine()!!.toInt()

        if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
            println("$ano é um ano BISSEXTO")
        }else{
            println("$ano não e um ano BISSEXTO")
        }

        var choose : Int

        do {

            print("Testar novamente?\n" +
                    "1 - SIM 2 - NÃO\n" +
                    "--->  ")

            choose = readLine()!!.toInt()

            if (choose < 1 && choose > 2){
                println("Opção inválida\n")
            }

        }while (choose < 1 && choose > 2)

    } while (choose != 2)

}

fun exercise3(): Unit{

    do {

        print("Telefonou para a vítima? 1-SIM  2-NÃO\n" +
                "---> ")
        var resposta : Int= readLine()!!.toInt()

        var contagem : Int = 0

        if (resposta == 1){
            contagem += 1
        }
        print("Esteve no local do crime? 1-SIM  2-NÃO\n" +
                "--->  ")
        resposta = readLine()!!.toInt()
        if (resposta == 1){
            contagem += 1
        }
        print("Mora perto da vítima? 1-SIM  2-NÃO\n" +
                "--->  ")
        resposta = readLine()!!.toInt()
        if (resposta == 1){
            contagem += 1
        }
        print("Devia para a vítima? 1-SIM  2-NÃO\n" +
                "--->  ")
        resposta = readLine()!!.toInt()
        if (resposta == 1){
            contagem += 1
        }
        print("Já trabalhou com a vítima? 1-SIM  2-NÃO\n" +
                "--->  ")
        resposta = readLine()!!.toInt()
        if (resposta == 1){
            contagem += 1
        }

        println("$contagem")

        if(contagem == 2){
            println("SUSPEITO")
        }else if (contagem >= 3 && contagem <= 4){
            println("CÚMPLICE")
        }else if (contagem >= 5){
            println("ASSASSINO")
        }else{
            println("INOCENTE")
        }

        var choose : Int

        do {

            print("Testar novamente?\n" +
                    "1 - SIM 2 - NÃO\n" +
                    "--->  ")

            choose = readLine()!!.toInt()

            if (choose < 1 && choose > 2){
                println("Opção inválida\n")
            }

        }while (choose < 1 && choose > 2)

    } while (choose != 2)
    
}

fun exercise4(): Unit{

    do {

        var valor : Float
        println("TABELA DE PREÇOS\n" +
                "ÁLCOOL:\n" +
                "- Até 20L: 3% de desconto por litro\n" +
                "- Acima de 20L: 5% de desconto por litro\n" +
                "\n" +
                "GASOLINA:\n" +
                "- Até 20L: 4% de desconto por litro\n" +
                "- Acima de 20L: 6% de desconto por litro\n")

        print("Escolha o combustível\n" +
                "1 - ÁLCOOL      2- GASOLINA\n" +
                "--->  ")
        val gas = readLine()!!.toInt()

        if (gas >= 1 || gas <= 2){

            print("Quantidade de litros\n" +
                    "---> ")
            val litros = readLine()!!.toInt()

            if (gas == 1){

                if(litros <= 20){
                    valor = litros * 3.888f
                    valor = valor - (valor / 100 * 3 )
                    println("A - $valor R$")
                }else{
                    valor = litros * 3.888f
                    valor = valor - (valor / 100 * 5 )
                    println("A - $valor R$")
                }

            }else{

                if(litros <= 20){
                    valor = litros * 6.513f
                    valor = valor - (valor / 100 * 4 )
                    println("G - $valor R$")
                }else{
                    valor = litros * 6.513f
                    valor = valor - (valor / 100 * 6 )
                    println("G - $valor R$")
                }

            }

        }else{
            println("OPÇÃO INVÁLIDA!!!")
        }

        var choose : Int

        do {

            print("Testar novamente?\n" +
                    "1 - SIM 2 - NÃO\n" +
                    "--->  ")

            choose = readLine()!!.toInt()

            if (choose < 1 && choose > 2){
                println("Opção inválida\n")
            }

        }while (choose < 1 && choose > 2)

    } while (choose != 2)

}