package com.example.artem.kotlinrealtimelocationedmtlesson.ViewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.artem.kotlinrealtimelocationedmtlesson.Interface.IRecyclerItemClickListener
import com.example.artem.kotlinrealtimelocationedmtlesson.R
import kotlinx.android.synthetic.main.layout_user.view.*

class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {

    var txt_user_email: TextView
    lateinit var iRecyclerItemClickListener: IRecyclerItemClickListener

    fun setClick(iRecyclerItemClickListener: IRecyclerItemClickListener){
        this.iRecyclerItemClickListener = iRecyclerItemClickListener
    }

    init {
        txt_user_email = itemView.findViewById(R.id.txt_user_email) as TextView

        itemView.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        iRecyclerItemClickListener.onItemClickListenere(v!!, adapterPosition)
    }
}