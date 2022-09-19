package com.example.livedatavm

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.livedatavm.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val argS by navArgs<DetailFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ambilData()
        towhatsApp()
    }

    fun ambilData(){
        binding.detailproduct = argS.detailProductAr
    }

    fun towhatsApp(){
        binding.btnBuy.setOnClickListener {
            val pesan = """
                apakah Handphone ${argS.detailProductAr.namaProduct} dengan harga ${argS.detailProductAr.hargaProduct},
                masih tersedia?
            """.trimIndent()
                val whatsApp = Intent(Intent.ACTION_SEND).apply {
                    putExtra(Intent.EXTRA_TEXT, pesan)
                    type = "text/plain"
                    `package` = "com.whatsapp"
                }
                startActivity(whatsApp)
        }
    }


}