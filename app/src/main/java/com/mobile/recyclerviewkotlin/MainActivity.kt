package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val characterLists = listOf<Character>(
            Character(
                R.drawable.izukumidoriya,
                "Izuku Midoriya",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.eijiroukirishima,
                "Eijirou Kirishima",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.fumikagetokoyami,
                "Denki Kaminari",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.hantasero,
                "Hanta Sero",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.fumikagetokoyami,
                "Fumikage Tokoyami",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.katsukibakugo,
                "Katsuki Bakugo",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.koujikouda,
                "Kouji Kouda",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.kyoukajirou,
                "Kyouka Jirou",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.mashiraoojiro,
                "Mashirao Ojiro",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.minaashido,
                "Mina Ashido",
                "Character From My Hero Academia"
            ),
            Character(
                R.drawable.minorumineta,
                "Minoru Mineta",
                "Character From My Hero Academia"
            )

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CharacterAdapter(this, characterLists){

            val intent = Intent (this, DetailCharacterActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}