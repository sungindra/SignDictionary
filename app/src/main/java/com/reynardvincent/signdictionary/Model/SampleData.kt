package com.reynardvincent.signdictionary.Model

object SampleData {
    var categories = arrayListOf<Category>(
        Category("Abjad", "Abjad"),
        Category("Kata Kerja", "Kata kerja"),
        Category("Angka", "Angka"),
        Category("Kata Sifat", "Kata Sifat"),
        Category("Sapaan", "Sapaan")
    )

    var abjad = arrayListOf<Dictionary>()

    var kataKerja = arrayListOf<Dictionary>()

    var angka = arrayListOf<Dictionary>()

    var kataSifat = arrayListOf<Dictionary>()

    var sapaan = arrayListOf<Dictionary>()
}