package com.surkhojb.ktpuppy.ui.detail

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle.*
import androidx.compose.ui.unit.dp
import com.surkhojb.ktpuppy.R
import com.surkhojb.ktpuppy.model.Puppy
import com.surkhojb.ktpuppy.openUrl
import com.surkhojb.ktpuppy.ui.theme.MyTheme
import com.surkhojb.ktpuppy.ui.theme.typography
import dev.chrisbanes.accompanist.glide.GlideImage

class DetailActivity: AppCompatActivity() {

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
        val typography = MaterialTheme.typography
        val context = LocalContext.current
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
    fun Detail(puppy: Puppy){

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
                style = typography.h4,
                color = Color.Black
            )
            Spacer(Modifier.height(5.dp))

            Text(
                text = puppy.description.toString(),
                style = typography.body2,
                fontStyle = Italic,
                color = Color.Black
            )
            Spacer(Modifier.height(8.dp))

            Button(
                onClick = { this@DetailActivity.openUrl(puppy.contactUrl.toString())},
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