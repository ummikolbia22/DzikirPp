package com.ummi.dzikirpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        img_pagi.setOnClickListener {
            Intent(applicationContext, DzikirPagi::class.java).also {
                startActivity(it)
            }
        }

        img_sore.setOnClickListener {
            Intent(applicationContext, DzikirPetang::class.java).also {
                startActivity(it)
            }

        }
    }
}
