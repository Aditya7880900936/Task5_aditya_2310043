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

class kmtomiles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kmtomiles)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.KilotoMiles)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton: Button = findViewById<Button>(R.id.Home_Button)

        homeButton.setOnClickListener{
            val intent = Intent(this@kmtomiles, MainActivity::class.java)
            startActivity(intent)
        }
        val edt : EditText = findViewById<EditText>(R.id.kmtext)
        val btn : Button = findViewById<Button>(R.id.milesConvertor)
        val resultText: TextView = findViewById<TextView>(R.id.milesResult)

        btn.setOnClickListener(){
            val kilos : Double = edt.text.toString().toDouble()

            resultText.setText("" + converttomiles(kilos) + " " + "miles")
        }
    }
    fun converttomiles(kilos : Double): Double{
        var miles = kilos * 0.621371

        return miles
    }
}