package com.eylss.ithink

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eylss.ithink.databinding.ActivityMainHosgeldinizBinding

class MainHosgeldiniz : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    //lateinit var binding : ActivityMainHosgeldinizBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainHosgeldinizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // xmlden verileri çekme
        preferences = getSharedPreferences("bilgiler", MODE_PRIVATE)
        var kayitliKullanici = preferences.getString("kullanici", "")

        var kayitliParola = preferences.getString("parola", "")
        println("kayitliParola"+ kayitliParola)
        // textViewlere kayıtlı bilgileri aktarma
        binding.kullaniciBilgisi.text = "Kullanıcı Adı= "+kayitliKullanici.toString()
        binding.kullaniciParola.text = "Kullanıcı Parolası= "+kayitliParola.toString()
        // Çıkış Yap
        binding.btnCikisYap.setOnClickListener{
            intent = Intent(applicationContext, MainActivity:: class.java)
            startActivity(intent)
            finish()
        }
    }
}