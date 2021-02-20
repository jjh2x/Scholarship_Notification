package com.example.sn_test.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sn_test.R

class CollectionFragment: Fragment() {
    /* 장학금 요약 클래스를 초기화한 배열 */
    var summaryList = arrayListOf<ScholarshipSummary> (
        ScholarshipSummary("일", "21", "푸른등대장학금", "푸른장학재단", "D-13"),
        ScholarshipSummary("일", "21", "푸른등대장학금", "푸른장학재단", "D-13"),
        ScholarshipSummary("일", "21", "푸른등대장학금", "푸른장학재단", "D-13"),
        ScholarshipSummary("일", "21", "푸른등대장학금", "푸른장학재단", "D-13"),
        ScholarshipSummary("일", "21", "푸른등대장학금", "푸른장학재단", "D-13"),
        ScholarshipSummary("일", "21", "푸른등대장학금", "푸른장학재단", "D-13")
    )
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView = inflater.inflate(R.layout.fragment_collection, container, false)
        recyclerView = rootView.findViewById(R.id.recyclerView!!) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val mAdapter = MainRvAdapter(requireContext(), summaryList)
        recyclerView.adapter = mAdapter
        recyclerView.setHasFixedSize(true)
        return rootView
    }
}