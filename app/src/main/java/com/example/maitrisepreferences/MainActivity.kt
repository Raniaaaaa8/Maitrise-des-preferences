package com.example.maitrisepreferences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
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





            val editor: SharedPreferences.Editor = sharedpreferences.edit()


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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.activity_one -> {
                Toast.makeText(this, "activity one", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Activity2::class.java)
                startActivity(intent)

                return true
            }
            R.id.activity_two -> {
                Toast.makeText(this, "activity two", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Activity3::class.java)
                startActivity(intent)

                return true
            }
           
            else -> return super.onOptionsItemSelected(item)
        }
    }



}