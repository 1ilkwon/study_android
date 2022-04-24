package kr.ac.tukorea.study_planner

import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    private lateinit var homeFragment: HomeFragment
    private lateinit var todoFragment: TodoFragment
    private lateinit var timerFragment: TimerFragment

    private val TAG = AuthActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 레이아웃과 연결
        setContentView(R.layout.activity_main)

        // 바텀네비게이션 변수 실행
        nav_view.setOnNavigationItemSelectedListener(onBottomNavItemSelectedListener)

        // 처음 뜨는 fragment 설정
        homeFragment = HomeFragment().newInstance()
        supportFragmentManager.beginTransaction().add(R.id.nav_host_fragment_activity_main, homeFragment).commit()

        private val onBottomNavItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener{
            val ap = true
            when (it.itemId) {
                R.id.navigation_home -> {
                    homeFragment = HomeFragment().newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, homeFragment).commit()
                    Log.d("ttt","홈")
                }
                R.id.navigation_search -> {
                    searchFragment = SearchFragment().newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, searchFragment).commit()
                    Log.d("ttt","검색")

                }
                R.id.navigation_shop -> {
                    shopFragment = ShopFragment().newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment_activity_main, shopFragment).commit()
                    Log.d("ttt","샵")

            }
            true
        }

    }
}