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
package com.surkhojb.ktpuppy.ui.detail

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle.Italic
import androidx.compose.ui.unit.dp
import com.surkhojb.ktpuppy.R
import com.surkhojb.ktpuppy.model.Puppy
import com.surkhojb.ktpuppy.openUrl
import com.surkhojb.ktpuppy.ui.theme.MyTheme
import dev.chrisbanes.accompanist.glide.GlideImage

class DetailActivity : AppCompatActivity() {

    private val puppySelected: Puppy by lazy {
        intent?.getSerializableExtra("puppy_key") as Puppy
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                DetailContent(puppy = puppySelected)
            }
        }
    }

    @Composable
    fun DetailContent(puppy: Puppy) {
        Scaffold {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                item {
                    Detail(puppy)
                }
            }
        }
    }

    @Composable
    fun Detail(puppy: Puppy) {

        Box(Modifier.height(250.dp)) {
            GlideImage(
                data = puppy.image.toString(),
                contentDescription = "Dog Image",
                contentScale = ContentScale.None
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 22.dp, start = 22.dp, end = 22.dp, top = 12.dp)
        ) {
            Text(
                text = "Hi, I am ${puppy.name}",
                style = MaterialTheme.typography.h4,
                color = Color.Black
            )
            Spacer(Modifier.height(5.dp))

            Text(
                text = puppy.description.toString(),
                style = MaterialTheme.typography.body2,
                fontStyle = Italic,
                color = Color.Black
            )
            Spacer(Modifier.height(8.dp))

            Button(
                onClick = { this@DetailActivity.openUrl(puppy.contactUrl.toString()) },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(R.color.teal_700)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Adopt Me",
                    color = Color.White,
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )
            }
        }
    }
}
