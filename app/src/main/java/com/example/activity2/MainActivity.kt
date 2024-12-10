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
            CountryData("JAPAN", "TOKYO"),
            CountryData("NIGERIA", "ABUJA"),
            CountryData("USA", "WASHINGTON"),
            CountryData("PHILIPPINES", "MANILA"),
            CountryData("UK", "LONDON"),
            CountryData("DENMARK", "COPENHAGEN"),
            CountryData("FRANCE", "PARIS"),
            CountryData("FINLAND", "HELSINKI"),
            CountryData("POLAND", "WARSAW"),
            CountryData("AUSTRALIA", "CANBERRA"),
            CountryData("IRELAND", "DUBLIN"),
            CountryData("RUSSIA", "MOSCOW"),
            CountryData("UKRAINE", "KYIV"),
            CountryData("BRAZIL", "BRASILIA"),
            CountryData("CANADA", "OTTAWA"),
            CountryData("SINGAPORE", "SINGAPORE"),
            CountryData("CHINA", "BEIJING"),
            CountryData("NETHERLANDS", "AMSTERDAM"),
            CountryData("VIETNAM", "HANOI"),
            CountryData("GERMANY", "BERLIN")
        )

        val adapter = CountryAdapter(items)
        recyclerView.adapter = adapter
    }
}
