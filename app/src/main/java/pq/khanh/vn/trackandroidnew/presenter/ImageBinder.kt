package pq.khanh.vn.trackandroidnew.presenter

import android.databinding.BindingAdapter
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import pq.khanh.vn.trackandroidnew.R

/**
 * Created by khanhpq on 2/9/18.
 */
object ImageBinder {
    @JvmStatic
    @BindingAdapter("android:src")
    fun loadImage(imgView: ImageView, url: String) {
        Glide.with(imgView.context).load(url).error(R.mipmap.ic_launcher_round).into(imgView)
    }

    @JvmStatic
    @BindingAdapter("android:visibility")
    fun show(textView: TextView, comments : Int){
        if (comments > 0){
            textView.visibility = View.VISIBLE
            return
        }
        textView.visibility = View.GONE
    }

//    @JvmStatic
//    @BindingAdapter("android:text")
//    fun showText(textView : TextView, user : User) {
//        textView.text = "${user.firstName} ${user.lastName}"
//    }

}