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
import com.example.helldivers2stratagempicker.Stratagem
import com.example.helldivers2stratagempicker.stratagemList

fun pickRandom(enemies: String): List<Stratagem>{
    var tempStratagemList: MutableList<Stratagem> = mutableListOf()
    var tempStratagem1: Stratagem
    var tempStratagem2: Stratagem

    do {
        tempStratagem1 = stratagemList.random()
        tempStratagem2 = stratagemList.random()
    } while ( tempStratagem1.typ != "orbital"
        || tempStratagem1.enemy !in listOf("any",enemies)
        || tempStratagem2.typ != "eagle"
        || tempStratagem2.enemy !in listOf("any",enemies)
        || ("smoke" in tempStratagem1.tags && "smoke" in tempStratagem2.tags) )
    tempStratagemList.add(tempStratagem1)
    tempStratagemList.add(tempStratagem2)

    do {
        tempStratagem1 = stratagemList.random()
        tempStratagem2 = stratagemList.random()
    } while ( tempStratagem1.typ != "weapon"
        || tempStratagem1.enemy !in listOf("any",enemies)
        || tempStratagem2.typ in listOf("orbital", "eagle", "weapon")
        || tempStratagem2.enemy !in listOf("any",enemies)
        || ("backpack" in tempStratagem1.tags && tempStratagem2.typ == "backpack" ))
    tempStratagemList.add(tempStratagem1)
    tempStratagemList.add(tempStratagem2)

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
            getString(R.string.any_enemy_string) -> "any"
            getString(R.string.automatons_string) -> "automatons"
            getString(R.string.terminids_string) -> "terminids"
            else -> "any"
        }
        val tempStratagemList = pickRandom(enemies)
        for(i in 0..3){
            textViews.get(i).setText(getText(resources.getIdentifier(tempStratagemList.get(i).name, "string", "com.example.helldivers2stratagempicker")))
        }
    }
}