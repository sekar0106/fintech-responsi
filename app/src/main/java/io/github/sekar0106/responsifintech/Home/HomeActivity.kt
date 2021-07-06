package io.github.sekar0106.responsifintech.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.sekar0106.responsifintech.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val arrayList = ArrayList<Model>()

        val myAdapter = MyAdapter(arrayList, this)

        recyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter

        arrayList.add(Model("Test", R.drawable.ic_profile))
        arrayList.add(Model("Test", R.drawable.ic_profile))
        arrayList.add(Model("Test", R.drawable.ic_profile))
        arrayList.add(Model("Test", R.drawable.ic_profile))
        arrayList.add(Model("Test", R.drawable.ic_profile))
        arrayList.add(Model("Test", R.drawable.ic_profile))
        arrayList.add(Model("Test", R.drawable.ic_profile))


    }
}