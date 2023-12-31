package com.example.latihanfatima

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val fragmentManager = supportFragmentManager
        val homeFragment = HomeFragment()
        val fragment = fragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if(fragment !is HomeFragment){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, homeFragment, HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}