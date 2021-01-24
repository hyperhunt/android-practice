package dev.hyperhunt.geoquiz_mvc

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button
    private lateinit var questionTextView: TextView

    private val questionBank = listOf(
            Question(R.string.question_1, true),
            Question(R.string.question_2, false),
            Question(R.string.question_3, true),
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.question_text_view)

        val questionTextResId = questionBank[currentIndex].textResId
        questionTextView.setText(questionTextResId)

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
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }

        nextButton = findViewById(R.id.next_btn)
        nextButton.setOnClickListener() {
            currentIndex = (currentIndex + 1) % questionBank.size
            val questionTextResId = questionBank[currentIndex].textResId
            questionTextView.setText(questionTextResId)
        }
    }
}