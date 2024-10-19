package com.example.krishiconnect1

package com.example.logisticsapp

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.logisticsapp.R

class LogisticsActivity : AppCompatActivity() {

    private lateinit var pickUpLocation: EditText
    private lateinit var pickUpTimeDate: EditText
    private lateinit var deliveryLocation: EditText
    private lateinit var vehicleTypeSpinner: Spinner
    private lateinit var findButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logistics)

        // Initialize views
        pickUpLocation = findViewById(R.id.pick_up_location)
        pickUpTimeDate = findViewById(R.id.pick_up_time_date)
        deliveryLocation = findViewById(R.id.delivery_location)
        vehicleTypeSpinner = findViewById(R.id.vehicle_type_spinner)
        findButton = findViewById(R.id.find_button)

        // Set up the Spinner with the vehicle types
        val vehicleTypes = resources.getStringArray(R.array.vehicle_type_array)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, vehicleTypes)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        vehicleTypeSpinner.adapter = adapter

        // Handle button click event
        findButton.setOnClickListener {
            val pickUp = pickUpLocation.text.toString()
            val timeDate = pickUpTimeDate.text.toString()
            val delivery = deliveryLocation.text.toString()
            val vehicleType = vehicleTypeSpinner.selectedItem.toString()

            Toast.makeText(this, "Searching for $vehicleType from $pickUp to $delivery at $timeDate", Toast.LENGTH_LONG).show()

            // Add logic to handle finding the logistics info
        }
    }
}
