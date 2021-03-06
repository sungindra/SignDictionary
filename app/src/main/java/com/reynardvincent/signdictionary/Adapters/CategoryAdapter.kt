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

class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val category_view: View
        val holder: ViewHolder

        if(convertView == null){
            category_view = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = category_view.findViewById(R.id.categoryImage)
            holder.categoryTitle = category_view.findViewById(R.id.categoryTitle)

            category_view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            category_view = convertView
        }

        val category = categories[position]

        //val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        val resourceID = context.resources.getIdentifier("ic_launcher_background", "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceID)
        holder.categoryTitle?.text = category.title
        
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

    private class ViewHolder{
       var categoryImage: ImageView? = null
        var categoryTitle: TextView? = null
    }


}