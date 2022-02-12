package com.rahul.sharedviewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel:ViewModel() {
    var message = MutableLiveData<String>()


    fun sendMessage(newMessage:String){
        message.value =newMessage
    }
}