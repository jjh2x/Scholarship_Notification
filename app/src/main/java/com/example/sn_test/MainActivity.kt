package com.example.sn_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.sn_test.Adpater.MainFragmentStatePAgerAdapter
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

        // 탭 레이아웃의 각 탭과 탭의 외형을 담당하는 xml과 연결하는 구문.
        tl_ac_main_bottom_menu.getTabAt(0)?.setIcon(R.drawable.ic_navi_cal)
        tl_ac_main_bottom_menu.getTabAt(1)?.setIcon(R.drawable.ic_navi_col)
        tl_ac_main_bottom_menu.getTabAt(2)?.setIcon(R.drawable.ic_navi_search)
        tl_ac_main_bottom_menu.getTabAt(3)?.setIcon(R.drawable.ic_navi_heart)
    }
}
