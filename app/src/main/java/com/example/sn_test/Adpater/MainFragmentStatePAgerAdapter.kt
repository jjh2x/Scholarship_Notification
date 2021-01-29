package com.example.sn_test.Adpater

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.sn_test.Fragment.CollectionFragment
import com.example.sn_test.Fragment.HomeFragment
import com.example.sn_test.Fragment.MyPageFragment
import com.example.sn_test.Fragment.SearchFragment

class MainFragmentStatePAgerAdapter(fm : FragmentManager, val fragmentCount : Int) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return HomeFragment()
            1 -> return CollectionFragment()
            2 -> return SearchFragment()
            3 -> return MyPageFragment()
            else -> return HomeFragment()
        }
    }
    override fun getCount(): Int = fragmentCount
}