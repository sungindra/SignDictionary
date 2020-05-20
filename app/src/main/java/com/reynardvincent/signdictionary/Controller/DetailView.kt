package com.reynardvincent.signdictionary.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reynardvincent.signdictionary.Model.extraCategory
import com.reynardvincent.signdictionary.Model.extraDictionaryKey
import com.reynardvincent.signdictionary.Model.extraDictionaryValue
import com.reynardvincent.signdictionary.R
import kotlinx.android.synthetic.main.activity_detail_view.*

class DetailView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_view)

        val dictionaryKey = intent.getStringExtra(extraDictionaryKey)
        val dictionaryValue = intent.getStringExtra(extraDictionaryValue)

        signTitle.text = dictionaryKey
        signDetail.text = dictionaryValue

    }
}
