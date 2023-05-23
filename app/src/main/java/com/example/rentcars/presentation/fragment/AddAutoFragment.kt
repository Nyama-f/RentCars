package com.example.rentcars.presentation.fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.rentcars.R
import com.example.rentcars.databinding.FragmentAddAutoBinding
import com.google.android.material.transition.platform.MaterialContainerTransform


class AddAutoFragment : Fragment(R.layout.fragment_add_auto) {

    private val binding: FragmentAddAutoBinding by viewBinding()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedElementEnterTransition = MaterialContainerTransform().apply {
            drawingViewId = R.id.navContainer
            duration = 400.toLong()
            scrimColor = Color.WHITE
            setAllContainerColors(requireContext().getColor(R.color.white))
        }
        arguments?.let {

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }



    companion object {

        @JvmStatic
        fun newInstance() =
            AddAutoFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}