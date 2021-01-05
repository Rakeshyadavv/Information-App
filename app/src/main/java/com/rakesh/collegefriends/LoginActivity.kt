package com.rakesh.collegefriends

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var etmobilenumber : EditText
    lateinit var etpassword : EditText
    lateinit var btnLogin :Button
    lateinit var txtforgotpassword : TextView
    lateinit var txtregister : TextView
    val validmobilenumber = "123456789"
    val validpassword = "Ministers"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        title="Log In"
        etmobilenumber = findViewById(R.id.etmobilenumber)
        etpassword = findViewById(R.id.etpassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtforgotpassword = findViewById(R.id.txtforgotpassword)
        txtregister = findViewById(R.id.txtregister)


        btnLogin.setOnClickListener{
            val mobilenumber = etmobilenumber.text.toString()
            val password = etpassword.text.toString()
            val intent=Intent(this@LoginActivity, MainActivity::class.java)
            val nameof: String
            if((mobilenumber==validmobilenumber) && (password==validpassword)) {
                nameof = "Ministers"
                intent.putExtra("Name", nameof)

                startActivity(intent)
            }

            else{
            Toast.makeText(this@LoginActivity, "Invalid Credentials", Toast.LENGTH_LONG).show()
        }
            

        }

        }
    override fun onPause() {
        super.onPause()
        finish()
    }


}