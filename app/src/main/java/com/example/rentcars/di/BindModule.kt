package com.teamforce.thanksapp.di


import com.example.rentcars.data.repository.ProfileRepository
import com.example.rentcars.data.repository.impl.ProfileRepositoryImpl
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface BindModule {


    fun bindProfileRepository(profileRepositoryImpl: ProfileRepositoryImpl): ProfileRepository



}