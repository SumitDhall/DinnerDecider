package com.sumit.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sumit.dinnerdecider.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.foodTxt.setText("Beverages")
        val beveragesList = arrayListOf("Budweiser", "BlackDog", "Old Monk", "Gin and Tonic", "Vodka")

        binding.addNewFoodBtn.setOnClickListener {
            println("clicked Add Button!!!")
            val newFood = binding.addNewFoodTxt.text
            println("new food:" + newFood)
            beveragesList.add(newFood.toString())
            binding.addNewFoodTxt.text.clear()
        }

        binding.decideBtn.setOnClickListener {

        val random = Random
            val randomFood = random.nextInt(beveragesList.count())
            binding.foodTxt.setText(beveragesList[randomFood])
            println("Beverages--->>>"+ beveragesList.toString() +"randomFood---"+beveragesList[randomFood])
//         beveragesList.onEach { println(beveragesList.toString()) }

//            for ( i in beveragesList){
//                println("value of beverages::"+ i)
//        }

        }
    }

     private fun btnClick() {
        println("clicked on add new food button")

    }

}