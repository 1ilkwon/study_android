package kr.ac.tukorea.intent_activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var radioButton: RadioButton
    lateinit var radioButton2: RadioButton
    lateinit var button: Button
    lateinit var radioGroup: RadioGroup


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioButton = findViewById<RadioButton>(R.id.radioButton)
        radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        radioGroup = findViewById<RadioGroup>(R.id.radioButton)
        button = findViewById<Button>(R.id.button)

        var intent2 = Intent(applicationContext, SecondActivity::class.java)
        var intent3 = Intent(applicationContext, ThirdActivity::class.java)

        radioGroup.setOnCheckedChangeListener { compoundButton, b ->
            if (radioButton.isChecked == true) {
                radioButton2.isChecked == false
            } else if (radioButton2.isChecked == true) {
                radioButton.isChecked == false
            }



            button.setOnClickListener {
                if (radioButton.isChecked == true) {
                    startActivity(intent2)
                } else if (radioButton2.isChecked == true) {
                    startActivity(intent3)
                }
            }
        }
    }
}
