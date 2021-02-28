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
package com.surkhojb.ktpuppy.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import com.surkhojb.ktpuppy.data.PuppyRepository
import com.surkhojb.ktpuppy.model.Puppy
import com.surkhojb.ktpuppy.navigateTo
import com.surkhojb.ktpuppy.openUrl
import com.surkhojb.ktpuppy.ui.components.PuppyList
import com.surkhojb.ktpuppy.ui.detail.DetailActivity
import com.surkhojb.ktpuppy.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    @ExperimentalFoundationApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                Surface(){
                    PuppyList(PuppyRepository.getAll()){
                        when(it.id){
                            12345L,678910L,1112131415L -> { this.openUrl(it.contactUrl.toString())}
                            else -> { navigateToDetail(it)}
                        }
                    }
                }
            }
        }
    }

    private fun navigateToDetail(puppy: Puppy){
        val bundle = Bundle()
        bundle.putSerializable("puppy_key", puppy)
        this.navigateTo(DetailActivity::class,bundle)
    }
}