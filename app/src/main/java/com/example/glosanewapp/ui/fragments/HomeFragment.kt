package com.example.glosanewapp.ui.fragments

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.glosanewapp.R
import com.example.glosanewapp.databinding.FragmentHomeBinding
import com.example.glosanewapp.ui.activity.MainActivity
import com.example.glosanewapp.viewmodel.HomeFragmentViewModel
import com.example.latlngapp.network.UserSession


class HomeFragment : Fragment() {

    private lateinit var homeBinding : FragmentHomeBinding
private lateinit var mcontext:Context
    private lateinit var homeFragmentViewModel: HomeFragmentViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext=context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment

        homeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false)

        homeFragmentViewModel = ViewModelProvider(this)[HomeFragmentViewModel::class.java]

        homeBinding.viewmodel = homeFragmentViewModel
        homeBinding.executePendingBindings()

        initViews()



        return homeBinding.root
    }

    private fun initViews() {

        val userSession = UserSession(requireContext())

        homeBinding.homefragTvId.text = "ID: " + String.format("%08X", userSession.getUserId()!!.toInt())

        homeBinding.homefragPublishlayout.setOnClickListener {
            //( mcontext as MainActivity).callpublish()
          //  Navigation.findNavController(homeBinding.root).navigate(R.id.navigation_publish)
            findNavController().navigate(R.id.action_home_to_publish)
        }

        homeBinding.homefragSubscribelayout.setOnClickListener {

            Navigation.findNavController(homeBinding.root).navigate(R.id.navigation_subscribe)
            //NavHostFragment.findNavController(this).navigate(R.id.navigation_subscribe)
        }
    }
}