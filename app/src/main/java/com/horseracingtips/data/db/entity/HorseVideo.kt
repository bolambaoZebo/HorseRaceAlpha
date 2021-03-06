package com.horseracingtips.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "horse_race")
data class HorseVideo(
    @PrimaryKey(autoGenerate = false)
    var id: Int? = null,
    var channel: String? = null,
    var title: String? = null,
    var imageUrl: String? = null,
    var description: String? = null
)


