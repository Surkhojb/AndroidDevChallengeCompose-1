/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.surkhojb.ktpuppy

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
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

fun Activity.navigateTo(destination: KClass<*>, withExtras: Bundle? = null) {
    val intent = Intent(this, destination.java)
    withExtras?.apply {
        intent.putExtras(this)
    }

    startActivity(intent)
}

fun Activity.openUrl(url: String) {
    this.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
}
