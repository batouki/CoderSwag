package com.example.baptiste.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.baptiste.coderswag.Adapters.DetailAdapter
import com.example.baptiste.coderswag.R
import com.example.baptiste.coderswag.Services.DataService
import com.example.baptiste.coderswag.Utilities.EXTRA_PRODUCT

class DetailActivity : AppCompatActivity() {

    lateinit var  adapter : DetailAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        val productType = intent.getStringExtra(EXTRA_PRODUCT)

        adapter = DetailAdapter(this, productType)
    }


}
