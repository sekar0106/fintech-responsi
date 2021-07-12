package io.github.sekar0106.responsifintech.Setting

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.sekar0106.responsifintech.Login.LoginActivity
import io.github.sekar0106.responsifintech.R
import javax.security.auth.login.LoginException

abstract class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val imageTV = arrayOf("d116df5",
            "36ffc75", "f5cfe78", "5b87628",
            "db8d14e", "9913dc4", "e120f96",
            "466251b")

    private val titleTV = arrayOf("Profile", "Account Bank",
            "Credit Card", "Password",
            "Help")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imageTV: ImageView
        var titleTV: TextView

        init {
            imageTV = itemView.findViewById(R.id.imageTV)
            titleTV = itemView.findViewById(R.id.titleTV)


            itemView.setOnClickListener {
                val position: Int = getAdapterPosition()
                val context = itemView.context
                //coba inii
                val intent = Intent(context, LoginActivity::class.java).apply {
                    putExtra("NUMBER", position)
                    putExtra("TITLE", titleTV.text)

                }
                context.startActivity(intent)
            }
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.row_setting, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.titleTV.text = titleTV[i]


    }

    override fun getItemCount(): Int {
        return titleTV.size
    }
}

