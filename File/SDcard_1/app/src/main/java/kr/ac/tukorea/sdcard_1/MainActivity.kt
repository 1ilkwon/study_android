package kr.ac.tukorea.sdcard_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMkdir : Button
        var btnRmdir : Button
        btnMkdir = findViewById<Button>(R.id.btnMkdir)
        btnRmdir = findViewById<Button>(R.id.btnRmdir)

        var strSDpath = Environment.getExternalStorageDirectory().absolutePath
        var myDir = File("$strSDpath/hello")

        btnMkdir.setOnClickListener {
            myDir.mkdir()
        }

        btnRmdir.setOnClickListener {
            myDir.delete()
        }
    }
}