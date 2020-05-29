package com.reynardvincent.signdictionary.Model

import android.content.Context
import android.util.Log
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import org.json.JSONObject

object SampleData {
    val dictionaryURL = "http://signtranslate.herokuapp.com/api/signs/"
    val imageURL = "http://signtranslate.herokuapp.com/signs/"

    var categories = arrayListOf<Category>(
        Category("Abjad", "Abjad"),
        Category("Kata Kerja", "Kata kerja"),
        Category("Angka", "Angka"),
        Category("Kata Sifat", "Kata Sifat"),
        Category("Sapaan", "Sapaan")
    )

    var abjad = arrayListOf<Dictionary>()

    var kataKerja = arrayListOf<Dictionary>()

    var angka = arrayListOf<Dictionary>()

    var kataSifat = arrayListOf<Dictionary>()

    var sapaan = arrayListOf<Dictionary>()

    var blank = arrayListOf<Dictionary>()

    fun getCategory(category: String) : List<Dictionary>{
        return when(category){
            "Abjad" -> abjad
            "Kata Kerja" -> kataKerja
            "Angka" -> angka
            "Kata Sifat" -> kataSifat
            "Sapaan" -> sapaan
            else -> blank
        }
    }

    fun getEachDictionary(context: Context, row: Int, complete: (Boolean) -> Unit){
        val eachTranslateRequest = object: JsonObjectRequest(Method.GET, "${dictionaryURL}${row}", null, Response.Listener { response ->
            try {
                abjad.add(Dictionary(response.getString("id"), response.getString("meaning"), "${imageURL}${response.getString("sign_type")}_${response.getString("meaning")}"))
                complete(true)
            } catch (e: JSONException){
                Log.d("JSON", "EXC: ${e.localizedMessage}")
                complete(false)
            }
        }, Response.ErrorListener { error ->
            Log.d("ERROR", "Could not get this specific data: $error")
            complete(false)
        }){
            override fun getBodyContentType(): String {
                return "application/json; charset=utf-8"
            }
        }

        Volley.newRequestQueue(context).add(eachTranslateRequest)
    }
}