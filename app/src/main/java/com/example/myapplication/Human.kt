package com.example.myapplication

class Human: Race()  {
    override fun calculateStrenght() {}

    override fun calculateDexterity() {}

    override fun calculateConstitution() {}

    override fun calculateIntelligence() {}

    override fun calculateWisery() {}

    override fun calculateCharisma() {}

    override fun calculateLifePoints() {
        this.lifePoints = this.constitution*3.5
    }
}