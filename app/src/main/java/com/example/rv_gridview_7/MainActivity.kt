package com.example.rv_gridview_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.rv_gridview_7.adapter.CustomAdapter
import com.example.rv_gridview_7.databinding.ActivityMainBinding
import com.example.rv_gridview_7.model.User

class MainActivity : AppCompatActivity() {
    private lateinit var bin: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bin = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bin.root)

        initViews()

        val users = addedUserList()
        refreshAdapter(users)

    }

    private fun initViews() {
        bin.recyclerview.layoutManager = GridLayoutManager(this, 3)
    }

    private fun refreshAdapter(users: ArrayList<User>) {
        val adapter = CustomAdapter(this, users)
        bin.recyclerview.adapter = adapter
    }

    private fun addedUserList(): ArrayList<User> {

        val users = ArrayList<User>()

        for (i in 0..30) {
            users.add(User("Android", "$i"))
        }
        return users
    }
}