package com.example.rentcars.data.entity

import android.icu.text.CaseMap.Title

data class CarEntity(
    val id: Int,
    val markAndModel: String,
    // Сделать в виде Enum
    val typeOfCar: TypeOfCar,
    val region: String,
    // Сделать в виде Enum
    val state: StateOfCar
)

enum class StateOfCar(val title: String){
    IN_FLIGHT("1"), ON_REPAIR("2"), SOLD("3")
}

enum class TypeOfCar(val title: String){
    TRUCK("1"), NO_TRUCK("2")
}
