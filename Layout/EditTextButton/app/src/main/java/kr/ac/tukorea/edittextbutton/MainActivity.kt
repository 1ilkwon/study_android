package kr.ac.tukorea.edittextbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText
    lateinit var text1 : TextView
    lateinit var btn1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit1=findViewById<EditText>(R.id.edit1)
        text1=findViewById<TextView>(R.id.text1)
        btn1=findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            text1.text = edit1.toString()
        }
    }
}