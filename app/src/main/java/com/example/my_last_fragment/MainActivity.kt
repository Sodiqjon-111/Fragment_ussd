package com.example.my_last_fragment

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentTransaction
import com.example.my_last_fragment.fragments.Beeline_Fragment
import com.example.my_last_fragment.fragments.MobiFragment
import com.example.my_last_fragment.fragments.UcellFragment
import com.example.my_last_fragment.fragments.UzmobiFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

lateinit var beelineFragment: Beeline_Fragment
lateinit var ucellFragment: UcellFragment
lateinit var mobiFragment: MobiFragment
lateinit var uzmobiFragment: UzmobiFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavigationView: BottomNavigationView = findViewById(R.id.botom_navigation)
        ucellFragment = UcellFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_layout, ucellFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ucell -> {
                    ucellFragment = UcellFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, ucellFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.mobiuz -> {
                    mobiFragment = MobiFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, mobiFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.uzmobile -> {
                    uzmobiFragment = UzmobiFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, uzmobiFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.beeline -> {
                    beelineFragment = Beeline_Fragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_layout, beelineFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

            }
            true
        }
    }


}