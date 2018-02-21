package pq.khanh.vn.trackandroidnew.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import pq.khanh.vn.trackandroidnew.R
import pq.khanh.vn.trackandroidnew.databinding.ItemUserBinding
import pq.khanh.vn.trackandroidnew.model.User
import pq.khanh.vn.trackandroidnew.presenter.UserPresenter

/**
 * Created by khanhpq on 2/12/18.
 */
class UserAdapter(private val users : MutableList<User>) : RecyclerView.Adapter<UserHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): UserHolder {
        val inflater = LayoutInflater.from(parent?.context)
        val view = DataBindingUtil.inflate<ItemUserBinding>(inflater, R.layout.item_user, parent, false)
        return UserHolder(view)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserHolder?, position: Int) {
        val user = users[position]
        val utl = holder?.itemUserBinding
        utl?.presenter = UserPresenter(user)
    }
}