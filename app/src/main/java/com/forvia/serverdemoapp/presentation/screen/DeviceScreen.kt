package com.forvia.serverdemoapp.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.forvia.serverdemoapp.domain.BluetoothDevice
import com.forvia.serverdemoapp.presentation.state.BluetoothUiState

@Composable
fun DeviceScreen(
    state: BluetoothUiState,
    onStartScan: () -> Unit,
    onStopScan: () -> Unit,
    onStartServer: () -> Unit,
    onDeviceClick: (BluetoothDevice) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BluetoothDeviceList(
            pairedDevices = state.pairedDevices,
            scannedDevices = state.scannedDevices,
            onClick = onDeviceClick,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 80.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = onStartScan) {
                Text(text = "Start scan")
            }
            Button(onClick = onStopScan) {
                Text(text = "Stop scan")
            }
            Button(onClick = onStartServer) {
                Text(text = "Start server")
            }
        }
    }
}

@Composable
fun BluetoothDeviceList(
    pairedDevices: List<BluetoothDevice>,
    scannedDevices: List<BluetoothDevice>,
    onClick: (BluetoothDevice) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
//        item {
//            Text(
//                text = "Paired Devices",
//                fontWeight = FontWeight.Bold,
//                fontSize = 24.sp,
//                modifier = Modifier.padding(16.dp)
//            )
//        }
//        items(pairedDevices) { device ->
//            Text(
//                text = device.name ?: "(No name)",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .clickable { onClick(device) }
//                    .padding(16.dp)
//            )
//        }

//        item {
//            Text(
//                text = "Scanned Devices",
//                fontWeight = FontWeight.Bold,
//                fontSize = 24.sp,
//                modifier = Modifier.padding(16.dp)
//            )
//        }
//        items(scannedDevices) { device ->
//            Text(
//                text = device.name ?: "(No name)",
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .clickable { onClick(device) }
//                    .padding(16.dp)
//            )
//        }
    }
}