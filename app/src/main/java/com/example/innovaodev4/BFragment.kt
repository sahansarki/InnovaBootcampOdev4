package com.example.innovaodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.innovaodev4.databinding.FragmentBBinding


class BFragment : Fragment() {

    private lateinit var tasarim: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentBBinding.inflate(layoutInflater, container, false)
        tasarim.buttonToPageYFromB.setOnClickListener {
            findNavController().navigate(R.id.action_BFragment_to_YFragment)
        }
        return tasarim.root
    }
}