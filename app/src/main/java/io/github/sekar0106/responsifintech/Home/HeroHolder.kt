package io.github.sekar0106.responsifintech.Home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.view.*
import kotlinx.android.synthetic.main.row_item.view.*

class HeroHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val titleTV = view.titleTV

    fun bindHero(hero: Hero) {
        titleTV.text = hero.title
    }
}