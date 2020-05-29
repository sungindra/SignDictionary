package com.reynardvincent.signdictionary.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.reynardvincent.signdictionary.Adapters.CategoryRecycleAdapter
import com.reynardvincent.signdictionary.Model.SampleData
import com.reynardvincent.signdictionary.Model.extraCategory
import com.reynardvincent.signdictionary.Model.signType
import com.reynardvincent.signdictionary.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var categoryAdapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var type = ""
        // typeSwitching switch is not functional, cannot display title and determined the status condition
        if (typeSwitching.isChecked){
            type = "bisindo"
        } else {
            type = "sibi"
        }

        categoryAdapter = CategoryRecycleAdapter(this, SampleData.categories){ category ->
            val dictionaryIntent = Intent(this, SearchedView:: class.java)
            dictionaryIntent.putExtra(extraCategory, category.title)
            dictionaryIntent.putExtra(signType, type)
            startActivity(dictionaryIntent)
        }

        categoryRecyclerView.adapter = categoryAdapter
        appName.text = "Signs Dictionary"

        val layoutManager = LinearLayoutManager(this)
        categoryRecyclerView.layoutManager = layoutManager
        categoryRecyclerView.setHasFixedSize(true)
    }
}
