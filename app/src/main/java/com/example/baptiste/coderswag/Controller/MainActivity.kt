package com.example.baptiste.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.baptiste.coderswag.Adapters.CategoryAdapter
import com.example.baptiste.coderswag.Adapters.CategoryRecycleAdapater
import com.example.baptiste.coderswag.Model.Category
import com.example.baptiste.coderswag.R
import com.example.baptiste.coderswag.R.id.categoryListView
import com.example.baptiste.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapater(this, DataService.categories)
        categoryListView.adapter = adapter as CategoryRecycleAdapater

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
        }
    }
}
