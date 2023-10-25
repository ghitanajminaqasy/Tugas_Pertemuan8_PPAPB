package com.example.tugaspertemuan8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.tugaspertemuan8.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var mediator: TabLayoutMediator
    lateinit var viewPager2: ViewPager2
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Dashboard"
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            viewPager2 = viewPager
            viewPager.adapter = TabAdapter(supportFragmentManager, this@MainActivity.lifecycle)
            mediator= TabLayoutMediator(tabLayout, viewPager)
            {tab, position ->
                when (position){
                    0-> tab.text = "Register"
                    1-> tab.text = "Login"

                }
            }
            mediator.attach()
            viewPagerCompanion = viewPager2

        }
    }
    companion object {
        lateinit var viewPagerCompanion : ViewPager2
    }
}