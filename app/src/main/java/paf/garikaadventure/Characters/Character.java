package paf.garikaadventure.Characters;

import android.widget.ImageView;

import paf.garikaadventure.Items.Weapons.Weapon;

/**
 * Created by PAF on 26/06/2017.
 */

public class Character {

    private String name;
    private int lifePoint;
    private int damage;
    private int armor;

    private int strength;
    private int intelligence;
    private int agility;
    private int charisma;

    private int attack;
    private int parry;

    private int stamina;
    private int concentration;
    private Character target;

    private Weapon weapon;
    private ImageView picture;

    private Boolean isAlive;

    public Character() {
        isAlive = true;
    }

    public int attack(){
        int damagePoints = getDamage() + (strength/1000);
        return damagePoints;
    }

    public void looseLife (){
        int currentLife = lifePoint - (target.attack() - armor);
        setLifePoint(currentLife);
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
        if(lifePoint == 0){
            setAlive(false);
        }
    }

    public int getDamage(){
        damage = weapon.getDamage();
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getConcentration() {
        return concentration;
    }

    public void setConcentration(int concentration) {
        this.concentration = concentration;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Boolean isAlive() {
        return isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageView getPicture() {
        return picture;
    }

    public void setPicture(ImageView picture) {
        this.picture = picture;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getParry() {
        return parry;
    }

    public void setParry(int parry) {
        this.parry = parry;
    }

}
