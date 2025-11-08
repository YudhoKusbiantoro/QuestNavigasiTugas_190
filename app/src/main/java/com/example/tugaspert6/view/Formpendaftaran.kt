package com.example.tugaspert6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.tugaspert6.R

@Composable
fun Formpendaftarann(
    modifier: Modifier = Modifier,
    onBackListBtn: () -> Unit,
) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    // Variabel untuk menyimpan data hasil submit
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenisKelamin by remember { mutableStateOf("") }
    var statusPerkawinan by remember { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(false) }


    // Daftar pilihan
    val gender = listOf("Laki-laki", "Perempuan")
    val status = listOf("Janda", "Lajang", "Duda")

    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 2.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.judul2),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Card(
                elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(580.dp)
                    .padding(horizontal = 16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.Start
                ) {
                    // nama lengkap
                    Text(
                        text = stringResource(id = R.string.namalengkap),
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    OutlinedTextField(
                        value = textNama,
                        onValueChange = { textNama = it },
                        singleLine = true,
                        placeholder = { Text("Isian Nama Lengkap") },
                        modifier = Modifier.fillMaxWidth()
                    )

                    Text(
                        text = stringResource(id = R.string.jk),
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        gender.forEach { item ->
                            Row(
                                modifier = Modifier.selectable(
                                    selected = textJK == item,
                                    onClick = { textJK = item }
                                ),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(
                                    selected = textJK == item,
                                    onClick = { textJK = item }
                                )
                                Text(item)
                            }
                        }
                    }

                    Text(
                        text = stringResource(id = R.string.status),
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                    )
                    Row {
                        status.forEach { item ->
                            Row(
                                modifier = Modifier.selectable(
                                    selected = textStatus == item,
                                    onClick = { textStatus = item }
                                ),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(
                                    selected = textStatus == item,
                                    onClick = { textStatus = item }
                                )
                                Text(item)
                            }
                        }
                    }

                    Text(
                        text = stringResource(id = R.string.alamat),
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                    )
                    OutlinedTextField(
                        value = textAlamat,
                        onValueChange = { textAlamat = it },
                        singleLine = true,
                        placeholder = { Text("Alamat") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(100.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Button(
                            onClick = onBackListBtn,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            ),
                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier.weight(1f).height(48.dp)
                        ) {
                            Text(
                                text = stringResource(id = R.string.btnback), color = Color.White, fontWeight = FontWeight.Medium)
                        }

                        Button(
                            onClick = {
                                // Simpan data hasil input (opsional)
                                nama = textNama
                                alamat = textAlamat
                                jenisKelamin = textJK
                                statusPerkawinan = textStatus

                                // Tampilkan pop-up
                                showDialog = true
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            ),
                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp),
                            shape = RoundedCornerShape(8.dp),
                            modifier = Modifier.weight(1f).height(48.dp)
                        ) {
                            Text(
                                text = stringResource(id = R.string.submit), color = Color.White, fontWeight = FontWeight.Medium)
                        }
                    }
                }
            }
        }
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = {
                    Text(
                        text = stringResource(id = R.string.datadisimpan),
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.SansSerif
                    )
                },
                text = {
                    Column {
                        Row {
                            Text(
                                text = stringResource(id = R.string.namalengkap),
                                modifier = Modifier
                                    .width(120.dp),
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(text = ": $textNama")
                        }
                        Row {
                            Text(
                                text = stringResource(id = R.string.jk),
                                modifier = Modifier
                                    .width(120.dp),
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(text = ": $textJK")
                        }
                        Row {
                            Text(
                                text = stringResource(id = R.string.status),
                                modifier = Modifier
                                    .width(120.dp),
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(text = ": $textStatus")
                        }
                        Row {
                            Text(
                                text = stringResource(id = R.string.alamat),
                                modifier = Modifier
                                    .width(120.dp),
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(text = ": $textAlamat")
                        }
                    }

                },
                confirmButton = {
                    Button(
                        onClick = { showDialog = false },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.purple_700)
                        )
                    ) {
                        Text("OK", color = Color.White)
                    }
                }
            )
        }
    }
}

