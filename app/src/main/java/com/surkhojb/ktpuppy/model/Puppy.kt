package com.surkhojb.ktpuppy.model

data class Puppy(
    val id: Long,
    val name: String? = "",
    val age: String? = "",
    val gender: GenderType? = null,
    val image: String? = "",
    val breed: BreedType? = null,
    val description: String? = "",
    val contactUrl: String? = ""
)

enum class GenderType {
    FEMALE,
    MALE
}

enum class BreedType {
    NEWBIE,
    SOME_RODEOS,
    HERO
}