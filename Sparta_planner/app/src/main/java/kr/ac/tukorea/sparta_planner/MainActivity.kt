package kr.ac.tukorea.sparta_planner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity(),NavigationBarView.OnItemSelectedListener {
    private lateinit var homeFragment: HomeFragment
    private lateinit var calendarFragment: CalendarFragment
    private lateinit var timerFragment: TimerFragment


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        when(p0.itemId){
            R.id.action_home ->{
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.container,HomeFragment())
                transaction.commit()
                return true
            }
            R.id.action_timer ->{
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.container, TimerFragment())
                transaction.commit()
                return true
            }
            R.id.action_calendar ->{
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.container, CalendarFragment())
                transaction.commit()
                return true
            }
        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigationview.setOnItemSelectedListener(this)

    }
}