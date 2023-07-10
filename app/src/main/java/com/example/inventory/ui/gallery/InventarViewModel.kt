package com.example.inventory.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InventarViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hier wird das Inventar entstehen"
    }
    val text: LiveData<String> = _text
}