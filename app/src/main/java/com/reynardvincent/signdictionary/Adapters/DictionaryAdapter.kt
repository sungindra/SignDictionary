package com.reynardvincent.signdictionary.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reynardvincent.signdictionary.Model.Dictionary
import com.reynardvincent.signdictionary.R

class DictionaryAdapter(val context: Context, val dictionaries: List<Dictionary>, val signClick: (Dictionary) -> Unit) : RecyclerView.Adapter<DictionaryAdapter.DictionaryHolder>(){

    inner class DictionaryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dictionaryImage = itemView.findViewById<ImageView>(R.id.signImage)
        val dictionaryTitle = itemView.findViewById<TextView>(R.id.signTitle)
        val dictionaryDetail = itemView.findViewById<TextView>(R.id.signDetail)

        fun bindDictionary(dictionary: Dictionary, context: Context){
            //val resourceID = context.resources.getIdentifier(dictionary.image, "drawable", context.packageName)
            val resourceID = context.resources.getIdentifier("ic_launcher_background", "drawable", context.packageName)
            dictionaryImage?.setImageResource(resourceID)
            dictionaryTitle?.text = dictionary.key
            dictionaryDetail?.text = dictionary.value
            itemView.setOnClickListener { signClick(dictionary) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DictionaryHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.dictionary_list_item, parent, false)
        return DictionaryHolder(view)
    }

    override fun getItemCount(): Int {
        return dictionaries.count()
    }

    override fun onBindViewHolder(holder: DictionaryHolder, position: Int) {
        holder.bindDictionary(dictionaries[position], context)
    }
}