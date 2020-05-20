package com.reynardvincent.signdictionary.Controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.reynardvincent.signdictionary.Adapters.DictionaryAdapter
import com.reynardvincent.signdictionary.Model.SampleData
import com.reynardvincent.signdictionary.Model.extraCategory
import com.reynardvincent.signdictionary.Model.extraDictionaryKey
import com.reynardvincent.signdictionary.Model.extraDictionaryValue
import com.reynardvincent.signdictionary.R
import kotlinx.android.synthetic.main.activity_searched_view.*

class SearchedView : AppCompatActivity() {

    lateinit var dictionaryAdapter : DictionaryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searched_view)

        val categoryType = intent.getStringExtra(extraCategory)
        TypeTitle.text = categoryType
        dictionaryAdapter = DictionaryAdapter(this, SampleData.getDictionary(categoryType)){ dictionary ->
            val detailIntent = Intent(this, DetailView:: class.java)
            detailIntent.putExtra(extraDictionaryKey, dictionary.key)
            detailIntent.putExtra(extraDictionaryValue, dictionary.value)
            startActivity(detailIntent)
        }

        val numColumn :Int
        val orientation = resources.configuration.orientation
        val screenSize = resources.configuration.screenWidthDp

        if(screenSize <= 720){
            if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
                numColumn = 3
            } else {
                numColumn = 2
            }
        } else {
            numColumn = 3
        }

        val layoutManager = GridLayoutManager(this, numColumn)
        dictionaryListView.layoutManager = layoutManager
        dictionaryListView.adapter = dictionaryAdapter
    }
}
