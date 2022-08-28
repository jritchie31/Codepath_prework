package com.example.helloworld_preworkassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//This Kotlin file is where we handle user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Show the layout file:activity_main
        setContentView(R.layout.activity_main)
        //Get a reference to our button
        //2. Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handles button tap that should change color of the text
            Log.i("Jayda", "Tapped on Button")
//Get a reference to text view then set a color of the tet view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.teal_200))
        }
    }
}

//Display customized text to show "Hello from {none}
//user can tap a button to change the text color of the label
//1. Add a button to the layout




//Change the color of the text
