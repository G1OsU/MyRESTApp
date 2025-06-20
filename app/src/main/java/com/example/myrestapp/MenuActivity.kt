package com.example.myrestapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val imageview = findViewById<ImageButton>(R.id.btn_WebView)
        imageview.setOnClickListener{
            start_activity(WebViewActivity::class.java)
        }

        val searchfilm = findViewById<ImageButton>(R.id.btn_Search)
        searchfilm.setOnClickListener{
            start_activity(SearchActivity::class.java)
        }

        val dashboard = findViewById<ImageButton>(R.id.btn_Dash)
        dashboard.setOnClickListener{
            start_activity(DashboardActivity::class.java)
        }

    }
    fun start_activity(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}