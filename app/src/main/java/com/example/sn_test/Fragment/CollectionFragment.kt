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
        ScholarshipSummary("장학금1", "날짜1", "금액1"),
        ScholarshipSummary("장학금2", "날짜2", "금액2"),
        ScholarshipSummary("장학금3", "날짜3", "금액3"),
        ScholarshipSummary("장학금4", "날짜4", "금액4"),
        ScholarshipSummary("장학금5", "날짜5", "금액5"),
        ScholarshipSummary("장학금6", "날짜6", "금액6"),
        ScholarshipSummary("장학금7", "날짜7", "금액7"),
        ScholarshipSummary("장학금8", "날짜8", "금액8"),
        ScholarshipSummary("장학금9", "날짜9", "금액9"),
        ScholarshipSummary("장학금10", "날짜10", "금액10"),
        ScholarshipSummary("장학금11", "날짜11", "금액11")
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