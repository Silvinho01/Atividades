import kotlin.math.pow

class Fisica {

    //Fórmula -- P(peso) = m(massa) * g(aceleração da gravidade) --
    fun forcaPeso(m : Float , g : Float): Float{
        return m * g
    }

    //Fórmula -- F(força centrípeta) = m(massa) * V(velocidade)²/r(raio) --
    fun forcaCentripeta(m : Float , v : Float , r : Float): Float{
        return m * v.pow(2)/r
    }

    //Fórmula -- I(impulso) = F(forca aplicada) * ▲t(variacao do tempo) --
    fun impulso(f : Float , deltaT : Float): Float{
        return f * deltaT
    }

    //Fórmula -- Fe(força elástica) = k(constante elástica) * X(deformação) --
    fun forcaElastica(k : Float , x : Float): Float{
        return k * x
    }

    //Fórmula -- Vm(velocidade média) = ▲S(deslocamento) / ▲t(variação do tempo) --
    fun velocidadeMedia(deltaS : Float , deltaT : Float): Float{
        return deltaS / deltaT
    }

    //Fórmula -- S(posição final) = Sσ(posição inicial) + V(valocidade) * ▲t(variação do tempo) --
    fun mru(sInicial : Float , v : Float , deltaT : Float): Float{
        return sInicial + v * deltaT
    }

    //Fórmula -- V(velocidade) = Vσ(velocidade inicial) + a(aceleração) * t(tempo) --
    fun mruv(vInicial : Float , a : Float , t : Float): Float{
        return vInicial + a * t
    }

}