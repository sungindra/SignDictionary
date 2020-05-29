package com.reynardvincent.signdictionary.Model

const val signType = "signType"
const val extraCategory = "category"
const val extraDictionaryKey = "dictionaryKey"
const val extraDictionaryValue = "dictionaryValue"

class Model {
}

class Category(val title: String, val image: String){
    override fun toString(): String {
        return title
    }
}

class Dictionary(val key: String, val value: String, val image: String)