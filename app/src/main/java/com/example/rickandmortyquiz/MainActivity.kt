package com.example.rickandmortyquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val questionBank = listOf(
        Question(R.string.question_1, false),
        Question(R.string.question_2, true),
        Question(R.string.question_3, true),
        Question(R.string.question_4, false),
        Question(R.string.question_5, false),
        Question(R.string.question_6, true),
        Question(R.string.question_7, false),
        Question(R.string.question_8, true),
        Question(R.string.question_9, false),
        Question(R.string.question_10, false),
        Question(R.string.question_11, false),
        Question(R.string.question_12, true),
        Question(R.string.question_13, false),
        Question(R.string.question_14, true),
        Question(R.string.question_15, false),
        Question(R.string.question_16, false),
        Question(R.string.question_17, true),
        Question(R.string.question_18, false),
        Question(R.string.question_19, false),
        Question(R.string.question_20, true)
    )

    private var questionIndex = 0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var toastText = findViewById<TextView>(R.id.text_toast)


        findViewById<Button>(R.id.next_button).setOnClickListener {
            updateView()
            toastText.setText("")
        }

        findViewById<Button>(R.id.previous_button).setOnClickListener() {
            toastText.setText("")
            if (questionIndex != 0) {
                questionIndex = (questionIndex - 1)
                findViewById<TextView>(R.id.text_question).setText(questionBank[questionIndex].resourceID)
            }
            if (questionIndex == 0) {

                questionIndex = questionBank.size - 1
                findViewById<TextView>(R.id.text_question).setText(questionBank[questionIndex].resourceID)
            }
        }

        findViewById<Button>(R.id.button_false).setOnClickListener {
            if (questionBank[questionIndex].answer) {

                toastText.setText("True")
            }
            if (!questionBank[questionIndex].answer) {
                //toastText.setText("False")
                toastText.setText("False")
            }

        }

        findViewById<Button>(R.id.button_true).setOnClickListener {
            if (questionBank[questionIndex].answer) {

                toastText.setText("True")
            }
            if (!questionBank[questionIndex].answer) {
                //toastText.setText("False")
                toastText.setText("False")
            }

        }
    }

      private fun updateView() {
            questionIndex = (questionIndex + 1) % 20
            findViewById<TextView>(R.id.text_question).setText(questionBank[questionIndex].resourceID)
        }
    }



