package com.reynardvincent.signdictionary.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reynardvincent.signdictionary.Model.extraCategory
import com.reynardvincent.signdictionary.R
import kotlinx.android.synthetic.main.activity_searched_view.*

class SearchedView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searched_view)

        val categoryType = intent.getStringExtra(extraCategory)
        TypeTitle.text = categoryType
    }
}
