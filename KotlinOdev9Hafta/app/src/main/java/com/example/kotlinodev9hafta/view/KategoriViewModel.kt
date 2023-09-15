package com.example.kotlinodev9hafta.view

import androidx.lifecycle.ViewModel
import com.example.kotlinodev9hafta.repo.DataRepo

class KategoriViewModel: ViewModel() {
    val krepo = DataRepo()
}