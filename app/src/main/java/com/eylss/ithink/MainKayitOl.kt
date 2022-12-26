package com.eylss.ithink

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG

import com.eylss.ithink.databinding.ActivityMainKayitOlBinding


class MainKayitOl : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainKayitOlBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnKaydet.setOnClickListener{
            var kullaniciBilgisi = binding.kayitKullaniciAdi.text.toString()
            var kullaniciParola = binding.kayitParola.text.toString()
            var SharedPreferences = this.getSharedPreferences("bilgiler", MODE_PRIVATE)
            var editor = SharedPreferences.edit()



            // veri ekleme
            editor.putString("kullanici", "$kullaniciBilgisi").apply()
            editor.putString("parola", "$kullaniciParola").apply()
            Toast.makeText(applicationContext, "Kayıt Başarılı", LENGTH_LONG).show()
            println(kullaniciBilgisi)
            println(kullaniciParola)
            binding.kayitKullaniciAdi.text.clear()
            binding.kayitParola.text.clear()
        }



        binding.btnGiriseDon.setOnClickListener{
            intent = Intent(applicationContext, MainActivity:: class.java)
            startActivity(intent)

        }
    }

}