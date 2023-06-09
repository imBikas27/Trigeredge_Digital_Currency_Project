package com.example.trigeredgedigitalcurrencyproject.main_files.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trigeredgedigitalcurrencyproject.R
import com.example.trigeredgedigitalcurrencyproject.main_files.items.RedeemItems

class RedeemAdapter(
    private val context: Context,
    private val redeemItems: ArrayList<RedeemItems>
) :
    RecyclerView.Adapter<RedeemAdapter.RedeemViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RedeemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.redeem_items, parent, false)
        return RedeemViewHolder(view)
    }


    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RedeemViewHolder, position: Int) {
        val currentItem = redeemItems[position]
        holder.time.text = currentItem.time
        holder.amount.text = "₹${currentItem.amount}"
        holder.phone.text = "Redeem from +91 ${currentItem.phone}"
        holder.name.text = currentItem.name
        holder.status.text = "Status : ${currentItem.status}"
    }

    override fun getItemCount(): Int {
        return redeemItems.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateRedeemItems(updateRedeemItems: ArrayList<RedeemItems>) {
        redeemItems.clear()
        redeemItems.addAll(updateRedeemItems)
        notifyDataSetChanged()
    }

    class RedeemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.name_redeem_item)
        val status: TextView = itemView.findViewById(R.id.status_redeem_item)
        val phone: TextView = itemView.findViewById(R.id.phone_redeem_item)
        val amount: TextView = itemView.findViewById(R.id.amount_redeem_item)
        val time: TextView = itemView.findViewById(R.id.time_redeem_item)
    }
}