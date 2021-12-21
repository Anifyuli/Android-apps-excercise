package com.anifyuli.kyutwilddictionary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf

class DetailActivity : AppCompatActivity() {
    companion object {
        const val name = "name"
        const val bio_name = "bio_name"
        const val kingdom = "kingdom"
        const val filum = "filum"
        const val kelas = "kelas"
        const val ordo = "ordo"
        const val family = "family"
        const val genus = "genus"
        const val detail = "detail"
        const val photo = "photo"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val animalName : TextView = findViewById(R.id.name)
        val animalBioName : TextView = findViewById(R.id.bio_name)
        val animalImg : ImageView = findViewById(R.id.img_animal)
        val animalKingdom : TextView = findViewById(R.id.kingdom)
        val animalFilum : TextView = findViewById(R.id.filum)
        val animalOrdo : TextView = findViewById(R.id.ordo)
        val animalKelas : TextView = findViewById(R.id.kelas)
        val animalFamily : TextView = findViewById(R.id.family)
        val animalGenus : TextView = findViewById(R.id.genus)
        val animalDetail : TextView = findViewById(R.id.detail)

        val bundle : Bundle?= intent.extras
        val name = bundle?.getString(name)
        val bio_name = bundle?.getString(bio_name)
        val photo = bundle?.getInt(photo)
        val kingdom = bundle?.getString(kingdom)
        val filum = bundle?.getString(filum)
        val ordo = bundle?.getString(ordo)
        val kelas = bundle?.getString(kelas)
        val family = bundle?.getString(family)
        val genus = bundle?.getString(genus)
        val detail = bundle?.getString(detail)

        animalName.text = name
        animalBioName.text = bio_name
        if (photo != null) {
            animalImg.setImageResource(photo)
        }
        animalKingdom.text = kingdom
        animalFilum.text = filum
        animalOrdo.text = ordo
        animalKelas.text = kelas
        animalFamily.text = family
        animalGenus.text = genus
        animalDetail.text = detail

    }

}