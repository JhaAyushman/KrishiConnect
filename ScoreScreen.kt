package com.example.krishiconnect1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score_activity)


        val buttonIncreaseScore = findViewById<Button>(R.id.button_increase_score)
        val buttonHome = findViewById<ImageView>(R.id.button_home)
        val buttonSell = findViewById<ImageView>(R.id.button_sell)
        val buttonTransactions = findViewById<ImageView>(R.id.button_transactions)
        val buttonProfile = findViewById<ImageView>(R.id.button_profile)


        buttonIncreaseScore.setOnClickListener {
            Toast.makeText(this, "Increase Score clicked", Toast.LENGTH_SHORT).show()
        }

        buttonHome.setOnClickListener {
            Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()

        }

        buttonSell.setOnClickListener {
            Toast.makeText(this, "Sell clicked", Toast.LENGTH_SHORT).show()


        }

        buttonTransactions.setOnClickListener {
            Toast.makeText(this, "Transactions clicked", Toast.LENGTH_SHORT).show()

        }

        buttonProfile.setOnClickListener {
            Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()

        }
    }
}
