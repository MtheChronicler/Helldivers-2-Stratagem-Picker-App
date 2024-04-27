package com.example.helldivers2stratagempicker

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Stratagem(val name:String, val typ: String, val enemy:String, val tags: List<String>)

val stratagemList: List<Stratagem> = listOf(
    //orbital
    Stratagem(name="Orbital Precision Strike", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital Airburst Strike", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital 120MM HE Barrage", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital 380MM HE Barrage", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital Walking Barrage", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital Laser", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital Railcannon Strike", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital Gatling Barrage", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital Gas Strike", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital EMS Strike", typ="orbital", enemy="any", tags=listOf()),
    Stratagem(name="Orbital Smoke Strike", typ="orbital", enemy="automatons", tags=listOf()),
    //eagle
    Stratagem(name="Eagle Strafing Run", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="Eagle Airstrike", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="Eagle Cluster Bomb", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="Eagle Napalm Strike", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="Eagle Smoke Strike", typ="eagle", enemy="automatons", tags=listOf()),
    Stratagem(name="Eagle 110MM Rocket Pods", typ="eagle", enemy="any", tags=listOf()),
    Stratagem(name="Eagle 500kg Bomb", typ="eagle", enemy="any", tags=listOf()),
    //support_weapon
    Stratagem(name="AC-8 Autocannon", typ="weapon", enemy="any", tags=listOf("backpack")),
    Stratagem(name="EAT-17 Expendable Anti-tank", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="FLAM-40 Flamethrower", typ="weapon", enemy="terminids", tags=listOf()),
    Stratagem(name="LAS-98 Laser Cannon", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="M-105 Stalwart", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="MG-43 Machine Gun", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="ARC-3 Arc Thrower", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="GL-21 Grenade Launcher", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="APW-1 Anti-Materiel Rifle", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="RS-422 Railgun", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="GR-8 Recoilless Rifle", typ="weapon", enemy="any", tags=listOf("backpack")),
    Stratagem(name="FAF-14 SPEAR Launcher", typ="weapon", enemy="any", tags=listOf("backpack")),
    Stratagem(name="LAS-99 Quasar Cannon", typ="weapon", enemy="any", tags=listOf()),
    Stratagem(name="MG-206 Heavy Machine Gun", typ="weapon", enemy="any", tags=listOf()),
    //backpack
    Stratagem(name="AX/LAS-5 Guard Dog Rover", typ="backpack", enemy="any", tags=listOf()),
    Stratagem(name="AX/AR-23 Guard Dog", typ="backpack", enemy="any", tags=listOf()),
    Stratagem(name="LIFT-850 Jump Pack", typ="backpack", enemy="any", tags=listOf()),
    Stratagem(name="B-1 Supply Pack", typ="backpack", enemy="any", tags=listOf()),
    Stratagem(name="SH-32 Shield Generator Pack", typ="backpack", enemy="any", tags=listOf()),
    Stratagem(name="SH-20 Ballistic Shield Backpack", typ="backpack", enemy="automatons", tags=listOf()),
    //sentry
    Stratagem(name="A/ARC-3 Tesla Tower", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="A/M-12 Mortar Sentry", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="A/M-23 EMS Mortar Sentry", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="A/MG-43 Machine Gun Sentry", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="A/G-16 Gatling Sentry", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="A/AC-8 Autocannon Sentry", typ="sentry", enemy="any", tags=listOf()),
    Stratagem(name="A/MLS-4X Rocket Sentry", typ="sentry", enemy="any", tags=listOf()),
    //emplacement
    Stratagem(name="MD-6 Anti-Personnel Minefield", typ="emplacement", enemy="any", tags=listOf()),
    Stratagem(name="MD-I4 Incendiary Mines", typ="emplacement", enemy="any", tags=listOf()),
    Stratagem(name="FX-12 Shield Generator Relay", typ="emplacement", enemy="automatons", tags=listOf()),
    Stratagem(name="E/MG-101 HMG Emplacement", typ="emplacement", enemy="any", tags=listOf()),
    //vehicle
    Stratagem(name="EXO-45 Patriot Exosuit", typ="vehicle", enemy="any", tags=listOf())
)

fun pickRandom(enemies: String): List<Stratagem>{
    var tempStratagemList: MutableList<Stratagem> = mutableListOf()
    var tempStratagem: Stratagem
    for(typ in listOf("orbital", "eagle", "weapon")) {
        do {
            tempStratagem = stratagemList.random()
        } while (tempStratagem.typ != typ || tempStratagem.enemy !in listOf("any",enemies))
        tempStratagemList.add(tempStratagem)
    }
    val tempTags = tempStratagemList.last().tags
    if("backpack" in tempTags){
        do {
            tempStratagem = stratagemList.random()
        } while (tempStratagem.typ in listOf("orbital", "eagle", "weapon", "backpack")  || tempStratagem.enemy !in listOf("any",enemies))
        tempStratagemList.add(tempStratagem)
    } else {
        do {
            tempStratagem = stratagemList.random()
        } while (tempStratagem.typ in listOf("orbital", "eagle", "weapon") || tempStratagem.enemy !in listOf("any",enemies))
        tempStratagemList.add(tempStratagem)
    }
    return tempStratagemList
}

class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var textViews: List<TextView>
    private lateinit var checkedRadioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }

        radioGroup = findViewById(R.id.radioGroup)
        textViews = listOf(
            findViewById<android.widget.TextView>(R.id.textView1),
            findViewById<android.widget.TextView>(R.id.textView2),
            findViewById<android.widget.TextView>(R.id.textView3),
            findViewById<android.widget.TextView>(R.id.textView4)
        )
    }

    fun onClick(view: View){
        checkedRadioButton = findViewById(radioGroup.getCheckedRadioButtonId())
        val enemies: String = when(checkedRadioButton.getText().toString()){
            "Automatons or terminids" -> "any"
            "Automatons only" -> "automatons"
            "Terminids only" -> "terminids"
            else -> "any"
        }
        val tempStratagemList = pickRandom(enemies)
        for(i in 0..3){
            textViews.get(i).setText(tempStratagemList.get(i).name)
        }
    }
}