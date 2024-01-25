package com.rajanmishracse.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottom_nav:BottomNavigationView = findViewById(R.id.bottom_nav)
        supportFragmentManager.beginTransaction().replace(R.id.fcv,My_fragment()).commit()
        bottom_nav.setOnNavigationItemSelectedListener {
            val id = it.itemId
            when(id) {
                R.id.home_icon -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcv,My_fragment()).commit()
                }

                R.id.user_icon ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcv,SecondFrag()).commit()

                }

                R.id.corona_icon ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcv,ThirdFrag()).commit()

                }
            }

            return@setOnNavigationItemSelectedListener true
        }



    }
}