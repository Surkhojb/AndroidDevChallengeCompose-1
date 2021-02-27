package com.surkhojb.ktpuppy.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.bumptech.glide.request.RequestOptions
import com.surkhojb.ktpuppy.R
import com.surkhojb.ktpuppy.model.BreedType
import com.surkhojb.ktpuppy.model.Puppy
import dev.chrisbanes.accompanist.glide.GlideImage

@ExperimentalFoundationApi
@Composable
fun PuppyList(
    puppies: List<Puppy>,
    modifier: Modifier = Modifier
) {
    val puppiesNewbies = puppies.filter { it.breed == BreedType.NEWBIE }
    val puppiesRodeo = puppies.filter { it.breed == BreedType.SOME_RODEOS }
    val puppieHero = puppies.filter { it.breed == BreedType.HERO }
    LazyColumn(modifier = modifier) {
        item { PuppySection("VETERAN DOGS FROM SPAIN",puppieHero)}
        item { PuppySection("NEW BORN DOGGIES FROM SPAIN ",puppiesNewbies) }
        item { PuppySection("SOME BADASS DOGS FROM SPAIN",puppiesRodeo) }

    }
}

@Composable
fun PuppyCard(
    puppy: Puppy,
    modifier: Modifier = Modifier
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = modifier.size(180.dp,200.dp)
    ) {
        Column {
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
                error = {
                    Image(
                        painter = painterResource(id = R.drawable.ic_logo),
                        contentDescription = "error_image" )
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
    puppies: List<Puppy>
) {

    Column(modifier = Modifier.background(Color.White)) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = section,
            style = MaterialTheme.typography.subtitle1
        )
        LazyRow(modifier = Modifier.padding(end = 8.dp)) {
            items(puppies) { puppy ->
                PuppyCard(puppy, Modifier.padding(start = 16.dp))
            }
        }
    }
}






@Composable
private fun PuppyDivider() {
    Divider(
        modifier = Modifier.padding(horizontal = 14.dp),
        color = MaterialTheme.colors.onSurface.copy(alpha = 0.08f)
    )
}