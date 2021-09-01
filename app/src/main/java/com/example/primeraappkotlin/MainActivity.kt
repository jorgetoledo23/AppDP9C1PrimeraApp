package com.example.primeraappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.primeraappkotlin.Model.User
import com.example.primeraappkotlin.Model.User2
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaracion de Variables

        var nombre:String
        nombre = "Jorge"

        var nombre2 = "Jorge" // String
        var edad = 10 // Int
        var PI = 3.14 // Double

        // Funciones

        fun Sumar(x: Int, y: Int): Int {
            return x + y
        }

        fun Sumar3(x: Int = 10, y: Int = 20): Int {
            return x + y
        }

        fun Sumar():Int{
            return 10 + 10
        }

        fun Sumar2(){
            var Suma:Int = 10 + 10
        }

        print(Sumar3())
        print(Sumar3(30,30))


        var Usuario:User
        //User Usuario = new Usuario() => Java
        Usuario = User() // Nacimiento/Creacion => Intanciacion
        Usuario.Apellido = "Fernandez"
        Usuario.Nombre = "Pedro"
        Log.i("INFO", Usuario.toString()) //I/INFO: com.example.primeraappkotlin.Model.User@c74fcda

        var Usuario2:User2
        Usuario2 = User2("Jorge", "Toledo")
        Log.i("INFO", Usuario2.toString()) //I/INFO: JORGE TOLEDO



    }

}