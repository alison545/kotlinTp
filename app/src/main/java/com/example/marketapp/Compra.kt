package com.example.marketapp

class Compra {

    var empleado:Empleado
    var usuario:Usuario
    var compraList:List<Producto>


    constructor(compraList:List<Producto>,empleado: Empleado,usuario: Usuario) {
        this.compraList=compraList
        this.usuario=usuario
        this.empleado=empleado
    }


    fun comprar(listCompras: List<Producto>) :Double{
        var suma:Double=0.0
        for (p in listCompras) {
            println("Compras: ${p.nombreProd}")
            if(p.disponible==true) {
                println("Producto disponible")
            }
            suma+=p.precio
        }
        return suma
    }

    fun comprar(total:Double, dineroUsuario:Int) :Double {

        var dinero= dineroUsuario.toDouble()
        var resta:Double=0.0

        if (dinero>total) {

            resta= dinero-total
        }
        return resta

    }

    fun imprimirTicket() {

        println("Usuario ${usuario.nombre} con ${usuario.idComprador} ---------------")
        println("Usuario ${empleado.nombre} con ${empleado.idEmpleado} ---------------")
    }

}