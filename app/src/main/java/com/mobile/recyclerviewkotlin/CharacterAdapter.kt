package com.mobile.recyclerviewkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CharacterAdapter(private val context: Context, private val characters: List<Character>, val listener: (Character) -> Unit)
    : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>(){

    class CharacterViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgCharacter = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameCharacter= view.findViewById<TextView>(R.id.tv_item_name)
        val descCharacter = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(character: Character, listener: (Character) -> Unit){
            imgCharacter.setImageResource(character.imgCharacter)
            nameCharacter.text = character.nameCharacter
            descCharacter.text = character.descCharacter
            itemView.setOnClickListener{
                (listener(character))
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_character, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
     holder.bindView(characters[position], listener)
    }

    override fun getItemCount(): Int = characters.size
    }


