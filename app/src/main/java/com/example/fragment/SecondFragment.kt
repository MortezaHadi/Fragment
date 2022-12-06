package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.fragment.databinding.FragmentFirstBinding
import com.example.fragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // No Binding
        // return inflater.inflate(R.layout.fragment_second, container, false)
        _binding = FragmentSecondBinding.inflate(inflater, container, false)


        binding.button44.setOnClickListener{
            findNavController().navigate(R.id.action_secondFragment_to_firstFragment2)
        }




        return binding.root
    }
}