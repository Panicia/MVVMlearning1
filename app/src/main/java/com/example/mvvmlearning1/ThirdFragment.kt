package com.example.mvvmlearning1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mvvmlearning1.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private lateinit var binding : FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentThirdBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)
        }
    }

}