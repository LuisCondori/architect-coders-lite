package com.antonioleiva.architectcoderslite.data

interface LoginRemoteDataSource{
    suspend fun tryLogin(user: String, pass: String): LoginResult
}

