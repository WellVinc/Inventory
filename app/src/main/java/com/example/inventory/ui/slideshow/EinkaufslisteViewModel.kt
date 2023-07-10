package com.example.inventory.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EinkaufslisteViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hier wird die Einkaufsliste entstehen"
    }
    val text: LiveData<String> = _text
}