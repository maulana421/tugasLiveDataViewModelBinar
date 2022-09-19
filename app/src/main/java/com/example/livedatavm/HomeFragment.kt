package com.example.livedatavm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.livedatavm.adapter.HomeAdapter
import com.example.livedatavm.databinding.FragmentHomeBinding
import com.example.livedatavm.model.DataProduct
import com.example.livedatavm.model.ViewModelProduct


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeAdapter: HomeAdapter
    private lateinit var viewModelProduct: ViewModelProduct
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        viewModelProduct = ViewModelProvider(requireActivity())[ViewModelProduct::class.java]
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelProduct.getprodctList()
        viewModelProduct.productList.observe(requireActivity()){
            homeAdapter.setProductData(it as ArrayList<DataProduct>)
        }

    }

    private fun showRecycler(){
        homeAdapter = HomeAdapter(mutableListOf(),object : HomeAdapter.CLicked{
            override fun onClick(dataProduct: DataProduct) {
                val dataSatu = HomeFragmentDirections.actionHomeFragmentToDetailFragment(dataProduct)
                findNavController().navigate(dataSatu)
            }

        })
        binding.rvProduct.apply {
            adapter = homeAdapter
            layoutManager = GridLayoutManager(requireActivity(),2)
        }

    }


}