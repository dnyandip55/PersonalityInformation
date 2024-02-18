package com.example.personascan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.Calendar

class PersonalityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personality)

        val name=intent.getStringExtra("Name")
        val age=intent.getStringExtra("Age")

        val info=findViewById<TextView>(R.id.personalityInfo)

        val personalityInfo=generatePersonalityInfo(name,age)
        info.text=personalityInfo

    }

    private fun generatePersonalityInfo(name:String? ,age:String?):String{
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val birthYear = currentYear - (age?.toIntOrNull() ?: 0)
        return  when(birthYear){
            in 1980..1990->"Hi $name, You were born in $birthYear\n YOu are a Middle Aged Person , you have more maturity, you have great talents"
            in 1991..2000-> "Hi $name, You were born in $birthYear\nYou are a Young Person, you are evolving in all aspects, you are a great companion."
            in 2001..currentYear-> "Hi $name, You were born in $birthYear\nYou are Too Young to understand everything. You have a great opportunity to grow in every possible direction. There's a lot to explore."
            else -> "Hi $name, You were born in $birthYear"
        }
    }
}