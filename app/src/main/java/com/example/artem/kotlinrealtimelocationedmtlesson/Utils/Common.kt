package com.example.artem.kotlinrealtimelocationedmtlesson.Utils

import com.example.artem.kotlinrealtimelocationedmtlesson.Model.User
import com.example.artem.kotlinrealtimelocationedmtlesson.Remote.IFCMService
import com.example.artem.kotlinrealtimelocationedmtlesson.Remote.RetrofitClient

object Common {

    val TO_EMAIL: String = "ToEmail"
    val TO_UID: String = "ToUid"
    val FROM_EMAIL: String = "FromEmail"
    val FROM_UID: String = "FromUid"
    val ACCEPT_LIST: String = "acceptList"
    val USER_UID_SAVE_KEY: String = "SAVE_KEY"
    val TOKENS: String = "Tokens"
    lateinit var loggedUser: User
    val USER_INFO: String = "UserInfo"

    val fcmService: IFCMService
    get() = RetrofitClient.getClient("https://fcm.googleapis.com/").create(IFCMService::class.java)
}