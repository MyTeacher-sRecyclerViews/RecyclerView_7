package com.example.rv_gridview_7.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rv_gridview_7.R
import com.example.rv_gridview_7.model.User

class CustomAdapter(private val context: Context, private val users: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = users[position]

        if (holder is CustomViewHolder) {
            holder.firstName.text = user.firstName
            holder.lastName.text = user.lastName
        }
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class CustomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val firstName: TextView = view.findViewById(R.id.firs_text)
        val lastName: TextView = view.findViewById(R.id.second_text)
    }
}