package com.example.mvvmlearning1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mvvmlearning1.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFirstBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

    }

}