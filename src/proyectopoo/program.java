/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopoo;

import proyectopoo.Controllers.GameController;
import proyectopoo.Entities.Enemy;
import proyectopoo.Entities.Player;
import proyectopoo.Entities.Weapon;
import proyectopoo.Views.Console;

/**
 *
 * @author Leo
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Console console = new Console();
        GameController controller = new GameController(10, 10, console);

        Weapon sword = new Weapon("Sword", 5, 10);
        Player player = new Player("Hero", 100,200, sword);
        Enemy enemy = new Enemy(50, 7);

        controller.addCharacter(player, 0, 0);
        controller.addCharacter(enemy, 2, 2);

        console.showMap(controller.getGameMap());
        console.showStatus(player.toString());

        // Movimiento y otras acciones
        console.askUserMove();

        // Lógica adicional del juego
    }
    
}
