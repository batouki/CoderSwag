package com.example.baptiste.coderswag.Model

/**
 * Created by Baptiste on 14/02/2018.
 */
class Product(val title: String, val price: String, val image: String) {
    override fun toString(): String {
        return title
    }
}