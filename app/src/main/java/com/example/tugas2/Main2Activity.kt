package com.example.tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        checkBox.setOnClickListener(View.OnClickListener {
            if (checkBox.isChecked) {
                (checkBox.text.toString() + "Checked")
            }else{
                (checkBox.text.toString() + "Uncheked")
            }
        })

    }

    fun menu3(view: View) {
        val intent = Intent(this, Main3Activity::class.java)
        startActivity(intent)
    }

}
