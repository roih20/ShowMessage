package com.example.showmessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var showMessage: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        showMessage()
    }

   private fun bind() {
        editText = findViewById(R.id.entry_message)
        showMessage = findViewById(R.id.txt_message)
        button = findViewById(R.id.btn_action)
    }

    private fun showMessage() {
        button.setOnClickListener {
            showMessage.text = editText.text.toString()
        }
    }
}