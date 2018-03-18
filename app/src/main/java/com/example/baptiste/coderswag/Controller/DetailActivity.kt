package com.example.baptiste.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.baptiste.coderswag.Adapters.DetailAdapter
import com.example.baptiste.coderswag.R
import com.example.baptiste.coderswag.Services.DataService
import com.example.baptiste.coderswag.Utilities.EXTRA_CATEGORY
import com.example.baptiste.coderswag.Utilities.EXTRA_POSITION
import com.example.baptiste.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    lateinit var  adapter : DetailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        val positionProduct = intent.getStringExtra(EXTRA_POSITION).toInt()


        adapter = DetailAdapter(this, DataService.getProducts(categoryType)[positionProduct])

        detailListView.adapter = adapter
    }


}
