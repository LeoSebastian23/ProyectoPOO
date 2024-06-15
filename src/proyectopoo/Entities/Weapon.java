/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Entities;

/**
 *
 * @author Leo
 */
public class Weapon{
    protected int maxDmg;
    protected int minDmg;
    protected String name;
    
    // Constructor
    public Weapon(int maxDmg, int minDmg, String name) {
        this.maxDmg = maxDmg;
        this.minDmg = minDmg;
        this.name = name;
    }

    // Getters y Setters
    public int getMaximDamage() {
        return maxDmg;
    }

    public void setMaximDamage(int maxDmg) {
        this.maxDmg = maxDmg;
    }

    public int getMinimDamage() {
        return minDmg;
    }

    public void setMinimDamage(int minDmg) {
        this.minDmg = minDmg;
    }

    public String getWeaponName() {
        return name;
    }

    public void setWeaponName(String nombre) {
        this.name = nombre;
    }
    
    // To string
    @Override
    public String toString() {
        String salida = "Weapon {";
        salida = salida + "Name: \"" + this.name + "\", ";
        salida = salida + "Damage Maxim: " + this.maxDmg + "}";
        salida = salida + "Damage Minim: " + this.minDmg + "}";
        return salida;
    }
    
    // Equals
    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    
    if (obj == null) {
        return false;
    }
    
    if (this.getClass() != obj.getClass()) {
        return false;
    }
    
    Weapon aux = (Weapon) obj;
    
    if (this.maxDmg != aux.maxDmg) {
        return false;
    }
    if (this.minDmg != aux.minDmg) {
        return false;
    }
    return this.name.equals(aux.name);
    }
}
