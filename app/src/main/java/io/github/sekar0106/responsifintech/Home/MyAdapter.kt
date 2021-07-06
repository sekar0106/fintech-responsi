package io.github.sekar0106.responsifintech.Home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import io.github.sekar0106.responsifintech.R
import kotlinx.android.synthetic.main.row_item.view.*

class MyAdapter (val arrayList:ArrayList<Model>, val context: Context) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(model: Model) {
            itemView.titleTV.text = model.title
            itemView.imageTV1.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.itemView.setOnClickListener{
            if (position == 0){
                Toast.makeText(context, "You Clicked over Newsfeed1",
                Toast.LENGTH_LONG).show()
            }
            if (position == 1){
                Toast.makeText(context, "You Clicked over Newsfeed2",
                    Toast.LENGTH_LONG).show()
            }
            if (position == 2){
                Toast.makeText(context, "You Clicked over Newsfeed3",
                    Toast.LENGTH_LONG).show()
            }
            if (position == 3){
                Toast.makeText(context, "You Clicked over Newsfeed4",
                    Toast.LENGTH_LONG).show()
            }
            if (position == 4){
                Toast.makeText(context, "You Clicked over Newsfeed5",
                    Toast.LENGTH_LONG).show()
            }
            if (position == 5){
                Toast.makeText(context, "You Clicked over Newsfeed6",
                    Toast.LENGTH_LONG).show()
            }
            if (position == 6){
                Toast.makeText(context, "You Clicked over Newsfeed7",
                    Toast.LENGTH_LONG).show()
            }
            if (position == 7){
                Toast.makeText(context, "You Clicked over Newsfeed8",
                    Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}