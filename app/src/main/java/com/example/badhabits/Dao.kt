package com.example.badhabits
import androidx.room.Dao
import androidx.room.Insert

@Dao
interface Dao {
    @Insert
    fun insertHabit(habit: Habit)

    fun getAllHabit(): List<Habit>


}