/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Entities;

/**
 *
 * @author Leo
 */
public abstract class GameCharacter {
    protected int maxPuntosVida;
    protected int puntosVidaActual;

    // getters y setters
    public int getMaxPuntosVida() {
        return maxPuntosVida;
    }

    public void setMaxPuntosVida(int maxPuntosVida) {
        this.maxPuntosVida = maxPuntosVida;
    }

    public int getPuntosVidaActual() {
        return puntosVidaActual;
    }

    public void setPuntosVidaActual(int puntosVidaActual) {
        this.puntosVidaActual = puntosVidaActual;
    }
}
