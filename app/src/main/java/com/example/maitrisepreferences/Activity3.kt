package com.example.maitrisepreferences

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        val constLayout=findViewById<ConstraintLayout>(R.id.layout_act3)
        val sharedpreferences = getSharedPreferences("backgrounds_color", Context.MODE_PRIVATE)
        val color_key =sharedpreferences.getInt("color_key", 0)
        if (color_key==1){
            constLayout.setBackgroundColor(getResources().getColor(R.color.green))
        }else if (color_key==2){
            constLayout.setBackgroundColor(getResources().getColor(R.color.orange))
        }else if(color_key==3){
            constLayout.setBackgroundColor(getResources().getColor(R.color.blue))
        }
    }
}