package com.example.sn_test.Adpater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sn_test.Fragment.ScholarshipSummary
import com.example.sn_test.R

class MainRvAdapter(private val context : Context, val summarySummary : ArrayList<ScholarshipSummary>) :
        RecyclerView.Adapter<MainRvAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(summarySummary[position], context)
    }

    override fun getItemCount(): Int {
        return summarySummary.size
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val dow = itemView?.findViewById<TextView>(R.id.itemTV_DOW)
        val day = itemView?.findViewById<TextView>(R.id.itemTV_Day)
        val scholarshipName = itemView?.findViewById<TextView>(R.id.itemTV_scholarName)
        val organization = itemView?.findViewById<TextView>(R.id.itemTV_scholarOrganization)
        val d_day = itemView?.findViewById<TextView>(R.id.itemTV_scholarD_day)

        fun bind (scholarshipSummary: ScholarshipSummary, context: Context) {
            dow?.text = scholarshipSummary.dow
            day?.text = scholarshipSummary.day
            scholarshipName?.text = scholarshipSummary.scholarName
            organization?.text = scholarshipSummary.organization
            d_day?.text = scholarshipSummary.d_day
        }
    }
}