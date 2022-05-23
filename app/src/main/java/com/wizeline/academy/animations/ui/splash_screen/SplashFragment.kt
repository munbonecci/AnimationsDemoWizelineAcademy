package com.wizeline.academy.animations.ui.splash_screen

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.wizeline.academy.animations.databinding.SplashFragmentBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashFragment : Fragment() {

    private var _binding: SplashFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SplashFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        lifecycleScope.launch {
            animateSplashLogo()
            delay(6000)
            goToHomeScreen()
        }
    }

    private fun animateSplashLogo(){
        val animSet = AnimatorSet()
        animSet.playTogether(
            ObjectAnimator.ofFloat(binding.ivWizelineLogo, "rotationX", 0f, 360f),
            ObjectAnimator.ofFloat(binding.ivWizelineLogo, "rotationY", 0f, 180f),
            ObjectAnimator.ofFloat(binding.ivWizelineLogo, "alpha", 1f, 0.25f, 1f)
        )
        animSet.setDuration(5000).start()
    }

    private fun goToHomeScreen() {
        val directions = SplashFragmentDirections.toMainFragment()
        findNavController().navigate(directions)
    }
}