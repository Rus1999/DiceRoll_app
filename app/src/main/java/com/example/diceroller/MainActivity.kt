package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
// import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // create ContentView
        setContentView(R.layout.activity_main)

        // find Button, TextView Id
        val rollButton: Button = findViewById(R.id.button)
        //val resultTextView: TextView = findViewById(R.id.textView)

        rollButton.setOnClickListener {
            // val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            // toast.show()
            // displayText.text = "Rus"
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        // resultTextView.text = "${diceRoll.toString()} 154 Punyarit Klaphachon"
        val toastD = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
        when (diceRoll) {
            1 -> {
                diceImage.setImageResource(R.drawable.dice_1)
                toastD.show()
            }
            2 -> {
                diceImage.setImageResource(R.drawable.dice_2)
                toastD.show()
            }
            3 -> {
                diceImage.setImageResource(R.drawable.dice_3)
                toastD.show()
            }
            4 -> {
                diceImage.setImageResource(R.drawable.dice_4)
                val toastL = Toast.makeText(this, "Lucky!!", Toast.LENGTH_SHORT)
                toastL.show()
            }
            5 -> {
                diceImage.setImageResource(R.drawable.dice_5)
                toastD.show()
            }
            6 -> {
                diceImage.setImageResource(R.drawable.dice_6)
                toastD.show()
            }
        }

        // id 63410'154' + Punyarit
    }

    class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }


}