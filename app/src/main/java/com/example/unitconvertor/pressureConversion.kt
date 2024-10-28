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

class pressureConversion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pressure_conversion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.MMtoBar)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton: Button = findViewById<Button>(R.id.Home_Button)

        homeButton.setOnClickListener{
            val intent = Intent(this@pressureConversion, MainActivity::class.java)
            startActivity(intent)
        }
        val edt : EditText = findViewById<EditText>(R.id.mmHGText)
        val btn : Button = findViewById<Button>(R.id.barConvertor)
        val resultText: TextView = findViewById<TextView>(R.id.barResult)

        btn.setOnClickListener(){
            val pressure : Double = edt.text.toString().toDouble()

            resultText.setText("" + converttobar(pressure) + " " + "bar")
        }
    }
    fun converttobar(pressure : Double): Double{
        var bar = pressure* 0.00133322

        return bar
    }
}