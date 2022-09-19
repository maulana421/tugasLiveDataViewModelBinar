package com.example.livedatavm.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.livedatavm.R

class ViewModelProduct: ViewModel() {

    val list = mutableListOf(
        DataProduct("Realme 10 5G", R.drawable.realme10,"Rp 2.599.000","Redmi 10 5G menjadi hp terbaru yang rilis di Agustus 2022. Hp ini merupakan seri Redmi pertama yang mendukung jaringan 5G di Indonesia.\n" +
                "\n" + "Redmi 10 5G sendiri ditenagai chipset MediaTek Dimensity 700 yang disokong dua varian RAM, yaitu 4 GB atau 6 GB. Ditambah dukungan fitur Expansion yang dapat menambah RAM hingga 2 GB. Kedua varian RAM tersebut juga hadir dengan memori internal 128GB.",100),
        DataProduct("Realme Narzo 50i Prime", R.drawable.realmenarzo,"Rp 1.599.000","realme narzo 50i Prime mengusung layar berukuran 6.5 inci dengan resolusi HD+ dan memiliki aspek rasio 88.8%. Masih terasa nyaman untk menonton film atau main sosial media.\n" +
                "\n" + "Hp realme ini hadir dengan kamera tunggal beresolusi 8 MP dengan bukaan f/2.0 yang dibekali dengan fitur digital zoom 4x untuk mode pemotretannya. Di depan ada kamera selfie 5 MP dengan bukaan lensa f/2.2 untuk menghasilkan bokeh yang terlihat natural.",100),
        DataProduct("Infinix 12", R.drawable.infinixnote12,"Rp 2.899.000","Infinix Note 12 membawa layar FHD+ AMOLED 6,7 inchi yang sudah didesain sedemikian rupa dan memiliki konsumsi yang efisien daripada layar LCD. Alhasil, tampilan di layar dapat terlihat lebih jernih. \n" +
                "\n" + "Spesifikasi Infinix Note 12 membawa prosesor MediaTek Helio G96 yang dapat meningkatkan tampilan visual dan performa secara signifikan. Hal itu akan membuat pengalaman pengguna dalam membuka aplikasi secara bersamaan dapat meningkat pesat. ",100),
        DataProduct("Redmi 10A", R.drawable.redmi10c,"Rp 1.499.000","Redmi 10A juga merupakan hp terbaru dari Xiaomi yang dibanderol harga murah. Hadir dengan layar 6,53 inci dengan resolusi HD+ sehingga masih cukup nyaman untuk menemani aktivitas sehari-hari.\n" +
                "\n" + "Kamera belakangnya ada dua yaitu kamera utama 13 MP (aperture f/2.2) dan kamera depth 2 MP (aperture f/2.4). Lalu untuk kamera depannya beresolusi 2 MP dengan aperture f/2.4. ",100),
        DataProduct("Samsung A13", R.drawable.samsinga13,"Rp 2.499.000","Hp terbaru yang sudah dirilis Samsung ke Indonesia adalah Galaxy A13. Hp Samsung terbaru ini hadir dengan fitur RAM Plus yang memungkinkan untuk menambah kapasitas RAM hingga 6 GB.\n" +
                "\n" + "Jadi total memori RAM yang didapatkan menjadi 12 GB. Pilihan memorinya ada varian RAM 6 GB dan RAM 4 GB yang memiliki kapasitas 128 GB. Kinerjanya ditopang prosesor Exynos 850.",100),
        DataProduct("Samsung A22", R.drawable.samsunga22,"Rp 2.899.000","Hp terbaru dari Samsung lainnya ada Galaxy A23. Hp ini mengusung Infinity-V Display berukuran 6,6 inci dengan resolusi yang sudah Full HD+ dan refresh rate 90Hz.\n" +
                "\n" + "Di bagian belakang ada empat kamera, dimana salah satunya sudah memiliki resolusi 50 MP serta sudah dilengkapi dukungan Optical Image Stabilization (OIS).",100),
        DataProduct("Samsung A03", R.drawable.samsunga03,"Rp 1.399.000","Samsung Galaxy A03 bisa menjadi pilihan untuk kamu yang mencari hp terbaru yang harganya terjangkau. Hp Samsung terbaru yang rilis di Januari 2022 ini memang dibanderol dengan harga yang merakyat.\n" +
                "\n" + "Spesifikasinya punya layar Infinity-V Display yang terdapat notch membentuk huruf V. Layar ini sendiri berukuran 6,5 inci dengan resolusi HD+. Masih cukup oke untuk nonton film atau main game.",100),
        DataProduct("Oppo A16", R.drawable.oppo16,"Rp 2.699.000","Pilihan hp terbaru 2021 harga terjangkau selanjutnya adalah OPPO. Salah satu yang bisa jadi pilihan OPPO A16. Hp ini mengunggulkan pada kapasitas baterai yang besar.\n" +
                "\n" + "Dimana didalamnya sudah tertanam baterai 5000 mAh, jadi kamu bisa beraktivitas dengan hp OPPO terbaru ini seharian tanpa khawatir kehabisan daya. ",100),
        DataProduct("Redmi Note 10C", R.drawable.redminote10c,"Rp 2.450.000","Hp terbaru 2021 berikutnya adalah Redmi Note 10S. Hp yang dirilis Mei 2021 ini ditenagai prosesor Helio G95 yang di sokong opsi RAM 6 GB dan RAM 8 GB. Layarnya berukuran 6,43 inci berjenis Super AMOLED dengan tingkat resolusi FHD+.\n" +
                "\n" + "Hp Xiaomi ini juga dibekali empat kamera belakang yang terdiri dari kamera utama 64 MP, kamera ultra-wide 8 MP (118 derajat), kamera macro 2 MP dan depth sensor 2 MP.",100),

    )

    val productList : MutableLiveData<List<DataProduct>> = MutableLiveData()

    fun getprodctList(){
        var satu  = list
        productList.value = satu

    }

}