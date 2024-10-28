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

class sqmtoacre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sqmtoacre)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.SqmtoAcre)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeButton: Button = findViewById<Button>(R.id.Home_Button)

        homeButton.setOnClickListener{
            val intent = Intent(this@sqmtoacre, MainActivity::class.java)
            startActivity(intent)
        }
        val edt : EditText = findViewById<EditText>(R.id.m_sq_Text)
        val btn : Button = findViewById<Button>(R.id.AcreConvertor)
        val resultText: TextView = findViewById<TextView>(R.id.AcreResult)

        btn.setOnClickListener(){
            val meterSquare : Double = edt.text.toString().toDouble()

            resultText.setText("" + converttoacre(meterSquare) + " " + "Acre")
        }
    }
    fun converttoacre(metersq: Double): Double{
        var acre = metersq * 0.000247

        return acre
    }
}