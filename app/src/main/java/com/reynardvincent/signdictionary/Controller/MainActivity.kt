package com.reynardvincent.signdictionary.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.reynardvincent.signdictionary.Model.Category
import com.reynardvincent.signdictionary.Model.Dictionary
import com.reynardvincent.signdictionary.R

class MainActivity : AppCompatActivity() {

    lateinit var categoryAdapter : ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
