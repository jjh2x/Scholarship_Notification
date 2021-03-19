package com.example.sn_test

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    lateinit var btn_LogIn : Button
    lateinit var spinner_MajorChoice : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_view)
        btn_LogIn = findViewById<Button>(R.id.btn_LogIn)
        spinner_MajorChoice = findViewById<Spinner>(R.id.spinner_MajorChoice)

        MajorChoice()

        // 로그인 버튼 클릭하면 진행하는 동작
        btn_LogIn.setOnClickListener{
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
        }


    }

    private fun MajorChoice() {

        // 스피너 사용 위한 resources 불러오기.
        val items_majorChoice = resources.getStringArray(R.array.majorChoice)

        val spinnerAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items_majorChoice)
        spinner_MajorChoice.adapter = spinnerAdapter

        //스피너의 동작을 감지하는 listener
        spinner_MajorChoice.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
               when(position) {
                   1 -> {}
                   2 -> {}
                   3 -> {}
                   4 -> {}
                   5 -> {}
                   6 -> {}
                   7 -> {}
                   8 -> {}
                   9 -> {}
                   10 -> {}
                   11 -> {}
                   12 -> {}
               }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
        // 스피너 목록선택전 초기 화면 어떤 걸로 보여줄지 결정.
        spinner_MajorChoice.setSelection(0)
    }
}