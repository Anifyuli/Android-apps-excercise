package com.anifyuli.kyutwilddictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvAnimal: RecyclerView
    private var list : ArrayList<Animal> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAnimal = findViewById(R.id.animal_list)
        rvAnimal.setHasFixedSize(true)

        list.addAll(AnimalData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAnimal.layoutManager = LinearLayoutManager(this)
        val listAnimalAdapter = ListAnimalAdapter(list)
        rvAnimal.adapter = listAnimalAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.info_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about_me -> {
                val move = Intent(this@MainActivity, AboutMeActivity::class.java)
                startActivity(move)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}


