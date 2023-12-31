package ru.nsu.fit.timetable.data.schedule_repository.remote_data_source.models

import kotlinx.serialization.Serializable
import ru.nsu.fit.common.models.LessonParity
import ru.nsu.fit.common.models.LessonType

@Serializable
data class LessonRemote(
    var id: Int? = 0,
    var place: PlaceRemote? = placeRemote { },
    var subject: String? = "",
    var teacher: String? = "",
    var startTime: String = "",
    var finishTime: String = "",
    var type: LessonType? = LessonType.SEMINAR,
    var parity: LessonParity? = LessonParity.ALWAYS,
)

fun lessonRemote(block: LessonRemote.() -> Unit) = LessonRemote().apply(block)


