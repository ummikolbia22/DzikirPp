package com.ummi.dzikirpp.adapterpagi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ummi.dzikirpp.R
import com.ummi.dzikirpp.data.DataDzikirPagi

class AdapterPagi (private val dataDzikirPagi : List<DataDzikirPagi>) :
    RecyclerView.Adapter<AdapterPagi.SlideViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideViewHolder {
        return SlideViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_dzikir_pagi,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return dataDzikirPagi.size
    }

    override fun onBindViewHolder(holder: SlideViewHolder, position: Int) {
        holder.bind(dataDzikirPagi[position])
    }


    inner class SlideViewHolder (view : View) : RecyclerView.ViewHolder(view){
        private val judul = view.findViewById<TextView>(R.id.tv_judulpagi)
        private val arabpagi = view.findViewById<TextView>(R.id.tv_isiarab)
        private val  latinpagi = view.findViewById<TextView>(R.id.tv_latinpagi)
        private val  indopagi = view.findViewById<TextView>(R.id.tv_isiindo)

        fun bind (dataDzikirPagi: DataDzikirPagi){
            judul.text = dataDzikirPagi.judulpagi
            arabpagi.text = dataDzikirPagi.arabpagi
            latinpagi.text = dataDzikirPagi.latinpagi
            indopagi.text = dataDzikirPagi.indopagi
        }
    }
}