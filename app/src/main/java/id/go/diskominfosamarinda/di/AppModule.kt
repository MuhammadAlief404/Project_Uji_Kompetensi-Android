package id.go.diskominfosamarinda.di

import com.alieflab.core.domain.usecase.ContentInteractor
import com.alieflab.core.domain.usecase.ContentUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun provideContentUseCase(contentInteractor: ContentInteractor): ContentUseCase
}