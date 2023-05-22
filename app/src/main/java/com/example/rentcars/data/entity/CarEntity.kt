package com.example.rentcars.data.entity

import android.icu.text.CaseMap.Title

data class CarEntity(
    val id: Int,
    val markAndModel: String,
    val typeOfCar: TypeOfCar,
    val region: String,
    var state: StateOfCar
)

enum class StateOfCar(val title: String){
    IN_FLIGHT("1"), ON_REPAIR("2"), SOLD("3")
}

enum class TypeOfCar(val title: String){
    TRUCK("1"), NO_TRUCK("2")
}
