package kr.co.yeeunlee.own.project1.mywriting.data.repository

import androidx.lifecycle.LiveData
import kr.co.yeeunlee.own.project1.mywriting.data.model.User
import kr.co.yeeunlee.own.project1.mywriting.utils.states.AuthenticationState
import kr.co.yeeunlee.own.project1.mywriting.utils.states.NetworkState

interface Repository {
    fun setNewUser(
        username: String,
        userEmail: String,
        callback: (userStatus: NetworkState) -> Unit
    )

    fun isLoginState(callback: (loginState: AuthenticationState) -> Unit)

    fun getUserLiveData(): LiveData<Pair<User?, AuthenticationState>>

    fun logout(callback: (userStatus: NetworkState) -> Unit)
}