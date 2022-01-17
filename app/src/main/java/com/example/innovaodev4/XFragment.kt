package com.example.innovaodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.innovaodev4.databinding.FragmentXBinding

class XFragment : Fragment() {

    private lateinit var tasarim: FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentXBinding.inflate(layoutInflater, container, false)
        tasarim.buttonToPageYFromX.setOnClickListener {
            findNavController().navigate(R.id.action_XFragment_to_YFragment)
        }
        return tasarim.root
    }
}