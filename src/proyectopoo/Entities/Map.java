/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Entities;

/**
 *
 * @author Leo
 */

public class Map {

    /**
     *
     */
    protected GameCharacter[][] map;

    public Map(int width, int height) {
        map = new GameCharacter[width][height];
    }

    public GameCharacter getCharacterAt(int x, int y) {
        return map[x][y];
    }

    public void setCharacterAt(int x, int y, GameCharacter character) {
        map[x][y] = character;
    }

    public GameCharacter[][] getMap() {
        return map;
    }
}
