package com.example.myapplication

import android.os.Parcelable
import java.io.Serializable

open abstract class Race(val name: String): Serializable {

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
        fun create(race:EnumRace, name: String):Race{
            val createdRace = when(race){
                EnumRace.HUMAN -> Human(name)
                EnumRace.HALFGIANT ->  HalfGiant(name)
                EnumRace.ELF -> Elf(name)
                EnumRace.DWARF -> Dwarf(name)
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

    abstract fun getRaceName(): String
    abstract fun getStrenght(): String
    abstract fun getDexterity(): String
    abstract fun getConstitution(): String
    abstract fun getIntelligence(): String
    abstract fun getWisery(): String
    abstract fun getCharisma(): String
    abstract fun getLifePoints(): String

    abstract fun getRace(): String

}


