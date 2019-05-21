package com.example.artem.kotlinrealtimelocationedmtlesson.Interface

interface IFirebaseLoadDone {
    fun onFireBaseLoadUserDone(lstEmail: List<String>)
    fun onFireBaseLoadFailed(message: String)
}