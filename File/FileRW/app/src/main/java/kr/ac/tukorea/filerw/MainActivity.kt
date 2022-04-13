package kr.ac.tukorea.filerw

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

class MainActivity : AppCompatActivity() {
    lateinit var writeBtn : Button
    lateinit var readBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        writeBtn = findViewById<Button>(R.id.writeBtn)
        readBtn = findViewById<Button>(R.id.readBtn)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        writeBtn.setOnClickListener {
            var outFs : FileOutputStream = openFileOutput("file.txt", Context.MODE_PRIVATE)
            var str = "안드로이드 파일 쓰기 "
            outFs.write(str.toByteArray())
            outFs.close()
            Toast.makeText(applicationContext,"file.txt가 생성됨", Toast.LENGTH_SHORT).show()
        }

        readBtn.setOnClickListener {
            try{
            var inFs : FileInputStream = openFileInput("file.txt")
            var txt = ByteArray(30)
            inFs.read(txt)
            var str = txt.toString(Charsets.UTF_8)
            Toast.makeText(applicationContext,str,Toast.LENGTH_SHORT).show()
            inFs.close()
        }catch(e:IOException){
            Toast.makeText(applicationContext,"파일없음",Toast.LENGTH_SHORT).show()
        }
        }
    }
}