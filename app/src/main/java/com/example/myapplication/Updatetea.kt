package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Updatetea : AppCompatActivity() {


    private lateinit var tvTeaId : TextView
    private lateinit var tvTeaName : TextView
    private lateinit var tvTeaType : TextView
    private lateinit var tvTeaPrice : TextView
    private lateinit var tvTeaRet : TextView
    private lateinit var btnUpdate  : Button
    private lateinit var btnDelete : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_updatetea)

        initView()
        setValuesToViews()

    }



    private fun initView(){

        tvTeaId = findViewById(R.id.tvTeaId)
        tvTeaName = findViewById(R.id.tvTeaName)
        tvTeaType = findViewById(R.id.tvTeaType)
        tvTeaPrice = findViewById(R.id.tvTeaPrice)
        tvTeaRet = findViewById(R.id.tvTeaRet)

        btnDelete= findViewById(R.id.btnDelete)
        btnUpdate= findViewById(R.id.btnUpdate)

    }

    private fun setValuesToViews(){

        tvTeaId.text = intent.getStringExtra("teaId")
        tvTeaName.text = intent.getStringExtra("teaBrand")
        tvTeaType.text = intent.getStringExtra("teaType")
        tvTeaPrice.text = intent.getStringExtra("teaPrice")
        tvTeaRet.text = intent.getStringExtra("teaRetting")
    }


}