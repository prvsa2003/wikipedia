package com.example.wikipedia_test.Activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.example.wikipedia_test.Data.ItemPost
import com.example.wikipedia_test.Fragment.SEND_DATA_TO_SECOND_DITAIL_ACTIVITY
import com.example.wikipedia_test.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarAsli)

        binding.collapsingMain.setExpandedTitleColor(ContextCompat.getColor( this , android.R.color.transparent))

        supportActionBar!!.setHomeButtonEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val datapost = intent.getParcelableExtra<ItemPost>(SEND_DATA_TO_SECOND_DITAIL_ACTIVITY)
        if(datapost != null){
            showdata(datapost)
        }

    }

    private fun showdata(itemPost: ItemPost) {
                Glide
                    .with(this)
                    .load(itemPost.imgurl)
                    .into(binding.imgDetail)
        binding.txtDetailTitle.text = itemPost.txtTtle
        binding.txtDetailSubtitle.text = itemPost.txtSubTitle
        binding.txtDetailText.text = itemPost.txtDitail


        binding.fabmain.setOnClickListener {
            val url = itemPost.site
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