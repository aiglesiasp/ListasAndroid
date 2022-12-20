package com.aiglesiaspubill.listasandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aiglesiaspubill.listasandroid.databinding.MainItemBinding

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainviewHolder>() {

    inner class MainviewHolder(val binding: MainItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            if (position % 2 == 0) {
                binding.tvName.textAlignment = View.TEXT_ALIGNMENT_TEXT_START
                binding.tvAge.textAlignment = View.TEXT_ALIGNMENT_TEXT_START
            } else {
                binding.tvName.textAlignment = View.TEXT_ALIGNMENT_TEXT_END
                binding.tvAge.textAlignment = View.TEXT_ALIGNMENT_TEXT_END

            }
            binding.tvName.text = "Name $position"
            binding.tvAge.text = "$position"
        }
    }

    //TAMAÑO DE NUESTRO ADAPTER. EL NUMERO
    override fun getItemCount(): Int {
        return 40
    }

    //CREAMOS EL HOLDER QUE QUEREMOS
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainviewHolder {
        return MainviewHolder(MainItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    //PASAMOS ESOS HOLDERS
    override fun onBindViewHolder(holder: MainviewHolder, position: Int) {
        holder.bind(position)
    }


}