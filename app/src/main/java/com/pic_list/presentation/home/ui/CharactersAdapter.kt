package com.pic_list.presentation.home.ui

import android.os.Parcel
import android.os.Parcelable

class CharactersAdapter {
}

class Test: java.io.Serializable {


}

class Ser(): Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }

    companion object CREATOR : Parcelable.Creator<Ser> {
        override fun createFromParcel(parcel: Parcel): Ser {
            return Ser(parcel)
        }

        override fun newArray(size: Int): Array<Ser?> {
            return arrayOfNulls(size)
        }
    }
}