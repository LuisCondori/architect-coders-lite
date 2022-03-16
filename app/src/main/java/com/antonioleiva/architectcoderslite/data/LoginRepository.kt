package com.antonioleiva.architectcoderslite.data

class LoginRepository(
    private val remoteDataSource: LoginRemoteDataSource = LoginRemoteDataSourceImpl()
) {
    suspend fun tryLogin(user: String, pass: String): LoginResult =
        remoteDataSource.tryLogin(user, pass)
}

