package com.example.rentmanagementapp

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.rentmanagementapp.ui.theme.RentManagementAppTheme

class RentDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rentdetails)
        val tenantName = intent.getStringExtra("TENANT_NAME")
        val rentAmount=intent.getStringExtra("RENT_AMOUNT")
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Tenant Name: $tenantName and Rent Amount: $rentAmount"
        val historyButton = findViewById<Button>(R.id.btnViewHistory)


        historyButton.setOnClickListener {

            val intent = Intent(this, PaymentHistoryActivity::class.java)

            startActivity(intent)
        }
    }

}
