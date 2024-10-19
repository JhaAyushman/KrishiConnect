package com.example.krishiconnect1


import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class FinancialServicesActivity : AppCompatActivity() {

    private lateinit var bankNameSpinner: Spinner
    private lateinit var accountNumber: EditText
    private lateinit var servicesSpinner: Spinner
    private lateinit var applyButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financial_services)


        bankNameSpinner = findViewById(R.id.bank_name_spinner)
        accountNumber = findViewById(R.id.account_number)
        servicesSpinner = findViewById(R.id.services_spinner)
        applyButton = findViewById(R.id.apply_button)

        val bankNames = resources.getStringArray(R.array.bank_name_array)
        val bankAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, bankNames)
        bankAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        bankNameSpinner.adapter = bankAdapter

        val services = resources.getStringArray(R.array.services_array)
        val servicesAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, services)
        servicesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        servicesSpinner.adapter = servicesAdapter

        applyButton.setOnClickListener {
            val selectedBank = bankNameSpinner.selectedItem.toString()
            val accountNum = accountNumber.text.toString()
            val selectedService = servicesSpinner.selectedItem.toString()

            if (accountNum.isNotEmpty()) {
                
                Toast.makeText(this, "Applying for $selectedService at $selectedBank with account number $accountNum", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please enter your account number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
