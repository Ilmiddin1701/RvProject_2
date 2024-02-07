package com.example.rvproject_2.Utils

import android.graphics.Color
import com.example.rvproject_2.Models.ClassData
import com.example.rvproject_2.R

object obj {
    val list = ArrayList<ClassData>()
    fun addList(){
        for (i in 0 until  10){
            list.add(ClassData(R.drawable.mashina, "AUTOMOTIVE", Color.parseColor("#CE5E38")))
            list.add(ClassData(R.drawable.battery, "BATTERIES", Color.parseColor("#D37F3A")))
            list.add(ClassData(R.drawable.construction, "CONSTRUCTION", Color.parseColor("#E8B345")))
            list.add(ClassData(R.drawable.power, "ELECTRONICS", Color.parseColor("#F7E54D")))
            list.add(ClassData(R.drawable.garden, "GARDEN", Color.parseColor("#93B750")))
            list.add(ClassData(R.drawable.glass, "GLASS", Color.parseColor("#4CA58B")))
            list.add(ClassData(R.drawable.hazardous, "HAZARDOUS", Color.parseColor("#458FC1")))
            list.add(ClassData(R.drawable.household, "HOUSEHOLD", Color.parseColor("#2C72B7")))
            list.add(ClassData(R.drawable.metal, "METAL", Color.parseColor("#695085")))
            list.add(ClassData(R.drawable.paint, "PAINT", Color.parseColor("#904A7C")))
            list.add(ClassData(R.drawable.paper, "PAPER", Color.parseColor("#BD4E7C")))
            list.add(ClassData(R.drawable.plastic, "PLASTIC", Color.parseColor("#EC6C64")))
        }
    }
}