package com.example.cookbook.ui.home

import androidx.lifecycle.ViewModel
import com.example.cookbook.R

class HomeViewModel : ViewModel() {
    val categories: List<FoodCategory> = listOf(
        FoodCategory("soup", "Супы", R.drawable.soup),
        FoodCategory("salad", "Салаты", R.drawable.salad),
        FoodCategory("appetizer", "Закуски", R.drawable.appetizer),
        FoodCategory("hot", "Горячее", R.drawable.hot),
        FoodCategory("dessert", "Десерты", R.drawable.dessert),
    );
}

data class FoodCategory(val id: String, val name: String, val img: Int)