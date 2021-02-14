package com.example.sn_test.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sn_test.R

class SearchFragment: Fragment() {
    var SchList = arrayListOf<Sch_List> (
        Sch_List("장학금1", "분류조건1"),
        Sch_List("장학금2", "분류조건2"),
        Sch_List("장학금3", "분류조건3"),
        Sch_List("장학금4", "분류조건4"),
        Sch_List("장학금5", "분류조건5"),
        Sch_List("장학금6", "분류조건6"),
        Sch_List("장학금7", "분류조건7")
    )
    lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
        var rootView_search = inflater.inflate(R.layout.fragment_search, container, false)
        recyclerView = rootView_search.findViewById(R.id.sch_list!!) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val mAdapter = SearchRvAdapter(requireContext(), SchList)
        recyclerView.adapter = mAdapter
        recyclerView.setHasFixedSize(true)
        return rootView_search
    }
}
