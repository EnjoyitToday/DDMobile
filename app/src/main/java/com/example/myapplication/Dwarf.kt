package com.example.myapplication

class Dwarf(name: String): Race(name){
    override fun calculateStrenght() {}

    override fun calculateDexterity() {}

    override fun calculateConstitution() {
        this.constitution =+ 1
    }

    override fun calculateIntelligence() {}

    override fun calculateWisery() {}

    override fun calculateCharisma() {}

    override fun calculateLifePoints() {
        this.lifePoints = this.constitution*3.5
    }
}