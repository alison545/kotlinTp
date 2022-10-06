package com.example.marketapp

class Empleado (): Persona("", 0, "", 0, Domicilio("",0)) {

    var idEmpleado:Int=0
    var cargo:String=""


    constructor(cargo:String):this() {
        this.cargo=cargo
    }

    fun revisarStock () {

    }

    override fun imprimirNombre() {
        println("El empleado es: ${this.nombre} , id: ${this.idEmpleado}")
    }

    override fun imprimirDomicilio() {
        println("El empleado vive en: ${this.domicilio.calle} ")
    }

}