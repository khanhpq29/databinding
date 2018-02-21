package pq.khanh.vn.trackandroidnew.view

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import pq.khanh.vn.trackandroidnew.R
import pq.khanh.vn.trackandroidnew.adapter.UserAdapter
import pq.khanh.vn.trackandroidnew.databinding.ActivityBasicBinding
import pq.khanh.vn.trackandroidnew.model.DumpData

class BasicActivity : AppCompatActivity() {
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityBasicBinding>(this, R.layout.activity_basic)
        val user = DumpData.createUserList()
        userAdapter = UserAdapter(user)
        binding.rcvUsers.layoutManager = LinearLayoutManager(this)
        binding.rcvUsers.adapter = userAdapter
        binding.rcvUsers.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

    }
}
