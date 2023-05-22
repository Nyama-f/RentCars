package com.example.rentcars.data.repository

import com.example.rentcars.data.entity.CarEntity
import com.example.rentcars.data.entity.StateOfCar
import com.example.rentcars.data.entity.TypeOfCar
import com.example.rentcars.utils.ResultWrapper

interface CarsRepository {

    suspend fun getCars(): ResultWrapper<List<CarEntity>>

    fun addCar(
        id: Int,
        markAndModel: String,
        typeOfCar: TypeOfCar,
        region: String,
        state: StateOfCar
    )

    fun deleteCar(
        id: Int,
    )

    fun changeStateCar(
        id: Int,
        state: StateOfCar
    )
}