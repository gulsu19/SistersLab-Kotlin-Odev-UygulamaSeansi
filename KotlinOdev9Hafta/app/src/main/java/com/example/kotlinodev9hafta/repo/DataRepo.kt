package com.example.kotlinodev9hafta.repo

import com.example.kotlinodev9hafta.data.Bilmeceler
import com.example.kotlinodev9hafta.data.Fikra
import com.example.kotlinodev9hafta.data.Masal
import com.example.kotlinodev9hafta.data.Tekerleme
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow


class DataRepo {
    private val database = Firebase.database.reference

    fun getMasallar(): Flow<List<Masal>> = callbackFlow {
        val masallarRef = database.child("masallar")
        val eventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val masallar = dataSnapshot.children.mapNotNull { it.getValue<Masal>() }
                offer(masallar)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                close(databaseError.toException())
            }
        }
        masallarRef.addValueEventListener(eventListener)
        awaitClose { masallarRef.removeEventListener(eventListener) }
    }

    fun getFikralar(): Flow<List<Fikra>> = callbackFlow {
        val fikralarRef = database.child("fikralar")
        val eventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val fikralar = dataSnapshot.children.mapNotNull { it.getValue<Fikra>() }
                offer(fikralar)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                close(databaseError.toException())
            }
        }
        fikralarRef.addValueEventListener(eventListener)
        awaitClose { fikralarRef.removeEventListener(eventListener) }
    }

    fun getTekerlemeler(): Flow<List<Tekerleme>> = callbackFlow {
        val tekerlemelerRef = database.child("tekerlemeler")
        val eventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val tekerlemeler = dataSnapshot.children.mapNotNull { it.getValue<Tekerleme>() }
                offer(tekerlemeler)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                close(databaseError.toException())
            }
        }
        tekerlemelerRef.addValueEventListener(eventListener)
        awaitClose { tekerlemelerRef.removeEventListener(eventListener) }
    }

    fun getBilmeceler(): Flow<List<Bilmeceler>> = callbackFlow {
        val bilmecelerRef = database.child("bilmeceler")
        val eventListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val bilmeceler = dataSnapshot.children.mapNotNull { it.getValue<Bilmeceler>() }
                offer(bilmeceler)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                close(databaseError.toException())
            }
        }
        bilmecelerRef.addValueEventListener(eventListener)
        awaitClose { bilmecelerRef.removeEventListener(eventListener) }
    }
}