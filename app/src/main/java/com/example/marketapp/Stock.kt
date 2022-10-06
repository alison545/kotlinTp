package com.example.marketapp

class Stock {


    var stockList: List<Producto>
    var contadorProductos:Int=0
    var disponible:Boolean=false

    //aca cargaria los productos

    constructor(stockList: List<Producto>, contadorProductos:Int) {

        this.stockList=stockList
        this.contadorProductos=contadorProductos
    }

    fun preguntarCuantosAgregarAStock( ) :Int {
        var resp=0
        println("Agregar otro producto?")
         resp=readLine()!!.toInt()

        return resp
    }



    fun mostrarStock(productoList: List<Producto>) {
        for (producto in productoList) {
            println("Producto - Nombre: ${producto.nombreProd}, Tipo: ${producto.tipo}, precio: ${producto.precio}")
        }
    }


}