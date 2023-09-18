package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CardActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card) // Inflar o layout card.xml

        // Receba a instância da classe Race da MainActivity
        val person: Race? = intent.getSerializableExtra("person") as? Race

        // Verifique se a instância não é nula
        if (person != null) {
            // Use o método getName para obter o nome e defina-o em um TextView
            val textNameView = findViewById<TextView>(R.id.textNameView)
            textNameView.setText(person.getRaceName())

            val textRaceView = findViewById<TextView>(R.id.textRaceView)
            textRaceView.setText(person.getRace())

            val strenghtView = findViewById<TextView>(R.id.strenghtView)
            strenghtView.setText(person.getStrenght())

            val dexterityView = findViewById<TextView>(R.id.dexterityView)
            dexterityView.setText(person.getDexterity())

            val intelligenceView = findViewById<TextView>(R.id.intelligenceView)
            intelligenceView.setText(person.getIntelligence())

            val charismaView = findViewById<TextView>(R.id.charismaView)
            charismaView.setText(person.getCharisma())

            val constitutionView = findViewById<TextView>(R.id.constitutionView)
            constitutionView.setText(person.getConstitution())

            val wiseryView = findViewById<TextView>(R.id.wiseryView)
            wiseryView.setText(person.getWisery())

            val lifePointsView = findViewById<TextView>(R.id.lifePointsView)
            lifePointsView.setText(person.getLifePoints())

        }


    }
}
