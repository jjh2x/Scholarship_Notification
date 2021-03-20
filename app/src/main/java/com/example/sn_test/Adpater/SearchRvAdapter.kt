package com.example.sn_test.Adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sn_test.Fragment.Sch_List
import com.example.sn_test.R

class SearchRvAdapter(private val context: Context, val schList: ArrayList<Sch_List>) :
    RecyclerView.Adapter<SearchRvAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.search_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(schList[position], context)
    }

    override fun getItemCount(): Int {
        return schList.size
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val sch_name_call = itemView?.findViewById<TextView>(R.id.itemTV_Sch_nameCall)
        val sch_criteria = itemView?.findViewById<TextView>(R.id.itemTV_Sch_criteria)

        fun bind(sch_List: Sch_List, context: Context) {
            sch_name_call?.text = sch_List.sch_name
            sch_criteria?.text = sch_List.sch_sort

        }

    }

}

