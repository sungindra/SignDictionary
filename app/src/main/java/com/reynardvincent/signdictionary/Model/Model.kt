package com.reynardvincent.signdictionary.Model

import java.net.URL

class Model {
    var dictionaryURL = URL("")
}

class Category(val title: String, val image: String){
    override fun toString(): String {
        return title
    }
}

class Dictionary(val key: String, val value: String, val image: String)