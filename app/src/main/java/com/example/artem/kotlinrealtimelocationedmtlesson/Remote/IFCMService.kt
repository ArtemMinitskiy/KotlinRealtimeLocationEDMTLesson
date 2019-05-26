package com.example.artem.kotlinrealtimelocationedmtlesson.Remote

import com.example.artem.kotlinrealtimelocationedmtlesson.Model.MyResponse
import com.example.artem.kotlinrealtimelocationedmtlesson.Model.Request
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface IFCMService {
    @Headers("Content-Type:application/json", "Authorization:key=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
    @POST("fcm/send")
    fun sendFriendRequestToUser(@Body body: Request):Observable<MyResponse>

}
