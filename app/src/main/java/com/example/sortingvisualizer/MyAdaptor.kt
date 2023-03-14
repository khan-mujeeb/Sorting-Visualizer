package com.example.sortingvisualizer

import android.graphics.Color
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class MyAdaptor(val dataList: List<row>): RecyclerView.Adapter<MyAdaptor.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txt1.text = dataList[position].a.toString()
        holder.txt2.text = dataList[position].b.toString()
        holder.txt3.text = dataList[position].c.toString()
        holder.txt4.text = dataList[position].d.toString()
        holder.txt5.text = dataList[position].e.toString()

        val p = dataList[position].pos1
        val q = dataList[position].pos2
        when(p) {
            0->holder.txt1.setBackgroundColor(Color.parseColor("#DAE521"))
            1->holder.txt2.setBackgroundColor(Color.parseColor("#DAE521"))
            2->holder.txt3.setBackgroundColor(Color.parseColor("#DAE521"))
            3->holder.txt4.setBackgroundColor(Color.parseColor("#DAE521"))
            4->holder.txt5.setBackgroundColor(Color.parseColor("#DAE521"))
        }

        when(q) {
            0->holder.txt1.setBackgroundColor(Color.parseColor("#DAE521"))
            1->holder.txt2.setBackgroundColor(Color.parseColor("#DAE521"))
            2->holder.txt3.setBackgroundColor(Color.parseColor("#DAE521"))
            3->holder.txt4.setBackgroundColor(Color.parseColor("#DAE521"))
            4->holder.txt5.setBackgroundColor(Color.parseColor("#DAE521"))
        }

        holder.itemView.startAnimation(
            AnimationUtils.loadAnimation(
                holder.itemView.context,
                 R.anim.rc_animation
            )
        )

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var txt1 = itemView.findViewById<TextView>(R.id.txt1)
        var txt2 = itemView.findViewById<TextView>(R.id.txt2)
        var txt3 = itemView.findViewById<TextView>(R.id.txt3)
        var txt4 = itemView.findViewById<TextView>(R.id.txt4)
        var txt5 = itemView.findViewById<TextView>(R.id.txt5)
    }
}