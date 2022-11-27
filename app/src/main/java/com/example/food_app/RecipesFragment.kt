package com.example.food_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.food_app.databinding.FragmentRecipesBinding


class RecipesFragment : Fragment() {
    private lateinit var binding: FragmentRecipesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRecipesBinding.inflate(LayoutInflater.from(context))

        binding.recyclerView.showShimmer()

        return binding.root
    }
}