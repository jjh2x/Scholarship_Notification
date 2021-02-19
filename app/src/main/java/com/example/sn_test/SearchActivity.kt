package com.example.sn_test

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    lateinit var btn_in : Button
    lateinit var btn_out : Button
    lateinit var btn_serve : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_search) //이거는 한번만 써도 되나?
        btn_in = findViewById<Button>(R.id.btn_in)
        btn_in.setOnClickListener(){

            //sortedSetOf() 버튼 누르면 sort로 정렬해야함

            btn_in.setBackgroundColor(R.drawable.btn_in_clicked)
        }

        setContentView(R.layout.fragment_search)
        btn_out = findViewById<Button>(R.id.btn_out)
        btn_out.setOnClickListener() {
            //sortedSetOf() 버튼 누르면 sort로 정렬해야함 Sch_criteria or sch_sort로 정렬?? //
            btn_out.setBackgroundColor(R.drawable.btn_in_clicked)
        }

        setContentView(R.layout.fragment_search)
        btn_serve = findViewById<Button>(R.id.btn_serve)
        btn_serve.setOnClickListener() {
            //sortedSetOf() 버튼 누르면 sort로 정렬해야함
        btn_serve.setBackgroundColor(R.drawable.btn_in_clicked)}
    }

}