package kr.ac.tukorea.intent_activity

import android.app.Activity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)

        var btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.setOnClickListener {
            finish()
        }
    }
}