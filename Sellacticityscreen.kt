package com.example.krishiconnect1


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SellProduceActivity : AppCompatActivity() {

    private lateinit var categorySpinner: Spinner
    private lateinit var productName: EditText
    private lateinit var quantityInput: EditText
    private lateinit var unitSpinner: Spinner
    private lateinit var pricePerUnit: EditText
    private lateinit var uploadImageButton: Button
    private lateinit var descriptionBox: EditText
    private lateinit var sellButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sell_produce)


        categorySpinner = findViewById(R.id.category_spinner)
        productName = findViewById(R.id.product_name)
        quantityInput = findViewById(R.id.quantity_input)
        unitSpinner = findViewById(R.id.unit_spinner)
        pricePerUnit = findViewById(R.id.price_per_unit)
        uploadImageButton = findViewById(R.id.upload_image_button)
        descriptionBox = findViewById(R.id.description_box)
        sellButton = findViewById(R.id.sell_button)


        val categories = resources.getStringArray(R.array.category_array)
        val categoryAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        categorySpinner.adapter = categoryAdapter

        val units = resources.getStringArray(R.array.unit_array)
        val unitAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, units)
        unitAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        unitSpinner.adapter = unitAdapter


        uploadImageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, 1000)  // For demo purposes, change code as needed
        }


        sellButton.setOnClickListener {
            val selectedCategory = categorySpinner.selectedItem.toString()
            val product = productName.text.toString()
            val quantity = quantityInput.text.toString()
            val selectedUnit = unitSpinner.selectedItem.toString()
            val price = pricePerUnit.text.toString()
            val description = descriptionBox.text.toString()

            if (selectedCategory.isNotEmpty() && product.isNotEmpty() && quantity.isNotEmpty() && price.isNotEmpty()) {
                // Process selling logic
                Toast.makeText(this, "Product listed for sale", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all required fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1000 && resultCode == Activity.RESULT_OK) {
            val imageUri = data?.data
           
            Toast.makeText(this, "Image uploaded successfully", Toast.LENGTH_SHORT).show()
        }
    }
}

