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

class meterFeet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_meter_feet)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.MetertoFeet)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton: Button = findViewById<Button>(R.id.Home_Button)

        homeButton.setOnClickListener{
            val intent = Intent(this@meterFeet , MainActivity::class.java)
            startActivity(intent)
        }
        val edt : EditText = findViewById<EditText>(R.id.meterText)
        val btn : Button = findViewById<Button>(R.id.feetConvertor)
        val resultText: TextView = findViewById<TextView>(R.id.feetResult)

        btn.setOnClickListener(){
            val meter: Double = edt.text.toString().toDouble()

            resultText.setText("" + converttofeet(meter) + " " + "feet")
        }
    }
    fun converttofeet(meter : Double): Double{
        var feet = meter * 3.28

        return feet
    }
}