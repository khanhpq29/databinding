package pq.khanh.vn.trackandroidnew.extensions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

/**
 * Created by khanhpq on 2/12/18.
 */
fun ViewGroup?.inflateLayout(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(this?.context).inflate(layoutId, this, attachToRoot)
}

fun Context.showToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()