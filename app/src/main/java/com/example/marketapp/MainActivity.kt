package com.example.marketapp

fun main () {
    var opcion:Int=0

    while (opcion!=7){
        opcion =menu()

        var p1=Producto("Oreos","Galletas",100.0,true)
        var p2=Producto("Lays","Snack",200.0,true)
        var p3=Producto("Seven Up","Gaseosa",180.0,true)
        var usuario=Usuario()
        usuario.nombre="Alison"
        usuario.apellido="Morel"
        usuario.dni=12345678
        usuario.edad=23
        usuario.idComprador=1
        usuario.dinero=2000
        usuario.domicilio.calle="Rivadavia"
        usuario.domicilio.numero=123

        var empleado=Empleado()
        empleado.nombre="Alison"
        empleado.apellido="Morel"
        empleado.dni=12345678
        empleado.edad=23
        empleado.idEmpleado=1
        empleado.cargo="Cajero"
        empleado.domicilio.calle="Corrientes"
        empleado.domicilio.numero=9999

        if(opcion==1) {
            var respuesta:Int=0
            var p2=Producto("Lays","Snack",200.0,true)
            while(respuesta==0) {
                println("Desea agregar mas? Contestar 0=Si, 1=No")
                respuesta= readLine()!!.toInt()//por 3era vez creamos otro producto
                var p3=Producto("Seven Up","Gaseosa",180.0,true)
            }
            println(p1.toString())
            println(p2.toString())
            println(p3.toString())
        }
        else {
            var lista = listOf<Producto>(p1,p2,p3)
            var compra=listOf<Producto>(p1,p3)
            var stock1=Stock(lista,3)
            var compra1=Compra(compra,empleado,usuario)
            if(opcion==2) {
                //println(lista)
                stock1.mostrarStock(lista)
            } else {
                    if(opcion==3) {
                        println("Ticket----------------------------")
                        usuario.imprimirNombre()
                        usuario.imprimirDomicilio()
                        empleado.imprimirNombre()
                        empleado.imprimirDomicilio()
                       var total =compra1.comprar(compra)
                       var vuelto= compra1.comprar(total,usuario.dinero)
                        println("TOTAL....................................${total}")
                        println("VUELTO..................${vuelto}")
                    }
            }

        }

    }

    println("Gracias por comprar en carrefour, vuelva pronto!")

}

fun menu() :Int{
    println("----------------Bienvenidos a carrefour-----------")

    println("1- Crear producto")
    println("2- consultar stock")
    println("3- Comprar")
    println("Ingrese la opcion a elegir: ")
    var op: Int = readLine()!!.toInt()

    return op
}

