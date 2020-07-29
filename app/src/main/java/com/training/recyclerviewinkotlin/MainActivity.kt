package com.training.recyclerviewinkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countryList:Array<String> = arrayOf("Bangladesh","India", "Nepal","Pakistan","Bhutan","China","Russia","Malaysia","Vietnam","Philippines","North Korea")
        recyle.layoutManager = LinearLayoutManager(this)
        recyle.adapter = MainAdapter(countryList, this)
    }
}