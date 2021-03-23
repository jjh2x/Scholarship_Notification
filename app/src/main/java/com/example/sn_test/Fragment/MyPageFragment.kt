package com.example.sn_test.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sn_test.Adpater.MyfavRvAdapter
import com.example.sn_test.R

class MyPageFragment: Fragment() {
    var mypageList = arrayListOf<Myfav_List>(
        Myfav_List("이름 정보 받아오기", "기준"),
        Myfav_List("이름 정보 받아오기", "기준"),
        Myfav_List("이름 정보 받아오기", "기준"),
        Myfav_List("이름 정보 받아오기", "기준"),
        Myfav_List("이름 정보 받아오기", "기준"),
        Myfav_List("이름 정보 받아오기", "기준")
    )
    lateinit var recyclerView_mp: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_myfav, container, false)
        var root_mypage = inflater.inflate(R.layout.fragment_myfav, container, false)
        recyclerView_mp = root_mypage.findViewById(R.id.recyclerview_Myfav!!) as RecyclerView
        recyclerView_mp.layoutManager = LinearLayoutManager(requireContext())

        val mpAdapter =  MyfavRvAdapter(
            requireContext(),
            mypageList
        )

        recyclerView_mp.adapter = mpAdapter
        recyclerView_mp.setHasFixedSize(true)
        return root_mypage
    }
}