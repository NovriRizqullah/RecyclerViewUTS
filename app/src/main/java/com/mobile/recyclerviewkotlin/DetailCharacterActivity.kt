package com.mobile.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailCharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_character)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val character = intent.getParcelableExtra<Character>(MainActivity.INTENT_PARCELABLE)

        val imgCharacter = findViewById<ImageView>(R.id.img_item_photo)
        val nameCharacter = findViewById<TextView>(R.id.tv_item_name)
        val descCharacter = findViewById<TextView>(R.id.tv_item_description)

        imgCharacter.setImageResource(character?.imgCharacter!!)
        nameCharacter.text = character.nameCharacter
        descCharacter.text = character.descCharacter
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}