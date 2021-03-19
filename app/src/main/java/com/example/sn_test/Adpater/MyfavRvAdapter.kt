package com.example.sn_test.Adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sn_test.Fragment.Myfav_List
import com.example.sn_test.Fragment.Sch_List
import com.example.sn_test.R
import com.example.sn_test.Adpater.MyfavRvAdapter as MyfavRvAdapter

class MyfavRvAdapter (private val context: Context, val myfavList:ArrayList<Myfav_List>):
    RecyclerView.Adapter<MyfavRvAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.myfav_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(myfavList[position], context)
    }

    override fun getItemCount(): Int {
        return myfavList.size
    }
    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val myfav_name = itemView?.findViewById<TextView>(R.id.itemTV_Myfav_nameCall)
        val myfav_sort = itemView?.findViewById<TextView>(R.id.itemTV_Myfav_criteria)

        fun bind(myfav_List: Myfav_List, context: Context){
            myfav_name?.text = myfav_List.myfav_name
            myfav_sort?.text = myfav_List.myfav_sort

        }

    }


}