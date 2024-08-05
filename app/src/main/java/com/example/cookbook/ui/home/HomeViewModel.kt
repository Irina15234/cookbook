package com.example.cookbook.ui.home

import androidx.lifecycle.ViewModel
import com.example.cookbook.R

class HomeViewModel : ViewModel() {
    val categories: List<FoodCategory> = listOf(
        FoodCategory("soup", "Супы", R.drawable.soup),
        FoodCategory("salad", "Салаты", R.drawable.salad),
        FoodCategory("appetizer", "Закуски", R.drawable.appetizer),
        FoodCategory("hot", "Горячее", 0),
        FoodCategory("dessert", "Десерты", 0),
    );
}

data class FoodCategory(val id: String, val name: String, val img: Int)