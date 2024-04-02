package com.sathiyavan.historyapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Declare variables

    private lateinit var enterAge: EditText
    private lateinit var welcome: TextView
    private lateinit var button: Button
    private lateinit var button2: Button
    

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize variables
        enterAge = findViewById(R.id.enterAge)
        welcome = findViewById(R.id.welcome)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)


        button.setOnClickListener {

            val userAgeInput = enterAge.text.toString().toIntOrNull()
            if (userAgeInput != null && userAgeInput in 20..100) {

                val userAgeInput = when (userAgeInput) {
                    20 -> "Cameron Boyce, an actor in Disney channel."
                    25 -> "Tupac Shakur, a famous rapper during 1987."
                    30 -> "Lisa Lopes an American RnB singer., "
                    40 -> "Paul Walker, an actor in Fast and Furious."
                    56 -> "Adolf Hitler, he was the dictator of Germany in the 1933 to 1945."
                    60 -> "Diego Maradona, a well known famous Argentine football player."
                    70 -> "Paul Reubens, a well known American actor and comedian."
                    80 -> "David Soul, an American British actor and singer."
                    90 -> "John Adams, 2nd U.S president."
                    100 -> "George Burns, an American comedian and actor."
                    else -> null
                }

                //This checks the age is not null and if it is within
                //the range of 20 to 100

                val message = if (userAgeInput !=null) "Your age matches with $userAgeInput"
                else "No famous person found with entered age."
                welcome.text = message

                } else {
                    welcome.text = "Invalid input, Please enter a valid age between 20 and 100"


                }
            }

            button2.setOnClickListener {
                enterAge.text.clear()
                welcome.text = ""
            }

            }
        }





