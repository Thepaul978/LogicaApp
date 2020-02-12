package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica.*

class LogicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica)
        initViews()
    }

    private fun initViews() {
        button.setOnClickListener {
            checkInput()
        }
    }

    private fun checkInput() {
        var count: Int = 0;
        if (editText.text.toString().toLowerCase() == "t") {
            count++;
        }
        if (editText2.text.toString().toLowerCase() == "f") {
            count++;
        }
        if (editText3.text.toString().toLowerCase() == "f") {
            count++;
        }
        if (editText4.text.toString().toLowerCase() == "f") {
            count++;
        }
        Toast.makeText(this, "The Correct number of answers is: " + count, Toast.LENGTH_SHORT).show()
    }
}
