package com.example.mathematics_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mathematics_project.R.id
import com.google.android.material.snackbar.Snackbar


class MainActivity8 : AppCompatActivity() {
    private var total =0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main8)

        val inputField: EditText = findViewById(id.inputField)
        val addButton: Button = findViewById(id.addButton)
        val subButton: Button = findViewById(id.subButton)
        val mulButton: Button = findViewById(id.mulButton)
        val divButton: Button = findViewById(id.divButton)
        val resultView: TextView = findViewById(id.resultView)
        val clearButton: Button = findViewById(id.clearButton)
        val ib1 = findViewById<ImageButton>(R.id.imageButton1)
        val ib2 = findViewById<ImageButton>(R.id.imageButton2)
        val ib3 = findViewById<ImageButton>(R.id.imageButton3)
        ib1.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
        }
        ib2.setOnClickListener{
            startActivity(Intent(this,MainActivity8::class.java))
        }
        ib3.setOnClickListener{
            startActivity(Intent(this,MainActivity9::class.java))
        }
        addButton.setOnClickListener {
            val input = inputField.text.toString()
            if (input.isNotEmpty()) {
                val number = input.toDouble()
                total += number
                resultView.text = "Result: $total"
                inputField.text.clear()
            } else {
                Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show()
            }
        }
        subButton.setOnClickListener {
            val input = inputField.text.toString()
            if (input.isNotEmpty()) {
                val number = input.toDouble()
                total -= number
                resultView.text = "Result: $total"
                inputField.text.clear()
            } else {
                Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show()
            }
        }
        mulButton.setOnClickListener {
            val input = inputField.text.toString()
            if (input.isNotEmpty()) {
                val number = input.toDouble()
                total = total*number
                resultView.text = "Result: $total"
                inputField.text.clear()
            } else {
                Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show()
            }
        }
        divButton.setOnClickListener {
            val input = inputField.text.toString()
            if (input.isNotEmpty() && (!input.equals(0.0) )) {
                val number = input.toDouble()
                total = total/number
                resultView.text = "Result: $total"
                inputField.text.clear()
            } else {
                Toast.makeText(this, "Enter a number", Toast.LENGTH_SHORT).show()
            }
        }
        clearButton.setOnClickListener{
            total = 0.0
            inputField.text.clear()
            resultView.text="Result:$total"
            Toast.makeText(this, "Cleared" , Toast.LENGTH_SHORT).show()
        }
    }
}