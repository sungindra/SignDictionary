package com.reynardvincent.signdictionary.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.reynardvincent.signdictionary.Model.Category
import com.reynardvincent.signdictionary.R

class CategoryAdapter(context: Context, categories: List<Category>): BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val category_view: View

        category_view = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage: ImageView = category_view.findViewById(R.id.categoryImage)
        val categoryTitle: TextView = category_view.findViewById(R.id.categoryTitle)

        val category = categories[position]

        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceID)

        categoryTitle.text = category.title

        return category_view
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}