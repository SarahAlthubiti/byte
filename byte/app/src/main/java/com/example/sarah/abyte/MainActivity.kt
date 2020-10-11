package com.example.sarah.abyte

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sum = 0
        val sw1 = findViewById<Switch>(R.id.Switch1)
        val sw2 = findViewById<Switch>(R.id.Switch2)
        val sw4 = findViewById<Switch>(R.id.Switch4)
        val sw8 = findViewById<Switch>(R.id.Switch8)
        val sw16 = findViewById<Switch>(R.id.Switch16)
        val sw32 = findViewById<Switch>(R.id.Switch32)
        val sw64 = findViewById<Switch>(R.id.Switch64)
        val sw128 = findViewById<Switch>(R.id.Switch128)

        val tvClick = findViewById<TextView>(R.id.textView) as TextView
        var etClick = findViewById<EditText>(R.id.editText) as EditText


        sw1?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked) {
                sum += 1
            } else{
                sum -= 1
        }
            tvClick.setText(sum.toString())
            if(sum.toString().equals(editText?.getText().toString())) {
                etClick.setBackgroundColor(R.color.green)
            }else{
                etClick.setBackgroundColor(0)
            }
        })

        sw2?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked) {
                sum += 2
            } else{
                sum -= 2
            }
            tvClick.setText(sum.toString())
            if(sum.toString().equals(editText?.getText().toString())) {
                etClick.setBackgroundColor(R.color.green)
            }else{
                etClick.setBackgroundColor(0)
            }
        })

        sw4?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked) {
                sum += 4
            } else{
                sum -= 4
            }
            tvClick.setText(sum.toString())
            if(sum.toString().equals(editText?.getText().toString())) {
                etClick.setBackgroundColor(R.color.green)
            }else{
                etClick.setBackgroundColor(0)
            }
        })

        sw8?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked) {
                sum += 8
            } else{
                sum -= 8
            }
            tvClick.setText(sum.toString())
            if(sum.toString().equals(editText?.getText().toString())) {
                etClick.setBackgroundColor(R.color.green)
            }else{
                etClick.setBackgroundColor(0)
            }
        })

        sw16?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked) {
                sum += 16
            } else{
                sum -= 16
            }
            tvClick.setText(sum.toString())
            if(sum.toString().equals(editText?.getText().toString())) {
                etClick.setBackgroundColor(R.color.green)
            }else{
                etClick.setBackgroundColor(0)
            }
        })

        sw32?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked) {
                sum += 32
            } else{
                sum -= 32
            }
            tvClick.setText(sum.toString())
            if(sum.toString().equals(editText?.getText().toString())) {
                etClick.setBackgroundColor(R.color.green)
            }else{
                etClick.setBackgroundColor(0)
            }
        })

        sw64?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked) {
                sum += 64
            } else{
                sum -= 64
            }
            tvClick.setText(sum.toString())
            if(sum.toString().equals(editText?.getText().toString())) {
                etClick.setBackgroundColor(R.color.green)
            }else{
                etClick.setBackgroundColor(0)
            }
        })

        sw128?.setOnCheckedChangeListener({ _ , isChecked ->
            if(isChecked) {
                sum += 128
            } else{
                sum -= 128
            }
            tvClick.setText(sum.toString())
            if(sum.toString().equals(editText?.getText().toString())) {
                etClick.setBackgroundColor(R.color.green)
            }else{
                etClick.setBackgroundColor(0)
            }
        })



    }


}
