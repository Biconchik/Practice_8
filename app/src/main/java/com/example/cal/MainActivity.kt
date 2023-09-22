package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.cal.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Button14.setOnClickListener {setTextFields("0")}
    }
    fun sum (a: Double, b: Double): Double
    {
        return a+b
    }

    fun sub (a: Double, b: Double): Double
    {
        return a-b
    }

    fun mul (a: Double, b: Double): Double //multiplication
    {
        return a*b
    }

    fun div (a: Double, b: Double): Double
    {
        return a/b
    }
}