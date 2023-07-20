package com.example.badhabits

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habits")
data class Habit(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "startDate")
    var startDate: String,
    @ColumnInfo(name = "endDate")
    var endDate: String,
    @ColumnInfo(name = "goal")
    var goal: String,
    @ColumnInfo(name = "record")
    var record: String,
    @ColumnInfo(name = "numberAttemps")
    var numberAttemps : String,
    @ColumnInfo(name = "comment")
    var comment: String
)

@Entity(tableName = "achievements")
data class Achievement(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "giveDate")
    var giveDate: String,
    @ColumnInfo(name = "comment")
    var comment: String
)