package dev.hyperhunt.geoquiz

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_btn)
        trueButton.setOnClickListener() {
            Toast.makeText(
                this,
                R.string.correct_toast,
                Toast.LENGTH_SHORT
            ).show()
        }

        falseButton = findViewById(R.id.false_btn)
        falseButton.setOnClickListener() {

            val toast: Toast = Toast.makeText(
                applicationContext,
                R.string.incorrect_toast,
                Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()
        }
    }
}