/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Entities;

/**
 *
 * @author Leo
 */

public class Player extends GameCharacter implements Combatant{
    
    protected String name;
    protected Weapon arm;
    
    // constructor
    public Player(int curHp, int maxHp, String name) {
        this.puntosVidaActual = curHp;
        this.maxPuntosVida = maxHp;
        this.name = name;
    }
    
    // getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Weapon getWeapon(){
        return arm;
    }
    
    public void setWeapon(Weapon arm){
        this.arm = arm;
    }

    @Override
    public int attack(){
        return getWeapon().maxDmg;
    }
    
    // to string
    @Override
    public String toString() {
        String salida = "Player {";
        salida = salida + "Name: \"" + this.name + "\", ";
        salida = salida + "Weapon: \"" + this.arm + "\", ";
        salida = salida + "Puntos Vida Actual: " + this.puntosVidaActual + "}";
        salida = salida + "Puntos Vida Maxima: " + this.maxPuntosVida + "}";
        return salida;
    }

    
}
