package com.surkhojb.ktpuppy.ui.detail

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.surkhojb.ktpuppy.ui.theme.MyTheme

class DetailActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
            }
        }
    }
}