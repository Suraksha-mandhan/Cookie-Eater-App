package com.example.cookieeater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        eat_cookie_btn.setOnClickListener{
            text_msg.text="I'm so full :)"
            back_img.setImageResource(R.drawable.after_cookie)
        }
    }
}
