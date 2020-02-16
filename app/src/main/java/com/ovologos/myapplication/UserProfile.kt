package com.ovologos.myapplication

import android.annotation.SuppressLint
import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     15/02/2020 - 22:10     ║
╚════════════════════════════╝
 */
@Parcelize
data class UserProfile(
    val keyName: String,
    val keyAge: Int,
    val keyIsMale: Boolean
) : Parcelable

//
//    : Parcelable {
//
//    constructor(parcel: Parcel) : this(
//        parcel.readString()!!,
//        parcel.readInt(),
//        parcel.readByte() != 0.toByte()
//    )
//
//    override fun writeToParcel(dest: Parcel?, flags: Int) {
//        dest?.writeString(keyName)
//        dest?.writeInt(keyAge)
//
//        if (keyIsMale) {
//            dest?.writeByte(1.toByte())
//        } else {
//            dest?.writeByte(0.toByte())
//        }
//
////        if(Build.VERSION.SDK_INT == Build.VERSION_CODES.Q){
////            dest?.writeBoolean(keyIsMale)
////        }
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<UserProfile> {
//        override fun createFromParcel(parcel: Parcel): UserProfile {
//            return UserProfile(parcel)
//        }
//
//        override fun newArray(size: Int): Array<UserProfile?> {
//            return arrayOfNulls(size)
//        }
//    }
//}