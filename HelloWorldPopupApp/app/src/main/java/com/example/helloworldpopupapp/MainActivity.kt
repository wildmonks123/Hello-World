package com.example.helloworldpopupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.helloButton)
        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.popup_title)
            builder.setMessage(R.string.popup_message)
            builder.setPositiveButton(R.string.ok_button_text) { dialog, _ ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }
    }
}
