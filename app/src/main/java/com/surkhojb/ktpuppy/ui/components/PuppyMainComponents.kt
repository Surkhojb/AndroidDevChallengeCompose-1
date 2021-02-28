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
package com.surkhojb.ktpuppy.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.bumptech.glide.request.RequestOptions
import com.surkhojb.ktpuppy.model.BreedType
import com.surkhojb.ktpuppy.model.Puppy
import dev.chrisbanes.accompanist.glide.GlideImage
import java.util.Random

@ExperimentalFoundationApi
@Composable
fun PuppyList(
    puppies: List<Puppy>,
    modifier: Modifier = Modifier,
    clickAction: (Puppy) -> Unit
) {
    val puppiesNewbies = puppies.filter { it.breed == BreedType.NEWBIE }
    val puppiesRodeo = puppies.filter { it.breed == BreedType.SOME_RODEOS }
    val puppieHero = puppies.filter { it.breed == BreedType.HERO }
    LazyColumn(modifier = modifier) {
        item { PuppySection("VETERAN DOGS IN ADOPTION FROM SPAIN", puppieHero, clickAction) }
        item { PuppySection("NEW BORN DOGGIES IN ADOPTION FROM SPAIN ", puppiesNewbies, clickAction) }
        item { PuppySection("SOME BADASS DOGS IN ADOPTION FROM SPAIN", puppiesRodeo, clickAction) }
    }
}

@Composable
fun PuppyCard(
    puppy: Puppy,
    modifier: Modifier = Modifier
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = modifier.size(180.dp, 200.dp)
    ) {
        Column(modifier = Modifier.background(Color(getRandomColor()))) {
            GlideImage(
                data = puppy.image.toString(),
                contentDescription = "Puppy",
                modifier = Modifier
                    .height(120.dp),
                requestBuilder = {
                    val options = RequestOptions()
                    options.centerCrop()
                    apply(options)
                },
                loading = {
                    Box(Modifier.matchParentSize()) {
                        CircularProgressIndicator(Modifier.align(Alignment.Center))
                    }
                }
            )

            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = puppy.name.toString(),
                    style = MaterialTheme.typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = puppy.age.toString(),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.body2
                )
            }
        }
    }
}

@ExperimentalFoundationApi
@Composable
private fun PuppySection(
    section: String,
    puppies: List<Puppy>,
    clickAction: (Puppy) -> Unit
) {

    Column(modifier = Modifier.background(Color.White)) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = section,
            style = MaterialTheme.typography.subtitle1
        )
        LazyRow(modifier = Modifier.padding(end = 8.dp)) {
            items(puppies) { puppy ->
                PuppyCard(puppy, Modifier.padding(start = 16.dp).clickable { clickAction(puppy) })
            }
        }
    }
}

private fun getRandomColor(): Int {
    val rnd = Random()
    val color: Int = android.graphics.Color.argb(128, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
    return color
}
