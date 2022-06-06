package com.sibaamap.navigationkotlin

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_header.*
import kotlinx.android.synthetic.main.nav_header.view.*

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        navView.getHeaderView(0).back.setOnClickListener {
            drawerLayout.closeDrawer(GravityCompat.END)
        }
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.img1 -> Toast.makeText(applicationContext,"Click item 1",Toast.LENGTH_SHORT).show()
                R.id.img2 -> Toast.makeText(applicationContext,"Click item 2",Toast.LENGTH_SHORT).show()
                R.id.img3 -> Toast.makeText(applicationContext,"Click item 3",Toast.LENGTH_SHORT).show()
                R.id.img4 -> Toast.makeText(applicationContext,"Click item 4",Toast.LENGTH_SHORT).show()
                R.id.img5 -> Toast.makeText(applicationContext,"Click item 5",Toast.LENGTH_SHORT).show()
                R.id.back -> Toast.makeText(applicationContext,"Click item 5",Toast.LENGTH_SHORT).show()
            }
            true
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id == R.id.menu_toolbar){
            drawerLayout.openDrawer(GravityCompat.END);
        }
        return true
    }

}