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
            state = StateOfCar.ON_REPAIR,
            image = "https://a.d-cd.net/JIiHMbeYNwER5aQRQ-zt-9A1QLI-1920.jpg"
        ),
        CarEntity(
            2,
            "Audi A6",
            TypeOfCar.NO_TRUCK,
            region = "Europe/Germany",
            state = StateOfCar.IN_FLIGHT,
            image = "https://s0.rbk.ru/v6_top_pics/resized/1440xH/media/img/6/06/755773633153066.jpg"
        ),
        CarEntity(
            3,
            "Hyndai Smth",
            TypeOfCar.TRUCK,
            region = "Asia/Yekaterinburg",
            state = StateOfCar.SOLD,
            image = "https://www.autostat.ru/application/includes/blocks/big_photo/images/cache/000/098/048/22bd1f69-670-0.jpg?_=1637233323"
        ),
        CarEntity(
            4,
            "Lada Vesta",
            TypeOfCar.NO_TRUCK,
            region = "Asia/Chelyabinsk",
            state = StateOfCar.ON_REPAIR,
            image = "https://5koleso.ru/wp-content/uploads/2021/04/lada-vesta-sport-p2-08.jpg"
        ),
        CarEntity(
            5,
            "Subaru Impreza",
            TypeOfCar.NO_TRUCK,
            region = "Europe/Moscow",
            state = StateOfCar.IN_FLIGHT,
            image = "https://all-auto.org/wp-content/uploads/2020/10/Subaru-WRX-2-1.jpg"
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
        state: StateOfCar,
        image: String?
    ) {
        cars.add(
            CarEntity(
                id, markAndModel, typeOfCar, region, state, image
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