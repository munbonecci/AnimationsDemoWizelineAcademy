package com.wizeline.academy.animations.ui.detail

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.wizeline.academy.animations.databinding.DetailFragmentBinding
import com.wizeline.academy.animations.utils.loadImage
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailFragment : Fragment() {

    private var _binding: DetailFragmentBinding? = null
    private val binding get() = _binding!!

    private val args: DetailFragmentArgs by navArgs()

    @Inject
    lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DetailFragmentBinding.inflate(layoutInflater, container, false)
        binding.btnMoreDetails.setOnClickListener { goToMoreDetails() }
        binding.ivImageDetail.loadImage(args.imageId)
        return binding.root
    }

    private fun goToMoreDetails() {
        val extras = FragmentNavigatorExtras(sharedElements = getSharedElements())
        val directions =
            DetailFragmentDirections.toMoreDetailsFragment(args.imageId, viewModel.contentIndex)
        findNavController().navigate(directions, extras)
    }

    private fun getSharedElements(): Array<Pair<View, String>> {
        return arrayOf(
            Pair(
                binding.tvTitle, "detail_title",
            ),
            Pair(
                binding.ivImageDetail, "detail_image",
            ),
            Pair(
                binding.tvSubtitle, "detail_subtitle",
            )
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.title.observe(viewLifecycleOwner) { binding.tvTitle.text = it }
        viewModel.subtitle.observe(viewLifecycleOwner) { binding.tvSubtitle.text = it }
    }
}