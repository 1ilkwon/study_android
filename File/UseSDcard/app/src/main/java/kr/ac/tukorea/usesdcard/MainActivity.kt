package kr.ac.tukorea.usesdcard

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import java.io.FileInputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE), Context.MODE_PRIVATE)

        var btnRead : Button
        var edtSD : EditText
        btnRead = findViewById<Button>(R.id.btnRead)
        edtSD = findViewById<EditText>(R.id.edtSD)

        btnRead.setOnClickListener {
            var inFs = FileInputStream("/storage/emulated/0/sd_test.txt")
            var txt = ByteArray(inFs.available())
            inFs.read(txt)
            edtSD.setText(txt.toString(Charsets.UTF_8))
            inFs.close()
        }
    }
}