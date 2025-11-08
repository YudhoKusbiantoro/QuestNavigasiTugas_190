package com.example.tugaspert6.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugaspert6.R

@Composable
fun Fromlist(
    modifier: Modifier = Modifier,
    onBackListBtn: () -> Unit,
    onNextListBtn: () -> Unit
    /////
) {
    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.list),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            // card pertama
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    //
                    Row(
                        modifier = Modifier.fillMaxWidth()

                    ) {
                        Column {
                            Text(
                                text = stringResource(id = R.string.namalengkap),
                                fontSize = 12.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = stringResource(id = R.string.name),
                                fontSize = 14.sp,
                                color = Color.Black
                            )

                        }
                        Spacer(modifier = Modifier.width(70.dp))
                        Column {
                            Text(
                                text = stringResource(id = R.string.jk),
                                fontSize = 12.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = stringResource(id = R.string.pria),
                                fontSize = 14.sp,
                                color = Color.Black)
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                text = stringResource(id = R.string.status),
                                fontSize = 12.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = stringResource(id = R.string.statusnikah2),
                                fontSize = 14.sp, color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(90.dp))
                        Column {
                            Text(
                                text = stringResource(id = R.string.alamat),
                                fontSize = 12.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = stringResource(id = R.string.alamat1),
                                fontSize = 14.sp,
                                color = Color.Black)
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            //card kedua
            Card(
                modifier = modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    // 🔹 ROW 1: Nama Lengkap & Jenis Kelamin
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                text = stringResource(id = R.string.namalengkap),
                                fontSize = 12.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = stringResource(id = R.string.namea),
                                fontSize = 14.sp, color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(110.dp))
                        Column {
                            Text(
                                text = stringResource(id = R.string.jk),
                                fontSize = 12.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = stringResource(id = R.string.wanita),
                                fontSize = 14.sp, color = Color.Black)
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column {
                            Text(
                                text = stringResource(id = R.string.status),
                                fontSize = 12.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = stringResource(id = R.string.statusnikah2),
                                fontSize = 14.sp,
                                color = Color.Black)
                        }
                        Spacer(modifier = Modifier.width(90.dp))
                        Column {
                            Text(
                                text = stringResource(id = R.string.alamat),
                                fontSize = 12.sp,
                                color = Color.Blue,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = stringResource(id = R.string.alamat2), fontSize = 14.sp, color = Color.Black)
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = onBackListBtn,
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier.weight(1f).height(48.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.btnback),
                        color = Color.White,
                        fontWeight = FontWeight.Medium)
                }
            }
        }
    }
}




