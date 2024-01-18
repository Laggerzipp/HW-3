package com.hfad.hw_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hfad.hw_3.databinding.ActivityMainBinding
import com.hfad.hw_3.databinding.ItemLayoutBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val adapter = MyAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countryList = listOf<CountryItem>(CountryItem("https://www.worldatlas.com/img/flag/es-flag.jpg","Spain"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/it-flag.jpg","Italy"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/fr-flag.jpg","France"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/nl-flag.jpg","Portugal"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/pt-flag.jpg","The Netherlands"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/de-flag.jpg","Germany"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/va-flag.jpg","The Vatican"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/dk-flag.jpg","Denmark"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/cn-flag.jpg","People's Republic of China"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/us-flag.jpg","United States of America"),
            CountryItem("https://www.worldatlas.com/r/w960-q80/img/flag/eg-flag.jpg","Arab Republic of Egypt")
        )

        adapter.addItems(countryList)
        binding.rv.layoutManager = GridLayoutManager(this,2)
        binding.rv.adapter = adapter
    }
}