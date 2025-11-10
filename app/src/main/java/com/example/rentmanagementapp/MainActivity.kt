package com.example.rentmanagementapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nextButton = findViewById<Button>(R.id.btnNext)
        nextButton.setOnClickListener {
            val intent = Intent(this, RentDetailsActivity::class.java)
            intent.putExtra("TENANT_NAME", "Peter")
            intent.putExtra("RENT_AMOUNT","12000")
            startActivity(intent)
        }

    }

}