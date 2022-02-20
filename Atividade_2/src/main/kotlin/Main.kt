fun main(args: Array<String>) {

    val calculos = Fisica()

    println("Massa: ")
    val m : Float = readLine()!!.toFloat()

    println("Aceleração Gravidade: ")
    val g : Float = readLine()!!.toFloat()

    println("Velocidade: ")
    val v : Float = readLine()!!.toFloat()

    println("Raio: ")
    val r : Float = readLine()!!.toFloat()

    println("Força: ")
    val f : Float = readLine()!!.toFloat()

    println("Variação do Tempo: ")
    val deltaT : Float = readLine()!!.toFloat()

    println("Constante Elástica: ")
    val k : Float = readLine()!!.toFloat()

    println("Deformação: ")
    val x : Float = readLine()!!.toFloat()

    println("Deslocamento: ")
    val deltaS : Float = readLine()!!.toFloat()

    println("Posição Inicial: ")
    val sInicial : Float = readLine()!!.toFloat()

    println("Velociade Inicial: ")
    val vInicial : Float = readLine()!!.toFloat()

    println("Aceleração: ")
    val a : Float = readLine()!!.toFloat()

    println("Tempo: ")
    val t : Float = readLine()!!.toFloat()

    val forcaPeso = calculos.forcaPeso(m , g)
    val forcaCentripeta = calculos.forcaCentripeta(m , v , r)
    val impulso = calculos.impulso(f , deltaT)
    val forcaElastica = calculos.forcaElastica(k , x)
    val velocidadeMedia = calculos.velocidadeMedia(deltaS , deltaT)
    val mru = calculos.mru(sInicial , v , deltaT)
    val mruv = calculos.mruv(vInicial , a , t)

    println("Força Peso: $forcaPeso")
    println("Força Centrípeta: $forcaCentripeta")
    println("Impulso: $impulso")
    println("Força Elástica: $forcaElastica")
    println("Velocidade Média: $velocidadeMedia")
    println("MRU: $mru")
    println("MRUV: $mruv")

}