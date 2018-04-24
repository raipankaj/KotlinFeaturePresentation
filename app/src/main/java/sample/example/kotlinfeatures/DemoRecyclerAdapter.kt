package sample.example.kotlinfeatures

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import sample.example.kotlinfeatures.utils.inflateAdapterLayout

class DemoRecyclerAdapter:RecyclerView.Adapter<DemoRecyclerAdapter.DemoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoViewHolder {
        val view = parent.inflateAdapterLayout(R.layout.adapter_demo_item)

        return DemoViewHolder(view)
    }

    override fun getItemCount() = 10

    override fun onBindViewHolder(holder: DemoViewHolder, position: Int) {

    }

    inner class DemoViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }
}