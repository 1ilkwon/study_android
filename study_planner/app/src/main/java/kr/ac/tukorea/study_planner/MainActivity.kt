package kr.ac.tukorea.study_planner

import CalendarFragment
import CreditFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bnv_main = findViewById(R.id.bnv_main) as BottomNavigationView

        bnv_main.run { setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.todo -> {
                    // 다른 프래그먼트 화면으로 이동하는 기능
                    val TodoFragment = TodoFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, TodoFragment).commit()
                }
                R.id.calender -> {
                    val CalendarFragment = CalendarFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, CalendarFragment).commit()
                }
                R.id.timer -> {
                    val TimerFragment = TimerFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, TimerFragment).commit()
                }
                R.id.credit -> {
                    val CreditFragment = CreditFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fl_container, CreditFragment).commit()
                }
            }
            true
        }
            selectedItemId = R.id.home
        }

    }
}