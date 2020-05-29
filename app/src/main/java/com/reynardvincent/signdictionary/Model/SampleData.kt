package com.reynardvincent.signdictionary.Model

object SampleData {
    var categories = arrayListOf<Category>(
        Category("Abjad", "Abjad"),
        Category("Kata Kerja", "Kata kerja"),
        Category("Angka", "Angka"),
        Category("Kata Sifat", "Kata Sifat"),
        Category("Sapaan", "Sapaan")
    )

    var abjad = arrayListOf<Dictionary>(
        Dictionary("A", "A", "A"),
        Dictionary("B", "B", "B"),
        Dictionary("C", "C", "C"),
        Dictionary("D", "D", "D"),
        Dictionary("E", "E", "E"),
        Dictionary("F", "F", "F"),
        Dictionary("G", "G", "G"),
        Dictionary("H", "H", "H"),
        Dictionary("I", "I", "I"),
        Dictionary("J", "J", "J"),
        Dictionary("K", "K", "K"),
        Dictionary("L", "L", "L"),
        Dictionary("M", "M", "M"),
        Dictionary("N", "N", "N"),
        Dictionary("O", "O", "O"),
        Dictionary("P", "P", "P"),
        Dictionary("Q", "Q", "Q"),
        Dictionary("R", "R", "R"),
        Dictionary("S", "S", "S"),
        Dictionary("T", "L", "L"),
        Dictionary("U", "U", "U"),
        Dictionary("V", "V", "V"),
        Dictionary("W", "W", "W"),
        Dictionary("X", "X", "X"),
        Dictionary("Y", "Y", "Y"),
        Dictionary("Z", "Z", "Z")

    )

    var kataKerja = arrayListOf<Dictionary>()

    var angka = arrayListOf<Dictionary>()

    var kataSifat = arrayListOf<Dictionary>()

    var sapaan = arrayListOf<Dictionary>()

    var blank = arrayListOf<Dictionary>()

    fun getDictionary(category: String) : List<Dictionary>{
        return when(category){
            "Abjad" -> abjad
            "Kata Kerja" -> kataKerja
            "Angka" -> angka
            "Kata Sifat" -> kataSifat
            "Sapaan" -> sapaan
            else -> blank
        }
    }
}