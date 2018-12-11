package com.example.thinking.myapplication_in_kotlin

import javax.security.auth.callback.Callback

var apellido:String? = null


var subapellido3:String = apellido!!.substring(0,1)

val id:String by lazy{"123"} //la primera vez es 123, solo cuando se usa toma este valor e un delegado ejeje

//funciones

//de primer orden

fun sumar(n1:Int, n2:Int):Int{
    return n1 + n2
}

fun sumar2 (n1:Int, n2:Int = 0):Int = n1 + n2

var rta = sumar2(3, 5)
var rta2 = sumar2(3)

var rta3 = sumar2(n2=6, n1 = 9)


var sub: (n1:Int, n2:Int)-> Int = {n1, n2 -> n1 -n2} //lamda

var rta6 = sub(7, 7)

fun operar(n1:Int, n2:Int, callback: (rta:Int)-> Unit){
    callback(  n1 + n2)
}


func testoperar(){


    operar(1,2 {rta-> println("resultado: $rta")}



}


class Usuario (val nombre:String, var correo:String)

val usr = Usuario("dario", "hola")

val n = usr.nombre

fun testUsuario (){
    usr.correo = "holaeeeegg"
}

// inicializar variables
//open para poder heredar

open class  Mascota(val edad: Int, val raza:String){

    var edadHymana:Int =0

    init {
        edadHymana = 7 * edad
    }
}

//constructor secundario

class Conejo (val nombre:String, val edad:Int):Mascota(edad, "Conejo"){

    constructor():this("", 0)

    fun comer(comida:Int){

    }

    //sobrescribir operadores
    operator fun plus(conejo:Conejo):Conejo{

        return Conejo(conejo.nombre, this.edad)
    }
}

val a = Conejo("a", 9)
val b= Conejo("b", 7)
val c = a + b