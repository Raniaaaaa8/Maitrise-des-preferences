package com.example.maitrisepreferences

import android.content.Context
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val constLayout=findViewById<ConstraintLayout>(R.id.layout_setting)
        val sharedpreferences = getSharedPreferences("backgrounds_color", Context.MODE_PRIVATE)
        val color_key =sharedpreferences.getInt("color_key", 0)
        if (color_key==1){
            constLayout.setBackgroundColor(getResources().getColor(R.color.green))
        }else if (color_key==2){
            constLayout.setBackgroundColor(getResources().getColor(R.color.orange))
        }else if(color_key==3){
            constLayout.setBackgroundColor(getResources().getColor(R.color.blue))
        }





        val editor: Editor = sharedpreferences.edit()


        val button_green = findViewById<Button>(R.id.button2)
        button_green.setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.green))
            editor.putInt("color_key", 1 )

            editor.commit()
        }
        val button_orange = findViewById<Button>(R.id.button)
        button_orange.setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.orange))
            editor.putInt("color_key", 2 )
            editor.commit()
        }
        val button_blue = findViewById<Button>(R.id.button3)
        button_blue.setOnClickListener {
            constLayout.setBackgroundColor(getResources().getColor(R.color.blue))
            editor.putInt("color_key", 3 )
            editor.commit()
        }


    }
}