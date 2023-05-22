package com.example.rentcars.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.rentcars.R
import com.example.rentcars.databinding.FragmentCarsBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CarsFragment : Fragment(R.layout.fragment_cars) {

    private val binding: FragmentCarsBinding by viewBinding()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }


    companion object {

        @JvmStatic
        fun newInstance() =
            CarsFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}