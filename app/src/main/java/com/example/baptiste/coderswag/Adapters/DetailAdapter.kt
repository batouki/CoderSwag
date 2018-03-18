package com.example.baptiste.coderswag.Adapters

import android.content.Context
import android.database.DataSetObserver
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import com.example.baptiste.coderswag.Model.Product
import com.example.baptiste.coderswag.R
import com.example.baptiste.coderswag.R.id.productImage

/**
 * Created by Baptiste on 16/03/2018.
 */
class DetailAdapter(val context: Context, val product: Product) : RecyclerView.Adapter<DetailAdapter.DetailHolder>(), ListAdapter {
    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun registerDataSetObserver(p0: DataSetObserver?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(p0: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getViewTypeCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEnabled(p0: Int): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun areAllItemsEnabled(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unregisterDataSetObserver(p0: DataSetObserver?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DetailHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_detail2, parent, false)
        return DetailHolder(view)   }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: DetailHolder?, position: Int) {
        holder?.bindProduct(product, context)    }

    inner class DetailHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.DetailImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.priceText)


        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.title
            productPrice?.text = product.price

        }
    }
}