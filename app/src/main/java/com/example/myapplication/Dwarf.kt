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
    override fun getRaceName(): String {
        return this.name
    }
    override fun getDexterity(): String {
        return this.dexterity.toString()
    }
    override fun getConstitution(): String {
        return this.constitution.toString()
    }
    override fun getIntelligence(): String {
        return this.intelligence.toString()
    }
    override fun getWisery(): String {
        return this.wisery.toString()
    }
    override fun getCharisma(): String {
        return this.charisma.toString()
    }
    override fun getLifePoints(): String {
        return this.lifePoints.toString()
    }
    override fun getStrenght(): String {
        return this.strenght.toString()
    }

    override fun getRace(): String {
        return "Dwarf"
    }
}