package com.example.mad_practical_2_21012011094

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate() is called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume() is called")
    }
    fun showMessage(message: String)
    {
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}