package com.example.myapplication

open abstract class Race{

    var dice1:Int = 0 ;
    var dice2:Int = 0 ;
    var dice3:Int = 0 ;

    var strenght:Int = 0;
    var dexterity:Int= 0;
    var constitution:Int = 0;
    var intelligence:Int = 0;
    var wisery:Int = 0;
    var charisma:Int = 0;
    var lifePoints:Double = 0.0;

    init{
        this.dexterity = this.rollDices();
        this.strenght = this.rollDices();
        this.constitution= this.rollDices();
        this.intelligence = this.rollDices();
        this.wisery = this.rollDices();
        this.charisma = this.rollDices();
        this.calculateStrenght();
        this.calculateDexterity();
        this.calculateConstitution();
        this.calculateIntelligence();
        this.calculateWisery();
        this.calculateCharisma();
        this.calculateLifePoints();
     }

    companion object{
        fun create(race:EnumRace):Race{
            val createdRace = when(race){
                EnumRace.DWARF -> Dwarf()
                EnumRace.ELF -> Elf()
                EnumRace.HALFGIANT ->  HalfGiant()
                EnumRace.HUMAN -> Human()
            }
            return createdRace
        }
    }

    abstract fun calculateStrenght()
    abstract fun calculateDexterity()
    abstract fun calculateConstitution()
    abstract fun calculateIntelligence()
    abstract fun calculateWisery()
    abstract fun calculateCharisma()
    abstract fun calculateLifePoints()

    fun rollDices():Int{
        this.dice1 = (1..6).random()
        this.dice2 = (1..6).random()
        this.dice3 = (1..6).random()
        var total = (this.dice1 + this.dice2 + this.dice3)
        return total;
    }

}