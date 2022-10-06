package com.example.marketapp

open class Persona {

    var nombre : String=""
    var apellido: String=""
    var edad: Int=0
    var dni: Int=0
    var domicilio:Domicilio

    constructor(nombre: String, edad: Int, apellido: String, dni: Int, domicilio:Domicilio){
        this.nombre= nombre
        this.edad= edad
        this.apellido=apellido
        this.dni=dni
        this.domicilio=domicilio
    }

    open fun imprimirNombre(){

        println("La persona se llama ${this.apellido} ${this.nombre}")
    }

    open fun imprimirDomicilio(){
        println("La persona se llama ${domicilio.calle} ")
    }

}