package com.ummi.dzikirpp.adapterpetang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ummi.dzikirpp.R
import com.ummi.dzikirpp.data.DataDzikirPetang

class AdapterPetang(private val dataDzikirPetang: List<DataDzikirPetang>) :
    RecyclerView.Adapter<AdapterPetang.SlideViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideViewHolder {
        return SlideViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_dzikir_petang, parent, false)
        )
    }
    override fun getItemCount(): Int {
        return dataDzikirPetang.size
    }

    override fun onBindViewHolder(holder: SlideViewHolder, position: Int){
        holder.bind(dataDzikirPetang[position])
    }


    inner class SlideViewHolder (view : View) : RecyclerView.ViewHolder(view){
        private val judulpetang = view.findViewById<TextView>(R.id.tv_judulpetang)
        private val arabptg = view.findViewById<TextView>(R.id.tv_isiarabptng)
        private val  latinptng = view.findViewById<TextView>(R.id.tv_latinpetang)
        private val  indoptng = view.findViewById<TextView>(R.id.tv_isiindoptng)

        fun bind (dataDzikirPetang: DataDzikirPetang){
            judulpetang.text = dataDzikirPetang.judulpetang
            arabptg.text = dataDzikirPetang.arabpetang
            latinptng.text = dataDzikirPetang.latinpetang
            indoptng.text = dataDzikirPetang.indopetang
        }
    }
}

