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
            CountryData("Japan", "Tokyo", R.drawable.japan),
            CountryData("Nigeria", "Abuja", R.drawable.nigeria),
            CountryData("USA", "Washington", R.drawable.usa),
            CountryData("Philipines", "Manila", R.drawable.ph),
            CountryData("United Kingdom", "London", R.drawable.uk),
            CountryData("Denmark", "Copenhagen", R.drawable.denmark),
            CountryData("France", "Paris", R.drawable.france),
            CountryData("Finland", "Helsinki", R.drawable.finland),
            CountryData("Poland", "Warsaw", R.drawable.poland),
            CountryData("Australia", "Canberra", R.drawable.ausy),
            CountryData("Ireland", "Dublin", R.drawable.ireland),
            CountryData("Russia", "Moscow", R.drawable.russia),
            CountryData("Ukraine", "Kyiv", R.drawable.ukraine),
            CountryData("Brazil", "Brasilia", R.drawable.brazil),
            CountryData("Canada", "Ottawa", R.drawable.canada),
            CountryData("Singapore", "Singapore", R.drawable.singapore),
            CountryData("China", "Beijing", R.drawable.china),
            CountryData("Netherlands", "Amsterdam", R.drawable.netherelands),
            CountryData("Vietnam", "Hanoi", R.drawable.vietnam),
            CountryData("Germany", "Berlin", R.drawable.germany)
        )

        val adapter = CountryAdapter(items)
        recyclerView.adapter = adapter
    }
}
