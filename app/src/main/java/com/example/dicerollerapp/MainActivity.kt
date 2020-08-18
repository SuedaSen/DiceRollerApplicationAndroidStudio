package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        //Toast.makeText(this, "button clicked", // display a Toast when rollDice() is called
            //Toast.LENGTH_SHORT).show()
        //val resultText: TextView = findViewById(R.id.result_text) //Use the findViewById() method to get a reference to the TextView by its ID.
        //RESULT TEXT BİZİM TEXTVİEW OLDU
        //resultText.text = "Dice Rolled!"
        //val randomInt = (1..6).random()//Random sayı alıyo
        //resultText.text = randomInt.toString()

        val randomInt = (1..6).random()//Random sayı alıyo
        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString() + " is your number after rolling your dice"
    }


}