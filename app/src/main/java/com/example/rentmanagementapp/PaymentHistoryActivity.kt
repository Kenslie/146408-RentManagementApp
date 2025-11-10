package com.example.rentmanagementapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // Use AppCompatActivity
import android.widget.TextView // Import TextView if you want to modify text

class PaymentHistoryActivity : AppCompatActivity() { // Change ComponentActivity to AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymenthistory)

    }
}