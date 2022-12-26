package com.eylss.ithink

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class anasayfaa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anasayfaa)
    }

    fun goToProfil(view: View) {
        val intent=Intent(this,profill::class.java)
        startActivity(intent)
        finish()
    }
}