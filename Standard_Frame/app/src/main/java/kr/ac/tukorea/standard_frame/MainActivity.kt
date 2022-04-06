package kr.ac.tukorea.standard_frame

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val homepage = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.tukorea.ac.kr"))
    val soscall = Intent(Intent.ACTION_DIAL, Uri.parse("tel:911"))
    val gallery = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))

    lateinit var button1 : Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    lateinit var button4 : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1 = findViewById<Button>(R.id.pageBtn)
        button2 = findViewById<Button>(R.id.sosBtn)
        button3 = findViewById<Button>(R.id.galBtn)
        button4 = findViewById<Button>(R.id.endBtn)

        button1.setOnClickListener{
            startActivity(homepage)
        }
        button2.setOnClickListener{
            startActivity(soscall)
        }
        button3.setOnClickListener{
            startActivity(gallery)
        }
        button4.setOnClickListener{
            finish()
        }




    }
}