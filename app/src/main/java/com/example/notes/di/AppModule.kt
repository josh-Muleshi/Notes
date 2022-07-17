package com.example.notes.di

import android.app.Application
import androidx.room.Room
import com.example.notes.feature_node.data.data_source.NoteDb
import com.example.notes.feature_node.data.repository.NoteRepositoryImpl
import com.example.notes.feature_node.domain.repository.NoteRepository
import com.example.notes.feature_node.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDb {
        return Room.databaseBuilder(
            app,
            NoteDb::class.java,
            NoteDb.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDb): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            getNote = GetNote(repository),
            addNote = AddNote(repository),
            deleteNote = DeleteNote(repository)
        )
    }
}