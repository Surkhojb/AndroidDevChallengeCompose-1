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
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.surkhojb.ktpuppy.data.PuppyRepository
import com.surkhojb.ktpuppy.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    @ExperimentalFoundationApi
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                Surface(color = Color.LightGray){
                    Text(
                        modifier = Modifier
                            .padding(16.dp)
                            .background(Color.White),
                        text = "All the dogs are real dogs in adoption from Spain.",
                        style = MaterialTheme.typography.caption,
                        fontStyle = FontStyle.Italic,
                        color = Color.Black
                    )
                    PuppyList(PuppyRepository.getAll())
                }
            }
        }
    }
}