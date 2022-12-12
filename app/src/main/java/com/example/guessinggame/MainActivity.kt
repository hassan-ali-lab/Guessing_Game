package com.example.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var guess = Random().nextInt(1000);
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun check(view: View) {
        var guess = Integer.parseInt(findViewById<EditText>(R.id.txt_guess).text.toString());
        var message = findViewById<TextView>(R.id.message);
        if (guess == this.guess) {
            message.text = "Right Guess";
        } else if (guess > this.guess) {
            message.text = "Big Number";
        } else {
            message.text = "Small Number";
        }
    }
}