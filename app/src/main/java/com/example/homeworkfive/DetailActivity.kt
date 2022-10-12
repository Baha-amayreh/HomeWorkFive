package com.example.homeworkfive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        if(intent.hasExtra("image") && intent.hasExtra("name")&& intent.hasExtra("detail")){
            var image =intent.getIntExtra("image",0)
            var name = intent.getStringExtra("name")
            var x = intent.getStringExtra("detail")
            item2.text = name.toString()
            info.text = x.toString()
            image4.setImageResource(image)
        }
    }
}