package com.example.wikipedia_test.Activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.wikipedia_test.R
import com.example.wikipedia_test.databinding.ActivityMain3Binding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

       setSupportActionBar(binding.toolbarmain)
        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


        Glide.with(this)
            .load(R.drawable.translater)
            .transform(RoundedCornersTransformation(32 , 8))
            .into(binding.imageView2)


        binding.button2.setOnClickListener {
            val url = "https://translate.google.com/?hl=fa"
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse(url))
            startActivity(intent)
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId == android.R.id.home){


            onBackPressed()
        }
        return true
    }
}