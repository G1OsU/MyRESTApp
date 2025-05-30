package com.example.myrestapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import java.security.MessageDigest

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val email = findViewById<TextView>(R.id.input_email)
        val password = findViewById<TextView>(R.id.input_password)


        val menu = findViewById<Button>(R.id.btn_Login)
        menu.setOnClickListener{

            val email_input = email.text.toString()
            val password_input = password.text.toString()
            val pass= md5("$password_input")
            input_check(email_input,pass)
        }

    }

    fun input_check(email_input:String,pass:String){
        val email = credenziali["email"]
        val password = credenziali["password"]

        if (email == email_input && password == pass){
            start_activity(MenuActivity::class.java)
            Toast.makeText(this, "Login Avvenuto!", Toast.LENGTH_SHORT).show()

        } else{
            Toast.makeText(this, "Errore Credenziali!", Toast.LENGTH_SHORT).show()
        }


    }

    fun start_activity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }

    val credenziali = mapOf( //array associativo
        "email" to "admin@gmail.com",
        "password" to "e10adc3949ba59abbe56e057f20f883e" //password md5 (123456)
    )

    fun md5(input: String): String {
        // Crea un'istanza di MessageDigest per MD5
        val digest = MessageDigest.getInstance("MD5")

        // Calcola il valore hash della stringa
        val hashBytes = digest.digest(input.toByteArray())

        // Converte l'array di byte in una stringa esadecimale
        return hashBytes.joinToString("") { "%02x".format(it) }
    }

}



