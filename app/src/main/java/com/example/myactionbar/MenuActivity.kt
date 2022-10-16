package com.example.myactionbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myactionbar.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
}