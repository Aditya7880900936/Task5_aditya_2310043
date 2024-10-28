package com.example.unitconvertor

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val celciusKelvin = findViewById<androidx.cardview.widget.CardView>(R.id.CelKel)

        celciusKelvin.setOnClickListener{
            val intent = Intent(this@MainActivity, CelciusKelvin::class.java)
            startActivity(intent)
        }
        val Kilotopound= findViewById<androidx.cardview.widget.CardView>(R.id.kgtopound)

        Kilotopound.setOnClickListener{
            val intent = Intent(this@MainActivity, kgtopound::class.java)
            startActivity(intent)
        }
        val Kmtomiles = findViewById<androidx.cardview.widget.CardView>(R.id.KilotoMilestone)

        Kmtomiles.setOnClickListener{
            val intent = Intent(this@MainActivity, kmtomiles::class.java)
            startActivity(intent)
        }
        val metertofeet = findViewById<androidx.cardview.widget.CardView>(R.id.metertofeet)

        metertofeet.setOnClickListener{
            val intent = Intent(this@MainActivity, meterFeet::class.java)
            startActivity(intent)
        }
        val pressure = findViewById<androidx.cardview.widget.CardView>(R.id.pressure)

        pressure.setOnClickListener{
            val intent = Intent(this@MainActivity, pressureConversion::class.java)
            startActivity(intent)
        }
        val arrea = findViewById<androidx.cardview.widget.CardView>(R.id.areaconversion)

        arrea.setOnClickListener{
            val intent = Intent(this@MainActivity, sqmtoacre::class.java)
            startActivity(intent)
        }




    }
}

