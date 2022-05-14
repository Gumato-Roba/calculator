package com.example.calculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    lateinit var etAdd: EditText
    lateinit var etAdd2: EditText
    lateinit var btnAddition: Button
    lateinit var tvResult: TextView
    lateinit var btnSubstraction:Button
    lateinit var btnMultiplication:Button
    lateinit var btnModulus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etAdd = findViewById(R.id.etAdd)
        etAdd2 = findViewById(R.id.etAdd2)
        btnAddition =findViewById(R.id.btnAddition)
        tvResult=findViewById(R.id.tvResult)
        btnSubstraction= findViewById(R.id.btnSubstraction)
        btnMultiplication= findViewById(R.id.btnMultiplication)
        btnModulus= findViewById(R.id.btnModulus)


        btnAddition.setOnClickListener {
            var add = etAdd.text.toString().toInt()
            var add2 = etAdd2.text.toString().toInt()
            answer(add,add2)
        }
        btnSubstraction.setOnClickListener {
            var minus = etAdd.text.toString().toInt()
            var minus2=etAdd2.text.toString().toInt()
            result(minus,minus2)
        }
        btnMultiplication.setOnClickListener {
            var times =etAdd.text.toString().toInt()
            var times2 = etAdd2.text.toString().toInt()
            output(times, times2)
        }
        btnModulus.setOnClickListener {
            var reminder =etAdd.text.toString().toInt()
            var reminder2 =etAdd2.text.toString().toInt()
            solution(reminder,reminder2)
        }
        }
    fun answer(add:Int,add2:Int){
        var sum = add
        var sum2 = add2 + sum
        tvResult.text = sum2.toString()
    }
    fun result(minus:Int,minus2:Int){
        var subtract =minus
        var subtract2=subtract-minus2
        tvResult.text= subtract2.toString()
    }
    fun output(times:Int, times2:Int){
        var multiply = times
        var multiply2 = times2*multiply
        tvResult.text= multiply2.toString()
    }
    fun solution(reminder:Int, reminder2:Int){
        var modulus = reminder
        var modulus2 = reminder2%modulus
        tvResult.text= modulus2.toString()
    }
    }


