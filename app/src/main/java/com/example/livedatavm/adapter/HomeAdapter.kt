package com.example.livedatavm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.livedatavm.databinding.ItemBinding
import com.example.livedatavm.model.DataProduct

class HomeAdapter(var listProduct : MutableList<DataProduct>,val list : CLicked): RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    inner class HomeViewHolder(val binding : ItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item : DataProduct){
            binding.apply {
                product = item
                cardSatu.setOnClickListener {
                    list.onClick(item)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        return HomeViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(listProduct[position])
    }

    override fun getItemCount(): Int = listProduct.size

    fun setProductData(product : ArrayList<DataProduct>){
        this.listProduct = product
    }

    interface CLicked {
        fun onClick(dataProduct: DataProduct)
    }
}