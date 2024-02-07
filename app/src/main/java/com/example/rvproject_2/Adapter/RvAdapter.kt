package com.example.rvproject_2.Adapter

import android.content.Context
import android.graphics.Color
import android.provider.CalendarContract.Colors
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.rvproject_2.Models.ClassData
import com.example.rvproject_2.R
import com.example.rvproject_2.databinding.ItemRvBinding

class RvAdapter(var context: Context, var list: ArrayList<ClassData> = ArrayList()): RecyclerView.Adapter<RvAdapter.Vh>() {

    inner class Vh(val itemRvBinding: ItemRvBinding):RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBinding(classData: ClassData){

            itemRvBinding.itemName.text = classData.itemName
            itemRvBinding.itemImage.setImageResource(classData.itemImage)
            itemRvBinding.linear1.setBackgroundColor(classData.linearColor)

            val anim = AnimationUtils.loadAnimation(context, R.anim.rv_animation)
            itemRvBinding.root.startAnimation(anim)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBinding(list[position])
    }
}