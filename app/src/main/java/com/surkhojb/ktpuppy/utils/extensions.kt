package com.surkhojb.ktpuppy

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import androidx.compose.ui.Modifier
import java.util.*
import kotlin.collections.ArrayList
import kotlin.reflect.KClass

fun <T> merge(vararg lists: List<T>): List<T> {
    return object : ArrayList<T>() {
        init {
            lists.forEach {
                addAll(it)
            }
        }
    }
}

fun Activity.navigateTo(destination: KClass<*>, withExtras: Bundle? = null){
    val intent = Intent(this,destination.java)
    withExtras?.apply {
        intent.putExtras(this)
    }

    startActivity(intent)
}

fun Activity.openUrl(url: String){
    this.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
}