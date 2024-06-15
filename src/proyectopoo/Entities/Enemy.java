/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Entities;

/**
 *
 * @author Leo
 */
public class Enemy extends GameCharacter implements Combatant {
    
    protected int Damage;
    
    //  constructor
        public Enemy (int curHp, int maxHp) {
        this.puntosVidaActual = curHp;
        this.maxPuntosVida = maxHp;
        this.Damage = 2;
    }
        
    // getters y setters
    public int getDamage() {
        return Damage;
    }
    
    public void setDamage(int Damage) {
        this.Damage = Damage;
    }
    
    // to string
    @Override
    public String toString() {
        String salida = "Enemy {";
        salida = salida + "Damage: \"" + this.Damage + "\", ";
        salida = salida + "Puntos Vida Actual: " + this.puntosVidaActual + ",";
        salida = salida + "Puntos Vida Maximo: " + this.maxPuntosVida + "}";
        return salida;
    }
    
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
    
    Enemy aux = (Enemy) obj;
    
    if (this.puntosVidaActual != aux.puntosVidaActual) {
        return false;
    }
    if (this.maxPuntosVida != aux.maxPuntosVida) {
        return false;
    }
    return this.Damage == aux.Damage;
    }

    @Override
    public int attack() {   
        return Damage;  
    }
    
}
