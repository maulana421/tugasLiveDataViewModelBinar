package com.example.livedatavm.model

import java.io.Serializable

data class DataProduct(
    val namaProduct : String,
    val gambarProduct : Int,
    val hargaProduct : String,
    val deskripsiProduct : String,
    val stockProduct : Int
): Serializable
