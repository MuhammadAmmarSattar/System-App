# Forvia Appning Stage - Quick Setup Guide

## Overview
The **Appning Stage** app communicates with the **Appning Hub** via Bluetooth (real devices) or TCP (emulators). It sends vehicle data including fuel level, location, and vehicle type (Electric or Gasoline), in **Live Mode** (real-time data) or **Demo Mode** (simulated data).

## Connecting via Bluetooth
1. **Enable Bluetooth** in system settings.
2. **Pair the Device**: Go to **Bluetooth settings**, scan, and pair with the device.
3. **Launch the Appning Stage app** and tap **Scan Paired Devices**.
4. **Select the paired device** to connect.
5. **Connection Established**: Data starts transmitting once connected.

## Connecting via TCP (Emulators)
1. Ensure **TCP connection** is configured for the emulator.
2. **Start the Appning Stage app**, and it will automatically connect via TCP to the Appning Hub.

## Data Transmitted
Log example when sending data:

```json
{
  "demoMode": true,
  "fuelLevel": 50.0,
  "fuelType": [1],
  "location": [40.7128, -74.0060],
  "override": ["fuelType", "location", "fuelLevel"]
}
```

## Data Breakdown:
- **demoMode**: Indicates simulated data (`true`) or real-time data (`false`).
- **fuelLevel**: Vehicle’s fuel level.
-   **Fuel type codes**:  
  - `1` = Gasoline (or other non-electric vehicles)  
  - `10` = Electric
- **location**: Latitude & Longitude of the vehicle.
- **override**: Custom data (if any).

## Troubleshooting
1. **Check Logs**: Look for **"Connection Established"** in both the **Appning Hub** and **Appning Stage** logs.
2. **Verify Data Flow**: Ensure that the **Appning Hub** displays the correct vehicle data.
3. **Enable Debug Logs**: For detailed data transmission logs, enable **debug mode** to track outgoing data.

