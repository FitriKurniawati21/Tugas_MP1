package com.example.tugasintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnHome : Button
    private lateinit var btnProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_home)
        btnHome.setOnClickListener(this)

        btnProfile = findViewById(R.id.btn_profil)
        btnProfile.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_home ->{
                val HomePertama = Intent(this@MainActivity, HomeActivity::class.java)
                    startActivity(HomePertama)
            }
        }
    }


    }

