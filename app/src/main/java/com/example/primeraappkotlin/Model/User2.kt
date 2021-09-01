package com.example.primeraappkotlin.Model

class User2 (Nombre:String, Apellido:String) {

    val nombre = Nombre.uppercase()
    val apellido = Apellido.uppercase()

    override fun toString(): String {
        return this.nombre + " " + this.apellido
    }

}