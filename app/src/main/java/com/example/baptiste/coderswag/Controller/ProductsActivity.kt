package com.example.baptiste.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.example.baptiste.coderswag.Adapters.ProductsAdapter
import com.example.baptiste.coderswag.R
import com.example.baptiste.coderswag.Services.DataService
import com.example.baptiste.coderswag.Utilities.EXTRA_CATEGORY
import com.example.baptiste.coderswag.Utilities.EXTRA_POSITION
import com.example.baptiste.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)


        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)){product ->
            val detailIntent = Intent(this, DetailActivity::class.java )
            detailIntent.putExtra(EXTRA_PRODUCT, product.title)
            detailIntent.putExtra(EXTRA_POSITION, DataService.getProducts(categoryType).indexOf(product))

            startActivity(detailIntent)
        }

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) spanCount = 3

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter
    }
}
