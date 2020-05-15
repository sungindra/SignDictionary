package com.reynardvincent.signdictionary.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.reynardvincent.signdictionary.Adapters.CategoryAdapter
import com.reynardvincent.signdictionary.Adapters.CategoryRecycleAdapter
import com.reynardvincent.signdictionary.Model.Category
import com.reynardvincent.signdictionary.Model.Dictionary
import com.reynardvincent.signdictionary.Model.SampleData
import com.reynardvincent.signdictionary.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var categoryAdapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoryAdapter = CategoryRecycleAdapter(this, SampleData.categories)

        category_view.adapter = categoryAdapter
        appName.text = "Signs Dictionary"

        val layoutManager = LinearLayoutManager(this)
        category_view.layoutManager = layoutManager
        category_view.setHasFixedSize(true)
    }
}
