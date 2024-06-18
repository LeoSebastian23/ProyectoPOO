/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Controllers;

import java.util.ArrayList;
import java.util.List;
import proyectopoo.Entities.GameCharacter;
import proyectopoo.Entities.Map;
import proyectopoo.Views.Console;

/**
 *
 * @author Leo
 */
public class GameController {
    protected List<GameCharacter> characters;
    protected Map gameMap;
    protected Console view;

    public GameController(int mapWidth, int mapHeight, Console view) {
        this.characters = new ArrayList<>();
        this.gameMap = new Map(mapWidth, mapHeight);
        this.view = view;
    }

    public void addCharacter(GameCharacter character, int x, int y) {
        characters.add(character);
        gameMap.setCharacterAt(x, y, character);
    }

    public void move(GameCharacter character, int newX, int newY) {
        // Lógica de movimiento
    }

    public void combat(GameCharacter attacker, GameCharacter defender) {
        // Lógica de combate
    }

    public Map getGameMap() {
        return gameMap;
    }

    public List<GameCharacter> getCharacters() {
        return characters;
    }
}
