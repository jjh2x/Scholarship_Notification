package com.example.sn_test.Fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sn_test.R

class MainRvAdapter(val context : Context, val summaryList : ArrayList<ScholarshipSummary>) :
        RecyclerView.Adapter<MainRvAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.lv_item, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(summaryList[position], context)
    }

    override fun getItemCount(): Int {
        return summaryList.size
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val scholarshipName = itemView?.findViewById<TextView>(R.id.itemTV_ScholarshipName)
        val period = itemView?.findViewById<TextView>(R.id.itemTV_Period)
        val amountPaid = itemView?.findViewById<TextView>(R.id.itemTV_AmountPaid)

        fun bind (scholarshipSummary: ScholarshipSummary, context: Context) {
            scholarshipName?.text = scholarshipSummary.scholarName
            period?.text = scholarshipSummary.period
            amountPaid?.text = scholarshipSummary.amountPaid
        }
    }
}