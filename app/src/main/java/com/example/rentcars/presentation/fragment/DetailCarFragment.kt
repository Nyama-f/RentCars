package com.example.rentcars.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.rentcars.R
import com.example.rentcars.databinding.FragmentDetailCarBinding
import com.example.rentcars.presentation.viewmodel.CarsViewModel


class DetailCarFragment : Fragment(R.layout.fragment_detail_car) {

    private val binding: FragmentDetailCarBinding by viewBinding()
    private val viewModel: CarsViewModel by activityViewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }



    companion object {

        @JvmStatic
        fun newInstance() =
            DetailCarFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}