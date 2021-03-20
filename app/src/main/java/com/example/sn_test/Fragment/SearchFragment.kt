package com.example.sn_test.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sn_test.Adpater.SearchRvAdapter
import com.example.sn_test.R

class SearchFragment : Fragment() {
    var schList = arrayListOf<Sch_List>(
        Sch_List("장학금2", "분류조건2"),
        Sch_List("장학금3", "분류조건3"),
        Sch_List("장학금4", "분류조건4"),
        Sch_List("장학금5", "분류조건5"),
        Sch_List("장학금6", "분류조건6"),
        Sch_List("장학금7", "분류조건7")
    )
    private lateinit var recyclerviewSch: RecyclerView

    private lateinit var btn_in: Button
    private lateinit var btn_out: Button
    private lateinit var btn_serve: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //리싸이클러뷰 관련
        var rootView_search = inflater.inflate(R.layout.fragment_search, container, false)
        recyclerviewSch = rootView_search.findViewById(R.id.recyclerview_Search!!) as RecyclerView
        recyclerviewSch.layoutManager = LinearLayoutManager(requireContext())

        val sAdapter = SearchRvAdapter(
            requireContext(),
            schList
        )
        recyclerviewSch.adapter = sAdapter
        recyclerviewSch.setHasFixedSize(true)
        //리싸이클러뷰 관련

        // 교내장학생 버튼 눌리면 진행되는 동작
        btn_in = rootView_search.findViewById<Button>(R.id.btn_in)
        btn_in.setOnClickListener() {

            //sortedSetOf() 버튼 누르면 sort로 정렬해야함
            btn_in.isSelected()

        }

        // 교외장학생 버튼 눌리면 진행되는 동작
        btn_out = rootView_search.findViewById<Button>(R.id.btn_out)
        btn_out.setOnClickListener() {
            //sortedSetOf() 버튼 누르면 sort로 정렬해야함 Sch_criteria or sch_sort로 정렬?? //
            btn_out.isSelected()
        }

        // 봉사장학생 버튼 눌리면 진행되는 동작
        btn_serve = rootView_search.findViewById<Button>(R.id.btn_serve)
        btn_serve.setOnClickListener() {
            //sortedSetOf() 버튼 누르면 sort로 정렬해야함
            btn_serve.isSelected()
        }

        return rootView_search
    }
}
