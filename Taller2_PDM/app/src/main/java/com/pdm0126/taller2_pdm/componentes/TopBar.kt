package com.pdm0126.taller2_pdm.componentes

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopBar(onSearchClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, Color(0xFF2C2459)),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "FoodSpot",
            modifier = Modifier.padding(10.dp), fontSize = 22.sp, fontWeight = FontWeight.Bold
        )

        IconButton(
            onClick = onSearchClick, modifier = Modifier.size(32.dp).padding(end = 8.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Search,
                contentDescription = "",
                tint = Color(0xFF2C2459),
                modifier = Modifier.size(30.dp)
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun FoodSpotTopBarPreview() {
    TopBar(onSearchClick = {})
}