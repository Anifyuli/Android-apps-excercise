package com.anifyuli.kyutwilddictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

        listAnimalAdapter.setOnItemClickCallback(object : ListAnimalAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Animal) {
                showSelectedAnimal(data)
            }
        })
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

    private fun showSelectedAnimal(animal: Animal) {
//        Toast.makeText(this, animal.name + " dipilih", Toast.LENGTH_LONG).show()
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.name, animal.name)
        intent.putExtra(DetailActivity.bio_name, animal.bio_name)
        intent.putExtra(DetailActivity.kingdom, animal.kingdom)
        intent.putExtra(DetailActivity.filum, animal.filum)
        intent.putExtra(DetailActivity.kelas, animal.kelas)
        intent.putExtra(DetailActivity.ordo, animal.ordo)
        intent.putExtra(DetailActivity.family, animal.family)
        intent.putExtra(DetailActivity.genus, animal.genus)
        intent.putExtra(DetailActivity.detail, animal.detail)
        intent.putExtra(DetailActivity.photo, animal.photo)
        startActivity(intent)

    }
}


