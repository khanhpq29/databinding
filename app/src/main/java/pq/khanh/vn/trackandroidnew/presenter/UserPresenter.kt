package pq.khanh.vn.trackandroidnew.presenter

import android.databinding.BaseObservable
import android.view.View
import android.widget.Toast
import pq.khanh.vn.trackandroidnew.extensions.showToast
import pq.khanh.vn.trackandroidnew.model.User

/**
 * Created by khanhpq on 2/9/18.
 */
class UserPresenter(val user: User) : BaseObservable() {
    fun fullName(): String {
        return "${user.firstName} ${user.lastName}"
    }

    fun getAge() : String {
        return user.age.toString()
    }

    fun getComment() : Int {
        return user.comment
    }

    fun getUrlImage() : String{
        return user.url
    }

    fun itemClick() : View.OnClickListener {
        return View.OnClickListener {
            it.context.showToast("onclick")
        }
    }
}