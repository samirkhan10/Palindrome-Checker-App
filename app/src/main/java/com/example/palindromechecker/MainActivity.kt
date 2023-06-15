package com.example.palindromechecker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonCheck = findViewById<Button>(R.id.ButtonCheck)
        val editText = findViewById<EditText>(R.id.editText)

        ButtonCheck.setOnClickListener {
            val value = editText.text.toString()
            if (ispalindrome(value)) {

                Toast.makeText(this, "Entered word is palindrome ", Toast.LENGTH_SHORT).show()
                editText.setText("")

            } else {
                Toast.makeText(this, "Entered word is not a Palindrome", Toast.LENGTH_SHORT).show()
                editText.setText("")

            }
        }

    }

    private fun ispalindrome(text: String): Boolean {
        val reverseString = text.reversed().toString()
        return text.equals(reverseString, ignoreCase = true)
    }
}