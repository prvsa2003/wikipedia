package com.example.wikipedia_test.Fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.wikipedia_test.R
import com.example.wikipedia_test.databinding.FragmentPhotograferBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class FragmentPhotographer : Fragment() {
    lateinit var binding: FragmentPhotograferBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentPhotograferBinding.inflate(layoutInflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide
            .with(requireContext())
            .load(R.drawable.photigrapher)
            .transform(RoundedCornersTransformation(32, 8))
            .into(binding.imageView2)



        binding.button2.setOnClickListener {
            val url = "https://simple.wikipedia.org/wiki/Photographer"
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse(url))
            startActivity(intent)
        }

    }


}