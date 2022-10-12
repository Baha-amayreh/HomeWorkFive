package com.example.homeworkfive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var image = intArrayOf(
            R.drawable.coffee_pot,
            R.drawable.espresso,
            R.drawable.french_fries,
            R.drawable.honey,
            R.drawable.strawberry_ice_cream,
            R.drawable.sugar_cubes
        )
        val x=getResources().getStringArray(R.array.detail)
        val food = ArrayList<Food>()
        food.add(Food("Coffee",x[0],image[0]))
        food.add(Food("Espersso",x[1],image[1]))
        food.add(Food("French Fires",x[2],image[2]))
        food.add(Food("Honey",x[3],image[3]))
        food.add(Food("Strawberry",x[4],image[4]))
        food.add(Food("Sugar cubes",x[5],image[5]))
        // Set the Layout Manager
        recyclerView1.layoutManager = GridLayoutManager(this,2, RecyclerView.VERTICAL,false)
        // Create an object for the MyAdapter
        val adapter = MyAdapter(this,food)
        // Set adapter to your RecyclerView
        recyclerView1.adapter = adapter
    }
}