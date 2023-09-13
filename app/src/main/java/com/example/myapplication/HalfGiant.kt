package com.example.myapplication

class HalfGiant: Race() {
    override fun calculateStrenght() {}

    override fun calculateDexterity() {}

    override fun calculateIntelligence() {}

    override fun calculateWisery() {}

    override fun calculateCharisma() {
        this.charisma =-1
    }

    override fun calculateConstitution() {
        this.constitution =+2;
    }

    override fun calculateLifePoints() {
        this.lifePoints = this.constitution*3.5
    }
}