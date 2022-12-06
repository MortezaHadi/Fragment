package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.*
import androidx.navigation.fragment.findNavController
import com.example.fragment.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // No Binding
        // return inflater.inflate(R.layout.fragment_second, container, false)
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.button33.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_firstFragment_to_secondFragment)
        }

        return binding.root
    }
}