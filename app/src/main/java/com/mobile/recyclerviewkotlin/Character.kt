package com.mobile.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val imgCharacter: Int,
    val nameCharacter: String,
    val descCharacter:  String
) : Parcelable
