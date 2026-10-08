package com.example.pertemuan4.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan4.R


@Composable
fun ActivityKeempat(modifier: Modifier){
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    Text(
        stringResource( R.string.prodi),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    )
    Text(
        stringResource(R.string.univ),
        fontSize = 20.sp,
        fontWeight = FontWeight.Thin
    )
        Spacer(modifier = Modifier.height(25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.card_bg))
        ) {
            Row() {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                        .padding(10.dp)
                )

                Spacer(modifier = Modifier.width(30.dp))

                Column(
                    modifier = Modifier.padding(10.dp)
                ) {
                    Text(
                        stringResource(R.string.nama),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Thin
                    )
                }
            }
        }
    }
}