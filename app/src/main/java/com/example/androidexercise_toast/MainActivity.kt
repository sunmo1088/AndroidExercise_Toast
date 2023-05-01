package com.example.androidexercise_toast

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.androidexercise_toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layout = layoutInflater.inflate(R.layout.custom_toast, findViewById<View>(R.id.ll_wrapper) as ViewGroup?)


        binding.constraintLayout.setOnClickListener {
//            Toast.makeText(this, "Hi I'm toast!", Toast.LENGTH_SHORT).show()

//            old way
//            val toast = Toast(this)
//            toast.duration

            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layout
            }.show()
        }



    }
}