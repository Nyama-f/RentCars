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
import com.example.rentcars.presentation.CarMapper
import com.example.rentcars.presentation.viewmodel.CarsViewModel
import com.example.rentcars.utils.Consts.CAR_ID
import com.example.rentcars.utils.setImage


class DetailCarFragment : Fragment(R.layout.fragment_detail_car) {

    private val binding: FragmentDetailCarBinding by viewBinding()
    private val viewModel: CarsViewModel by activityViewModels()
    private var carId: Int? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            carId = it.getInt(CAR_ID)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        carId?.let { viewModel.getCar(it) }
        viewModel.detailOfCar.observe(viewLifecycleOwner){
            if(it != null){
                binding.markTv.text = it.markAndModel
                binding.stateTv.text = CarMapper.mapStateOfCar(it.state)
                binding.typeTv.text = CarMapper.mapTypeOfCar(it.typeOfCar)
                binding.regionTv.text = it.region
                binding.descriptionTv.text = it.description
                binding.imageIv.setImage(it.image)
            }
        }
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