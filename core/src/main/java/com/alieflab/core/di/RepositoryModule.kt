package com.alieflab.core.di

import com.alieflab.core.data.source.AppRepositoryImpl
import com.alieflab.core.domain.repository.AppRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(repository: AppRepositoryImpl): AppRepository
}