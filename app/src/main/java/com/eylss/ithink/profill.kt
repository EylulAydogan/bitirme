package com.eylss.ithink

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class profill : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profill)
    }


    fun goToAnasayfaClicked(view: View) {
        val intent= Intent(this,anasayfaa::class.java)
        startActivity(intent)
        finish()
    }

    fun exitClicked(view: View) {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}