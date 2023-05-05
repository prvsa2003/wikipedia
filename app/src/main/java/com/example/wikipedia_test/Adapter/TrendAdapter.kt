package com.example.wikipedia_test.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wikipedia_test.Data.ItemPost
import com.example.wikipedia_test.databinding.ItemTrendBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation


class TrendAdapter(val data: ArrayList<ItemPost> , val itemEvent: ItemEvent) :
    RecyclerView.Adapter<TrendAdapter.TrendViewHolder>() {
    private lateinit var binding: ItemTrendBinding

    inner class TrendViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        fun bindViews(itemPost: ItemPost) {

            binding.txttitletrend.text = itemPost.txtTtle
            binding.txtSubtitleTrend.text = itemPost.txtSubTitle
            binding.txtinsighttrend.text = itemPost.insight
            binding.txtnumbertrend.text = (adapterPosition+1).toString()
            Glide.with(itemView.context)
                .load(itemPost.imgurl)
                .transform(RoundedCornersTransformation(32 , 8 ))
                .into(binding.imagetrend)

            itemView.setOnClickListener {
                itemEvent.onItemclicek(itemPost)
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendViewHolder {
        binding = ItemTrendBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrendViewHolder(binding.root)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: TrendViewHolder, position: Int) {
        holder.bindViews(data[position])
    }

}
