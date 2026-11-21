/*
 *	Author:  Justin Pyo
 *  Date: 11/19/26
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {

		Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];

        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior();
            wizards[i] = new Wizard();
        }

        int w = 0;
        int z = 0;

        while (w < 100 && z < 100) {

            wizards[z].attack(warriors[w]);

            if (warriors[w].isDead()) {
                w++;
            }
            else {
                warriors[w].attack(wizards[z]);

                if (wizards[z].isDead()) {
                    z++;
                }
            }
        }

        if (w == 100) {
            System.out.println("Wizards won with " + (100 - z) + " left in their army.");
        }
        else {
            System.out.println("Warriors won with " + (100 - w) + " left in their army.");
        }

	}
}
