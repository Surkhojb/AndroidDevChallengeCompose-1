package com.surkhojb.ktpuppy

fun <T> merge(vararg lists: List<T>): List<T> {
    return object : ArrayList<T>() {
        init {
            lists.forEach {
                addAll(it)
            }
        }
    }
}