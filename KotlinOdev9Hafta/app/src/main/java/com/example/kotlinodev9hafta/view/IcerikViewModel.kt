package com.example.kotlinodev9hafta.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinodev9hafta.data.Bilmeceler
import com.example.kotlinodev9hafta.data.Fikra
import com.example.kotlinodev9hafta.data.Masal
import com.example.kotlinodev9hafta.data.Tekerleme
import com.example.kotlinodev9hafta.repo.DataRepo
import kotlinx.coroutines.flow.collectLatest

class IcerikViewModel(private val repository: DataRepo) : ViewModel() {

    private val _masallarLiveData = MutableLiveData<List<Masal>>()
    val masallarLiveData: LiveData<List<Masal>>
        get() = _masallarLiveData

    private val _fikralarLiveData = MutableLiveData<List<Fikra>>()
    val fikralarLiveData: LiveData<List<Fikra>>
        get() = _fikralarLiveData

    private val _tekerlemelerLiveData = MutableLiveData<List<Tekerleme>>()
    val tekerlemelerLiveData: LiveData<List<Tekerleme>>
        get() = _tekerlemelerLiveData

    private val _bilmecelerLiveData = MutableLiveData<List<Bilmeceler>>()
    val bilmecelerLiveData: LiveData<List<Bilmeceler>>
        get() = _bilmecelerLiveData

    init {
        viewModelScope.launch {
            repository.getMasallar().collectLatest { masallar ->
                _masallarLiveData.value = masallar
            }
        }

        viewModelScope.launch {
            repository.getFikralar().collectLatest { fikralar ->
                _fikralarLiveData.value = fikralar
            }
        }

        viewModelScope.launch {
            repository.getTekerlemeler().collectLatest { tekerlemeler ->
                _tekerlemelerLiveData.value = tekerlemeler
            }
        }

        viewModelScope.launch {
            repository.getBilmeceler().collectLatest { bilmeceler ->
                _bilmecelerLiveData.value = bilmeceler
            }
        }
    }

    fun setMasallar(masallar: List<Masal>) {
        _masallarLiveData.value = masallar
    }

    fun setFikralar(fikralar: List<Fikra>) {
        _fikralarLiveData.value = fikralar
    }

    fun setTekerlemeler(tekerlemeler: List<Tekerleme>) {
        _tekerlemelerLiveData.value = tekerlemeler
    }

    fun setBilmeceler(bilmeceler: List<Bilmeceler>) {
        _bilmecelerLiveData.value = bilmeceler
    }
}
