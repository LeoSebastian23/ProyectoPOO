/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectopoo.Views;

/**
 *
 * @author Leo
 */

import java.util.Scanner;
import proyectopoo.Entities.GameCharacter;
import proyectopoo.Entities.Map;

public class Console {
    protected Scanner sc;

    public Console() {
        sc = new Scanner(System.in);
    }

    public void showMap(Map map) {
        GameCharacter[][] grid = map.getMap();
        for (GameCharacter[] grid1 : grid) {
            for (GameCharacter grid11 : grid1) {
                if (grid11 != null) {
                    System.out.print(grid11.toString().charAt(0) + " ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public String askUserMove() {
        System.out.print("Enter your move: ");
        return sc.nextLine();
    }

    public void showStatus(String status) {
        System.out.println(status);
    }
}
