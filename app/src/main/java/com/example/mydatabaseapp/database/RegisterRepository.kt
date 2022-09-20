package com.example.mydatabaseapp.database

import android.util.Log
import androidx.lifecycle.LiveData

class RegisterRepository(private val dao: RegisterDatabaseDao) {

    val users = dao.getAllUsers()
    suspend fun insert(user: RegisterEntity) {
        return dao.insert(user)
    }

    suspend fun getUserName(email: String):RegisterEntity?{
        return dao.getUserEmail(email)
    }
    //suspend fun deleteAll(): Int {
    //    return dao.deleteAll()
    //}

}