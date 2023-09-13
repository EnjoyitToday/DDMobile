package com.example.myapplication

class Elf: Race()  {

    override fun calculateStrenght() {}

    override fun calculateDexterity() {
       this.dexterity =+ 1
    }

    override fun calculateConstitution() {}

    override fun calculateIntelligence() {}

    override fun calculateWisery() {}

    override fun calculateCharisma() {}

    override fun calculateLifePoints() {
        this.lifePoints = this.constitution*3.5
    }
}