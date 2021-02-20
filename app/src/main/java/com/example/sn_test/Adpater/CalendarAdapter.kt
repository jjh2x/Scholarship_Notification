package com.example.sn_test.Adpater

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.sn_test.R
import java.util.*
import kotlin.collections.ArrayList

public class CalendarAdapter(context: Context, days: ArrayList<Date>, eventDays: HashSet<Date>, inputMonth: Int) : ArrayAdapter<Date>(context, R.layout.calendar_layout, days) {

    private val inflater : LayoutInflater = LayoutInflater.from(context)
    private val inputMonth = inputMonth - 1

    override fun getView(position: Int, view : View?, parent : ViewGroup) : View {
        var view = view
        val calendar = Calendar.getInstance()
        var date = getItem(position)

        calendar.time = date
        val day = calendar.get(Calendar.DATE)
        val month = calendar.get(Calendar.MONTH)
        val year = calendar.get(Calendar.YEAR)

        val today = Date()
        val calendarToday = Calendar.getInstance()
        calendarToday.time = today

        // 날짜 디자인으로 먼저 만들어 둔 calendar_day_layout을 inflate
        if (view == null) {
            view = inflater.inflate(R.layout.calendar_day_layout, parent, false)
        }

        // 여기에서 기호에 따라 뷰의 생김새와 일자의 디자인을 변경이 가능.
        (view as TextView).setTypeface(null, Typeface.NORMAL)
        view.setTextColor(Color.parseColor("#FFFFFF"))

        // inputMonth는 ViewPager의 해당 페이지에 출력하는 Month를 표시.
        if (month != inputMonth || year != calendarToday.get(Calendar.YEAR)) {
            view.visibility = View.INVISIBLE    // 해당월이 아닌 경우에는 GridView에 표시되지 않도록 설정.
        }

        if (month == calendarToday.get(Calendar.MONTH) && year == calendarToday.get(Calendar.YEAR) && day == calendarToday.get(Calendar.DATE)) {
            // 오늘의 날짜(DATE)에 하고싶은 행위 정의
        }

        view.text = calendar.get(Calendar.DATE).toString()

        return view
    }
}