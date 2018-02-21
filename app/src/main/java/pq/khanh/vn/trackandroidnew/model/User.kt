package pq.khanh.vn.trackandroidnew.model

import android.databinding.BaseObservable
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by khanhpq on 2/9/18.
 */
@Parcelize
data class User(val firstName: String = "",
                val url: String = "",
                val lastName: String = "",
                val age: Int = 0,
                val comment: Int = 0) : Parcelable, BaseObservable()