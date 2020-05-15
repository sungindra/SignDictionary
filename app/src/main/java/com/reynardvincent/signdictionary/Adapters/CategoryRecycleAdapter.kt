package com.reynardvincent.signdictionary.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reynardvincent.signdictionary.Model.Category
import com.reynardvincent.signdictionary.R

class CategoryRecycleAdapter(val context: Context, val categories: List<Category>): RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryTitle = itemView.findViewById<TextView>(R.id.categoryTitle)

        fun bindCategory(category: Category, context: Context){
            //val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            val resourceID = context.resources.getIdentifier("ic_launcher_background", "drawable", context.packageName)
            categoryImage?.setImageResource(resourceID)
            categoryTitle?.text =category.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(Holder: Holder, position: Int) {
        Holder.bindCategory(categories[position], context)
    }
}