package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinnerRace)

        // Crie uma lista de itens possíveis
        val possibleRaces = listOf("Human", "HalfGiant", "Elf", "Dwarf")

        // Crie um ArrayAdapter para associar a lista de itens ao Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, possibleRaces)

        // Defina o layout para exibir os itens no dropdown (menu suspenso)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Defina o adaptador no Spinner
        spinner.adapter = adapter

        val buttonCreate = findViewById<Button>(R.id.buttonCreate)

        val textPersonName = findViewById<EditText>(R.id.textPersonName)

        buttonCreate.setOnClickListener(){
            // Obtenha o valor selecionado do Spinner
            val selectedRace = spinner.selectedItem.toString()

            // Obtenha o nome da pessoa a partir do EditText
            val personName = textPersonName.text.toString()

            // Crie uma instância da classe com base na raça selecionada
            val person = Race.create(EnumRace.valueOf(selectedRace), personName)
            println(person.toString())
            }


    }


}

