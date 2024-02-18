package com.example.personascan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val btn=findViewById<Button>(R.id.submitBtn)

        btn.setOnClickListener{
            val name=findViewById<EditText>(R.id.name).text.toString()
           val age=findViewById<EditText>(R.id.age).text.toString()

            if(name.isNotEmpty() && age != null){
                val i=Intent(this,PersonalityActivity::class.java)

                i.putExtra("Name",name)
                i.putExtra("Age",age)
                startActivity(i)
            }
        }
    }
}