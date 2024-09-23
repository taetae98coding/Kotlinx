package io.github.taetae98coding.kotlinx.datetime.localdate

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.atStartOfDayIn
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.todayIn

public fun LocalDate.Companion.todayIn(
    clock: Clock = Clock.System,
    timeZone: TimeZone = TimeZone.currentSystemDefault()
): LocalDate {
    return clock.todayIn(timeZone)
}

public fun LocalDate.toTimeInMillis(): Long {
    return atStartOfDayIn(TimeZone.UTC).toEpochMilliseconds()
}

public fun Long.toLocalDate(): LocalDate {
    return Instant.fromEpochMilliseconds(this)
        .toLocalDateTime(TimeZone.UTC)
        .date
}
