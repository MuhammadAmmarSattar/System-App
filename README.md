# Forvia Appning Stage Application  

## Overview  
The **Appning Stage** app communicates with the **AAOS Appning Hub** (System app) using a **Bluetooth socket connection** on real devices and a **TCP socket connection** on emulators.  

## Purpose of Appning Stage  
The Appning Stage app is designed to **simulate and send custom data** to the Appning Hub, including:  

- ✅ **Predefined or Custom Location** (via Map)  
- ✅ **Fuel Level & Battery Level**  
- ✅ **Vehicle Type** (Electric or Gasoline)

It operates in two modes:  

- **Live Mode**: Receives real-time vehicle data from the Appning Hub, including **battery level, location, fuel level, RPM**, and other essential properties.  
- **Demo Mode**: Sends **simulated vehicle data** to the Appning Hub, allowing users to test different conditions.  

The connection remains **persistent**, ensuring **seamless data transmission** while allowing the Appning Stage app to switch between **live and demo modes** as needed.  

## Steps to Connect and Transmit Data via Bluetooth  

### 1. Enable Bluetooth  
- Open **System Settings** on the device.  
- Turn on **Bluetooth**.  

### 2. Pair the Device  
- Go to **Bluetooth settings**.  
- Scan for available devices.  
- Select and **pair** with the target device.  

### 3. Open the Appning Stage App  
- Launch the **Appning Stage** app.  
- Tap on **Scan Paired Devices**.  

### 4. Select Paired Device  
- Choose the **previously paired device** from the list.  

### 5. Establish Connection  
- The **Appning Stage** app connects to the selected device.  
- Once connected, **data transmission begins**.  
