package com.example.unitconvertor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.unitconvertor.CelciusKelvin

class kgtopound : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kgtopound)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.KilotoPound)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton: Button = findViewById<Button>(R.id.Home_Button)

        homeButton.setOnClickListener{
            val intent = Intent(this@kgtopound , MainActivity::class.java)
            startActivity(intent)
        }
        val edt : EditText = findViewById<EditText>(R.id.kgText)
        val btn : Button = findViewById<Button>(R.id.poundConvertor)
        val resultText: TextView = findViewById<TextView>(R.id.poundResult)

        btn.setOnClickListener(){
            val kilos : Double = edt.text.toString().toDouble()

            resultText.setText("" + converttoPound(kilos) + " " + "Pound")
        }
    }
    fun converttoPound(kilos : Double): Double{
        var Pound = kilos * 2.23

        return Pound
    }
}