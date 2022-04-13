package kr.ac.tukorea.simplediary

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.nio.charset.Charset
import java.nio.charset.StandardCharsets.UTF_8
import java.util.*
import kotlin.text.Charsets.UTF_8

class MainActivity : AppCompatActivity() {
    lateinit var date : DatePicker
    lateinit var btn : Button
    lateinit var edit : EditText
    lateinit var filename : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        date = findViewById<DatePicker>(R.id.date)
        btn = findViewById<Button>(R.id.btn)
        edit  =findViewById<EditText>(R.id.edit)

        var cal = Calendar.getInstance()
        var cYear = cal.get(Calendar.YEAR)
        var cMonth = cal.get(Calendar.MONTH)
        var cDay = cal.get(Calendar.DAY_OF_MONTH)

        date.init(cYear, cMonth, cDay){view, year, monthOfYear, dayOfMonth ->
            filename = (Integer.toString(year) + "_" + Integer.toString(monthOfYear) + "_" + Integer.toString(dayOfMonth) + ".txt")
            var str = readDiary(filename)
            edit.setText(str)
            btn.isEnabled = true
            
        }
        btn.setOnClickListener { 
            var outFs = openFileOutput(filename, Context.MODE_PRIVATE)
            var str = edit.text.toString()
            outFs.write(str.toByteArray())
            outFs.close()
            Toast.makeText(applicationContext,"$filename 이 저장됨",Toast.LENGTH_SHORT).show()
            
        }
    }
    fun readDiary(fName: String) : String? {
        var diaryStr : String? = null
        var inFs : FileInputStream
        try{
            inFs = openFileInput(fName)
            var txt = ByteArray(500)
            inFs.read(txt)
            diaryStr = txt.toString(Charset.forName("UTF-8")).trim()
            btn.text="수정하기"
        } catch (e: IOException){
            edit.hint = "일기없음"
            btn.hint = "새로저장"
        }
        return diaryStr
    }
    
}