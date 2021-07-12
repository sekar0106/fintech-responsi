package io.github.sekar0106.responsifintech.History

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.github.sekar0106.responsifintech.R
import kotlinx.android.extensions.LayoutContainer

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HistoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HistoryFragment : Fragment() {
    companion object {

        @JvmStatic
        fun newInstance() =
                HistoryFragment().apply {
                    arguments = Bundle().apply {
                        // putInt(ARG_COLUMN_COUNT, columnCount)
                    }
                }
    }

    private lateinit var adapter: MyQuoteAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            // columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_history, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val items = listOf(
                Model("Premature optimization is the root of all evil", null),
                Model("Any sufficiently advanced technology is indistinguishable from magic.", "Arthur C. Clarke"),
                Model("Content 01", "Source"),
                Model("Content 02", "Source"),
                Model("Content 03", "Source"),
                Model("Content 04", "Source"),
                Model("Content 05", "Source")
        )

        adapter = MyQuoteAdapter()
        adapter.replaceItems(items)
        list.adapter = adapter
    }

    class MyQuoteAdapter : RecyclerView.Adapter<MyQuoteAdapter.ViewHolder>() {
        private var items = listOf<Model>()


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.row_history, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]

            holder.contentTextView.text = item.content
            holder.sourceTextView.text = item.source
        }

        fun replaceItems(items: List<Model>) {
            this.items = items
            notifyDataSetChanged()
        }

        override fun getItemCount(): Int = items.size

        inner class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer
    }

}