package io.github.taetae98coding.kotlinx.flow.collection

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.mapLatest
import kotlin.jvm.JvmName

public fun <T, R> Flow<Collection<T>>.mapCollection(transform: (T) -> R): Flow<List<R>> {
    return map { it.map(transform) }
}

@JvmName("mapNullableCollection")
public fun <T, R> Flow<Collection<T>?>.mapCollection(transform: (T) -> R): Flow<List<R>?> {
    return map { it?.map(transform) }
}

@OptIn(ExperimentalCoroutinesApi::class)
public fun <T, R> Flow<Collection<T>>.mapLatestCollection(transform: (T) -> R): Flow<List<R>> {
    return mapLatest { it.map(transform) }
}

@OptIn(ExperimentalCoroutinesApi::class)
@JvmName("mapLatestNullableCollection")
public fun <T, R> Flow<Collection<T>?>.mapLatestCollection(transform: (T) -> R): Flow<List<R>?> {
    return mapLatest { it?.map(transform) }
}
