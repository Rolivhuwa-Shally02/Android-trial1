package com.example.newapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DashboardActivity : AppCompatActivity() {

    //add the following code above  onCreate
    lateinit var welcomeText: String;
    lateinit var tvWelcome: TextView

//    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dashboard)

    welcomeText ="Welcome "+ getIntent().getStringExtra("Username").toString() + "!";
    tvWelcome = this.findViewById(R.id.tvWelcome);
    tvWelcome.setText(welcomeText);


}


}