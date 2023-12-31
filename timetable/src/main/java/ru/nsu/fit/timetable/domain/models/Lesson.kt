package ru.nsu.fit.timetable.domain.models

import ru.nsu.fit.common.models.LessonParity
import ru.nsu.fit.common.models.LessonType

data class Lesson(
    var id: Int? = 0,
    var place: Place = place { },
    var startTime: String = "",
    var finishTime:  String = "",
    var subject: String = "",
    var teacher: String = "",
    var lessonType: LessonType = LessonType.LECTURE,
    var parity: LessonParity = LessonParity.ALWAYS,
)

fun lesson(block: Lesson.() -> Unit) = Lesson().apply(block)