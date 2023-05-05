package com.example.wikipedia_test.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ItemPost(
    val imgurl: String,
    val txtTtle: String,
    val txtSubTitle: String,
    val txtDitail: String ,

    val trend :  Boolean ,
    val insight : String ,
    val site : String
) : Parcelable