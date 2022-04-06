package kr.ac.tukorea.image_view

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var checkbox1 : CheckBox
    lateinit var linear1 : LinearLayout
    lateinit var dogBtn : RadioButton
    lateinit var catBtn : RadioButton
    lateinit var puppyBtn : RadioButton
    lateinit var checkBtn : Button
    lateinit var image : ImageView
    lateinit var radioGr : RadioGroup



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        linear1 = findViewById<LinearLayout>(R.id.linear1)
        dogBtn = findViewById<RadioButton>(R.id.dogBtn)
        catBtn = findViewById<RadioButton>(R.id.catBtn)
        puppyBtn = findViewById<RadioButton>(R.id.puppyBtn)
        checkBtn = findViewById<Button>(R.id.checkBtn)
        image = findViewById<ImageView>(R.id.image)
        radioGr = findViewById<RadioGroup>(R.id.radioGr)


        checkbox1.setOnCheckedChangeListener{ compoundButton, b ->
            if(checkbox1.isChecked == true){
                linear1.visibility=android.view.View.VISIBLE
            }else{
                linear1.visibility=android.view.View.INVISIBLE
            }
        }

        checkBtn.setOnClickListener {
            when(radioGr.checkedRadioButtonId){
                R.id.dogBtn -> image.setImageResource(R.drawable.dog)
                R.id.catBtn -> image.setImageResource(R.drawable.cat)
                R.id.puppyBtn -> image.setImageResource(R.drawable.dog2)
                else -> Toast.makeText(applicationContext, "동물을 먼저 선택하세요.",Toast.LENGTH_SHORT).show()
            }
        }

    }
}