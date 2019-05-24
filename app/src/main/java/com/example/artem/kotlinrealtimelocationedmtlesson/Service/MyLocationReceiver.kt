package com.example.artem.kotlinrealtimelocationedmtlesson.Service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.artem.kotlinrealtimelocationedmtlesson.Utils.Common
import com.google.android.gms.location.LocationResult
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import io.paperdb.Paper

class MyLocationReceiver: BroadcastReceiver() {

    lateinit var publicLocation: DatabaseReference
    lateinit var uid: String

    init {
        publicLocation = FirebaseDatabase.getInstance().getReference(Common.PUBLIC_LOCATION)
    }

    companion object{
        val ACTION = "com.example.artem.kotlinrealtimelocationedmtlesson.UPDATE_LOCATION"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        Paper.init(context!!)

        uid = Paper.book().read(Common.USER_UID_SAVE_KEY)
        if (intent != null){
            val action = intent.action
            if (action == ACTION){
                val result = LocationResult.extractResult(intent)
                if (result != null){
                    val location = result.lastLocation
                    if (Common.loggedUser != null){
                        //App is running
                        publicLocation.child(Common.loggedUser!!.uid!!).setValue(location)
                    }else {
                        //App in killed mode
                        publicLocation.child(uid).setValue(location)
                    }
                }
            }
        }
    }

}