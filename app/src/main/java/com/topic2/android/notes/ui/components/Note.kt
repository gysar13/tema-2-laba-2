package com.topic2.android.notes.ui.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NoteColor(){
    Box(
        modifier = Modifier
            .size(40.dp)
            .background(Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)
    )
}

@Preview
@Composable
private fun NoteColorPreview(){
    NoteColor()
}