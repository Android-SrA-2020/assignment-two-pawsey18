package com.example.rickandmortyquiz


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.example.rickandmortyquiz.databinding.FragmentMainBinding
import androidx.databinding.DataBindingUtil

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {
private lateinit var binding: FragmentMainBinding
    private lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
            binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main,
            container,
            false)


        return binding.root



}
}
