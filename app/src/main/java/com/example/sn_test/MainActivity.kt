package com.example.sn_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.sn_test.Adpater.MainFragmentStatePAgerAdapter
import com.example.sn_test.Fragment.MainRvAdapter
import com.example.sn_test.Fragment.ScholarshipSummary
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var vp_ac_main_frag_pager: ViewPager
    lateinit var tl_ac_main_bottom_menu: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureBottomNavigation()
    }

    private fun configureBottomNavigation() {
        vp_ac_main_frag_pager = findViewById<ViewPager>(R.id.vp_ac_main_frag_pager)
        vp_ac_main_frag_pager.adapter = MainFragmentStatePAgerAdapter(supportFragmentManager, 4)

        tl_ac_main_bottom_menu = findViewById<TabLayout>(R.id.tl_ac_main_bottom_menu)
        tl_ac_main_bottom_menu.setupWithViewPager(vp_ac_main_frag_pager)

        val bottomNaviLayout: View =
            this.layoutInflater.inflate(R.layout.bottom_navigation_tab, null, false)
        tl_ac_main_bottom_menu.getTabAt(0)!!.customView =
            bottomNaviLayout.findViewById(R.id.btn_bottom_navi_home)
        tl_ac_main_bottom_menu.getTabAt(1)!!.customView =
            bottomNaviLayout.findViewById(R.id.btn_bottom_navi_collection)
        tl_ac_main_bottom_menu.getTabAt(2)!!.customView =
            bottomNaviLayout.findViewById(R.id.btn_bottom_navi_search)
        tl_ac_main_bottom_menu.getTabAt(3)!!.customView =
            bottomNaviLayout.findViewById(R.id.btn_bottom_navi_myPage)
    }
}
