package kr.ac.tukorea.sparta_planner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.ac.tukorea.sparta_planner.R

class CalendarFragment : Fragment() {

    fun newInstance() : HomeFragment{
        return HomeFragment()
    }

    override fun onCreateView(
        inflater:
        LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calendar, container, false)
    }
}