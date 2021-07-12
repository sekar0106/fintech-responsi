package io.github.sekar0106.responsifintech.Home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import io.github.sekar0106.responsifintech.R
import kotlinx.android.synthetic.main.row_item.view.*

class MyAdapter (private val heroes: List<Hero>) : RecyclerView.Adapter<HeroHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): HeroHolder {
        return HeroHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.row_item, viewGroup, false))
    }

    override fun getItemCount(): Int = heroes.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.bindHero(heroes[position])
    }
}


