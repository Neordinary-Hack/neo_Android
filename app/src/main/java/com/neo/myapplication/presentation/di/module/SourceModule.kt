package com.neo.myapplication.presentation.di.module

import com.neo.myapplication.data.remote.source.EventRemoteSource
import com.neo.myapplication.data.remote.source.LocationRemoteSource
import com.neo.myapplication.data.remote.source.ReviewRemoteSource
import com.neo.myapplication.data.remote.source.UserRemoteSource
import com.neo.myapplication.domain.source.EventSource
import com.neo.myapplication.domain.source.LocationSource
import com.neo.myapplication.domain.source.ReviewSource
import com.neo.myapplication.domain.source.UserSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class SourceModule {

    @Binds
    abstract fun bindLocationSource(locationRemoteSource: LocationRemoteSource) : LocationSource

    @Binds
    abstract fun bindEventSource(eventRemoteSource: EventRemoteSource) : EventSource

    @Binds
    abstract fun bindReviewSource(reviewRemoteSource: ReviewRemoteSource) : ReviewSource

    @Binds
    abstract fun bindUserSource(userRemoteSource: UserRemoteSource) : UserSource
}