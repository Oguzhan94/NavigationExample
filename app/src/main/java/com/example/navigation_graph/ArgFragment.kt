package com.example.navigation_graph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.navigation_graph.databinding.FragmentArgBinding


class ArgFragment : Fragment() {

    private lateinit var binding: FragmentArgBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentArgBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setFragmentResultListener("user_name"){ requestKey, bundle ->

            var userName =  bundle.getString("bundleKey")
            binding.textView2.text = "Merhaba  '${userName}'"

        }
        findNavController().clearBackStack(R.id.action_thirdFragment_to_argFragment)

    }

}