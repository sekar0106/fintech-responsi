package io.github.sekar0106.responsifintech.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import io.github.sekar0106.responsifintech.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val listHeroes = listOf(
            Hero(title = "Thor", image = ""),
            Hero(title = "Captain America", image = ""),
            Hero(title = "Iron Man", image = "")
        )

        val heroesAdapter = MyAdapter(listHeroes)

        rv_recyclerView.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = heroesAdapter
        }
    }
}
