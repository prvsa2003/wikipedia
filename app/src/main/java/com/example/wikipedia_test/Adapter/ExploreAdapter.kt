package com.example.wikipedia_test.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wikipedia_test.Data.ItemPost
import com.example.wikipedia_test.databinding.ItemExploreBinding


class ExploreAdapter(val data: ArrayList<ItemPost> , val itemEvent: ItemEvent) :
    RecyclerView.Adapter<ExploreAdapter.ExploreViewHolder>() {
    private lateinit var binding: ItemExploreBinding

    inner class ExploreViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        fun bindViews(itemPost: ItemPost) {

            Glide.with(itemView.context)
                .load(itemPost.imgurl)
                .into(binding.imgMainExplore)

            binding.txtExploreTitle.text = itemPost.txtTtle
            binding.txtExploreSubtitle.text = itemPost.txtSubTitle
            binding.txtExploreDitail.text = itemPost.txtDitail

            itemView.setOnClickListener {
                itemEvent.onItemclicek(itemPost)


            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        binding = ItemExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExploreViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bindViews(data[position])
    }



}