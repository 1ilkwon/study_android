package kr.ac.tukorea.simple_calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText
    lateinit var edit2 : EditText
    lateinit var btnadd : Button
    lateinit var btnsub : Button
    lateinit var btnmul : Button
    lateinit var btndiv : Button
    lateinit var resultview : TextView
    lateinit var num1 : String
    lateinit var num2 : String
    var result : Int ?= null // null일수도 아닐수도 있고 -> ?= 로 표현함


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit1 = findViewById<EditText>(R.id.edit1)
        edit2 = findViewById<EditText>(R.id.edit2)
        btnadd = findViewById<Button>(R.id.btnadd)
        btnsub = findViewById<Button>(R.id.btnsub)
        btnmul = findViewById<Button>(R.id.btnmul)
        btndiv = findViewById<Button>(R.id.btndiv)
        resultview = findViewById<TextView>(R.id.resultview)

        //motionEvent = 터치 관련 클래스
        btnadd.setOnTouchListener {view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) + Integer.parseInt(num2) //int로 선언한 result에 맞게 string인 num을 integer해줌
            resultview.text = "계산결과 : " + result.toString() //textview에서 text를 지정해주는거기떄문에 "계산결과 : "를 추가해줘야한다.
            false //누름상태 종료
        }
        btnsub.setOnTouchListener {view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            resultview.text = "계산결과 : " + result.toString()
            false
        }
        btnmul.setOnTouchListener {view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            resultview.text = "계산결과 : " + result.toString()
            false
        }
        btndiv.setOnTouchListener {view, motionEvent ->
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            resultview.text = "계산결과 : " + result.toString()
            false
        }


    }
}