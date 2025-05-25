package com.example.helloworldpopupapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
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
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                builder.setMessage(Html.fromHtml(getString(R.string.popup_message), Html.FROM_HTML_MODE_LEGACY))
            } else {
                @Suppress("DEPRECATION")
                builder.setMessage(Html.fromHtml(getString(R.string.popup_message)))
            }
            builder.setPositiveButton(R.string.ok_button_text) { dialog, _ ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }
    }
}
