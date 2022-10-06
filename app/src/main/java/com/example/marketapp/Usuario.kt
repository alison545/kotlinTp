package com.example.marketapp

class Usuario(): Persona("", 0, "", 0,Domicilio("",0)) {

    var idComprador:Int=0
    var dinero:Int=0


    constructor(idComprador:Int,dinero:Int):this() {
        this.idComprador=idComprador
        this.dinero=dinero

    }

    override fun imprimirNombre() {
        println("El usuario es: ${this.nombre} , id: ${this.idComprador}")
    }

    override fun imprimirDomicilio() {
        println("El usuario vive en: ${this.domicilio.calle}")
    }

}