package com.example.tugaspertemuan8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.tugaspertemuan8.databinding.ActivityHomePageBinding
import com.example.tugaspertemuan8.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomePageActivity : AppCompatActivity() {
    lateinit var binding: HomePageActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomePageBinding.inflate(layoutInflater)
        title = "Home"
        setContentView(binding.root)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_exit->{
                MainActivity.viewPagerCompanion.currentItem = 0
                Toast.makeText(this, "Halaman Register", Toast.LENGTH_LONG).show()
                finish()
                true
            }
            else -> {true}
        }
    }
}