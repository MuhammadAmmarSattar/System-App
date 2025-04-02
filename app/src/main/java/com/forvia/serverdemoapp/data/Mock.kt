package com.forvia.serverdemoapp.data

import com.forvia.serverdemoapp.presentation.viewmodel.VehicleInfo
import kotlin.random.Random

object Mock {

    fun generateMockVehicleData(): VehicleInfo {
        val random = Random(System.currentTimeMillis())
        val testFuelLevels = listOf(0.0f, 5000.0f, 75000.0f, 140000.0f, 150000.0f, 160000.0f)
        val fuelLevel = testFuelLevels.random()
        // Decide if the location should be (0.0, 0.0) with a 20% chance (you can adjust this as needed)
        val location = if (random.nextBoolean()) {
            Pair(0.0, 0.0) // 20% chance of (0.0, 0.0)
        } else {
            // Otherwise, generate random latitude and longitude
            Pair(
                random.nextDouble(-90.0, 90.0),  // Random latitude
                random.nextDouble(-180.0, 180.0) // Random longitude
            )
        }

        return VehicleInfo(
            demoMode = random.nextBoolean(),
            fuelLevel = fuelLevel,
            fuelType = listOf(if (random.nextBoolean()) 1 else 10), // Random fuel type
            location = location, // Use the decided location (either random or (0.0, 0.0))
            override = listOf("fuelLevel", "location", "fuelType")
                .shuffled()
                .take(random.nextInt(1, 4)) // Random overrides
        )
    }
}
