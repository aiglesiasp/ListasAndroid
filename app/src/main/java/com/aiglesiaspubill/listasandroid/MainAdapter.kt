package com.aiglesiaspubill.listasandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aiglesiaspubill.listasandroid.databinding.MainItemBinding

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainviewHolder>() {

    private var items = listOf<String>()

    inner class MainviewHolder(val binding: MainItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: String, position: Int) {
            if (position % 2 == 0) {
                binding.tvName.textAlignment = View.TEXT_ALIGNMENT_TEXT_START
                binding.tvAge.textAlignment = View.TEXT_ALIGNMENT_TEXT_START
            } else {
                binding.tvName.textAlignment = View.TEXT_ALIGNMENT_TEXT_END
                binding.tvAge.textAlignment = View.TEXT_ALIGNMENT_TEXT_END

            }
            binding.tvName.text = item
            binding.tvAge.text = "$position"
        }
    }

    //TAMAÑO DE NUESTRO ADAPTER. EL NUMERO
    override fun getItemCount(): Int {
        return items.size
    }

    //CREAMOS EL HOLDER QUE QUEREMOS
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainviewHolder {
        return MainviewHolder(MainItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    //PASAMOS ESOS HOLDERS
    override fun onBindViewHolder(holder: MainviewHolder, position: Int) {
        holder.bind(items[position], position)
    }

    fun updateList(list: List<String>) {
        items = list
        notifyDataSetChanged()
    }


}