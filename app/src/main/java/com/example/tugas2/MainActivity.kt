package com.example.tugas2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun menu2(view: View) {

        val text = "doesn't have account? Register"
        val ss = SpannableStringBuilder(text)
        ss.setSpan(
            ForegroundColorSpan(Color.WHITE),
            23,
            30,
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE
        )
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)







    }
}
