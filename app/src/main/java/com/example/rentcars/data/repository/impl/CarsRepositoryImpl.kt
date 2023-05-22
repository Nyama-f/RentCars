package com.example.rentcars.data.repository.impl

import com.example.rentcars.data.entity.CarEntity
import com.example.rentcars.data.entity.StateOfCar
import com.example.rentcars.data.entity.TypeOfCar
import com.example.rentcars.data.repository.CarsRepository
import com.example.rentcars.utils.ResultWrapper
import com.example.rentcars.utils.safeApiCall
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class CarsRepositoryImpl @Inject constructor(

) : CarsRepository {

    private val cars: MutableList<CarEntity> = mutableListOf(
        CarEntity(
            1,
            "Toyota Altezza",
            TypeOfCar.NO_TRUCK,
            region = "Asia/Japan",
            state = StateOfCar.ON_REPAIR
        ),
        CarEntity(
            2,
            "Audi A6",
            TypeOfCar.NO_TRUCK,
            region = "Europe/Germany",
            state = StateOfCar.IN_FLIGHT
        ),
        CarEntity(
            3,
            "Hyndai Smth",
            TypeOfCar.TRUCK,
            region = "Asia/Yekaterinburg",
            state = StateOfCar.SOLD
        ),
        CarEntity(
            4,
            "Lada Vesta",
            TypeOfCar.NO_TRUCK,
            region = "Asia/Chelyabinsk",
            state = StateOfCar.ON_REPAIR
        ),
        CarEntity(
            5,
            "Nissan X-Trail",
            TypeOfCar.NO_TRUCK,
            region = "Europe/Moscow",
            state = StateOfCar.IN_FLIGHT
        ),
    )

    override suspend fun getCars(): ResultWrapper<List<CarEntity>> {
        return safeApiCall(Dispatchers.IO) {
            cars
        }
    }

    override fun addCar(
        id: Int,
        markAndModel: String,
        typeOfCar: TypeOfCar,
        region: String,
        state: StateOfCar
    ) {
        cars.add(
            CarEntity(
                id, markAndModel, typeOfCar, region, state
            )
        )
    }

    override fun deleteCar(id: Int) {
        cars.removeAt(id)
    }

    override fun changeStateCar(id: Int, newState: StateOfCar) {
        cars[id].state = newState
    }

}