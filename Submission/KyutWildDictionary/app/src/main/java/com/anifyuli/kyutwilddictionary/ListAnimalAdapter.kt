package com.anifyuli.kyutwilddictionary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAnimalAdapter(private val listAnimal: ArrayList<Animal>) : RecyclerView.Adapter<ListAnimalAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list_animal, viewGroup, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val animal = listAnimal[position]

        Glide.with(holder.itemView.context)
            .load(animal.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvAnimalName.text = animal.name
        holder.tvAnimalBrief.text = animal.brief
    }

    override fun getItemCount(): Int {
        return listAnimal.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvAnimalName: TextView = itemView.findViewById(R.id.animal_name)
        var tvAnimalBrief: TextView = itemView.findViewById(R.id.animal_brief)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_animal)

        }

    }