package com.example.marketapp

import android.text.BoringLayout

class Producto {

    var nombreProd:String=""
    var tipo:String=""
    var precio:Double=0.0
    var disponible:Boolean=false

    constructor(nombreProd:String, tipo:String,precio:Double,disponible:Boolean ) {
        this.nombreProd=nombreProd
        this.tipo=tipo
        this.precio=precio
        this.disponible=disponible
    }

    override fun toString(): String {
        return "Producto(nombreProd='$nombreProd', tipo='$tipo', precio=$precio, disponible=$disponible)"
    }


}