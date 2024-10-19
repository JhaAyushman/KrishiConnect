package com.example.krishiconnect1

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.example.yourpackage.R

class KrishiConnectComponent(context: Context, attrs: AttributeSet?) : FrameLayout(context, attrs) {

    private lateinit var categoryTextView: TextView
    private lateinit var languageTextView: TextView
    private lateinit var trendingTextView: TextView
    private lateinit var homeImageView: ImageView
    private lateinit var sellImageView: ImageView
    private lateinit var transactionsImageView: ImageView
    private lateinit var profileImageView: ImageView

    init {
        LayoutInflater.from(context).inflate(R.layout.krishi_connect_component, this, true)

        categoryTextView = findViewById(R.id.category_text)
        languageTextView = findViewById(R.id.language_text)
        trendingTextView = findViewById(R.id.trending_text)
        homeImageView = findViewById(R.id.home_image)
        sellImageView = findViewById(R.id.sell_image)
        transactionsImageView = findViewById(R.id.transactions_image)
        profileImageView = findViewById(R.id.profile_image)


        categoryTextView.setOnClickListener {
        }
        languageTextView.setOnClickListener {
        }
        trendingTextView.setOnClickListener {

        }
        homeImageView.setOnClickListener {

        }
        sellImageView.setOnClickListener {

        }
        transactionsImageView.setOnClickListener {

        }
        profileImageView.setOnClickListener {
            
        }
    }
}