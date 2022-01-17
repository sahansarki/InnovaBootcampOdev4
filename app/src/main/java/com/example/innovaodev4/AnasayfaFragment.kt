package com.example.innovaodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.innovaodev4.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim : FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnasayfaBinding.inflate(layoutInflater,container,false)

        tasarim.buttonToPageA.setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_AFragment)
        }

        tasarim.buttonToPageX.setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_XFragment)
        }
        return tasarim.root

    }
}