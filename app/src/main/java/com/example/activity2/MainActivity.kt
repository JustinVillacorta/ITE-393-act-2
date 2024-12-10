package com.example.activity2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val items = listOf(
            CountryData("JAPAN", "TOKYO", R.drawable.japan),
            CountryData("NIGERIA", "ABUJA", R.drawable.nigeria),
            CountryData("USA", "WASHINGTON", R.drawable.usa),
            CountryData("PHILIPPINES", "MANILA", R.drawable.ph),
            CountryData("UK", "LONDON", R.drawable.uk),
            CountryData("DENMARK", "COPENHAGEN", R.drawable.denmark),
            CountryData("FRANCE", "PARIS", R.drawable.france),
            CountryData("FINLAND", "HELSINKI", R.drawable.finland),
            CountryData("POLAND", "WARSAW", R.drawable.poland),
            CountryData("AUSTRALIA", "CANBERRA", R.drawable.ausy),
            CountryData("IRELAND", "DUBLIN", R.drawable.ireland),
            CountryData("RUSSIA", "MOSCOW", R.drawable.russia),
            CountryData("UKRAINE", "KYIV", R.drawable.ukraine),
            CountryData("BRAZIL", "BRASILIA", R.drawable.brazil),
            CountryData("CANADA", "OTTAWA", R.drawable.canada),
            CountryData("SINGAPORE", "SINGAPORE", R.drawable.singapore),
            CountryData("CHINA", "BEIJING", R.drawable.china),
            CountryData("NETHERLANDS", "AMSTERDAM", R.drawable.netherelands),
            CountryData("VIETNAM", "HANOI", R.drawable.vietnam),
            CountryData("GERMANY", "BERLIN", R.drawable.germany)
        )

        val adapter = CountryAdapter(items)
        recyclerView.adapter = adapter
    }
}
