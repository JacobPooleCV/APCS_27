/*
 *	Author: Justin Pyo
 *  Date: 9/17/26
 * 	Collaborator: 
 * ================================================================
 *  ITALIAN BRAINROT SHOWDOWN -- A One-Shot Battle
 *  Practice: Math.random(), Math class methods, Scanner, variables
 * ================================================================
 * The whole showdown -- training your fighter, the rival's arrival,
 * the clash, and the rizz points you walk away with -- happens in a
 * single, straight-line pass through this program. No branching, no
 * repeating, just one battle told in code.
 */

import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ============================================================
        // SECTION 1: Train Your Fighter  (given -- do not change)
        // ============================================================
        System.out.println("=== ITALIAN BRAINROT SHOWDOWN ===");
        System.out.println("Somewhere in Ohio, a legendary brainrot battle is about to begin...");
        System.out.print("Name your brainrot fighter (e.g. Tralalero Tralala): ");
        String heroName = sc.nextLine();

        System.out.print("How many hours has " + heroName + " trained at the Skibidi Gym (1-10)? ");
        int trainingHours = sc.nextInt();
        sc.nextLine();
        int trainingBonus = trainingHours * 3;

        // TODO 1: Roll your fighter's stats using Math.random(). Create:
        //   - int rizzPower:      random 10-30, PLUS trainingBonus (Not inclusive of 30)
        //   - int sigmaSpeed:     random 10-30                     (Not inclusive of 30)
        //   - int brainrotEnergy: random 5-25, PLUS (trainingBonus / 2)(Not inclusive of 25)

        int rizzPower = (int)(Math.random() * 20 + 10) + trainingBonus;
        int sigmaSpeed = (int)(Math.random() * 20 + 10);
        int brainrotEnergy = (int)((Math.random() * 20 + 5) + (trainingBonus/2));

        // ============================================================
        // SECTION 2: Choose Your Signature Move
        // ============================================================
        System.out.print("Give " + heroName + "'s signature move a name: ");
        String moveName = sc.nextLine();

        // TODO 2: Create an int movePower: a random whole number from
        //         5 to 20 (Not inclusive of 20).

        int movePower = (int)(Math.random() * 15 + 5);

        // ============================================================
        // SECTION 3: The Rival Appears  (given -- do not change)
        // ============================================================
        System.out.println();
        System.out.println("Suddenly, BOMBARDIRO CROCODILO descends from the sky!");

        // TODO 3: Roll the rival's stats using Math.random(). Create:
        //   - int rivalHealth:  random 80-150  (Not inclusive of 150)
        //   - int rivalPower:   random 15-35   (Not inclusive of 35)
        //   - int rivalDefense: random 5-20    (Not inclusive of 20)

        int rivalHealth = (int)(Math.random() * 70 + 80); 
        int rivalPower = (int)(Math.random() * 20 + 15);
        int rivalDefense = (int)(Math.random() * 15 + 5);

        // ============================================================
        // SECTION 4: The Showdown
        // ============================================================
        // TODO 4: Create a double heroPower, the "magnitude" of your
        //         fighter's stats plus move power:
        //         heroPower = sqrt(rizzPower^2 + sigmaSpeed^2 +
        //                          brainrotEnergy^2) + movePower

        double heroPower = Math.sqrt((rizzPower*rizzPower) + (sigmaSpeed * sigmaSpeed) + (brainrotEnergy * brainrotEnergy) + movePower);

        // TODO 5: Roll fate! Create:
        //   - double fateRoll: a random decimal from 0.5 up to (but
        //     not including) 2.0 - your luck multiplier this clash.
        //   - boolean maxRizz: true when fateRoll is greater than 1.5
        //     (store the comparison directly -- no if!).

        double fateRoll = Math.random() * 1.5 + 0.5;
        boolean maxRizz = fateRoll > 1.5;

        // TODO 6: Resolve the damage. Create:
        //   - int rawDamage: heroPower * fateRoll, cast to (int)
        //   - int finalDamage: rawDamage minus rivalDefense, but
        //     never less than 10. (Think about how you can use Math.max()).

        int rawDamage = (int)(heroPower * fateRoll);
        int finalDamage = (int)(Math.max(10,(rawDamage - rivalDefense)));

        // TODO 7: Create an int rivalHealthRemaining: rivalHealth
        //         minus finalDamage, but never less than 0.

        int rivalHealthRemaining = (int)(Math.max((rivalHealth - finalDamage),0));

        // ============================================================
        // SECTION 5: The Rival Strikes Back
        // ============================================================
        // TODO 8: The rival counterattacks. Create:
        //   - double rivalFuryRoll: a random decimal from 1.0 up to
        //     (but not including) 1.5 -- the rival's fury multiplier.
        //   - int rivalDamage: rivalPower * rivalFuryRoll, cast
        //     to (int).

        double rivalFuryRoll = Math.random() * 0.5 + 1;
        int rivalDamage = (int)(rivalPower * rivalFuryRoll);

        // TODO 9: Create an int heroHealthRemaining: your fighter
        //         starts each clash at 100 health. Subtract
        //         rivalDamage, but never let it drop below 0.

        int heroHealthRemaining = (int)(Math.max(100 - rivalDamage,0));

        // ============================================================
        // SECTION 6: The Rizz Reward
        // ============================================================
        // TODO 10: Create an int basePoints: a random whole number
        //          from 50 to 300 (Not inclusive of 300).

        int basePoints = (int)(Math.random() * 250 + 50);

        // TODO 11: Tally the reward. Create:
        //   - int damageDealt: rivalHealth minus rivalHealthRemaining
        //   - int bonusPoints: damageDealt, but capped at a maximum
        //     of 100 extra points.
        //   - int totalRizz: basePoints + bonusPoints

        int damageDealt = rivalHealth - rivalHealthRemaining;
        int bonusPoints = (int)(Math.min(damageDealt,100));
        int totalRizz = basePoints + bonusPoints;

        // ============================================================
        // SECTION 7: Battle Report  (given -- do not change but match your variables to these!)
        // ============================================================
        System.out.println();
        System.out.println("----- BATTLE REPORT -----");
        System.out.println(heroName + "  |  trained " + trainingHours + " hours at the gym");

        
        System.out.println("  RIZZ " + rizzPower + "  SPEED " + sigmaSpeed + "  BRAINROT ENERGY " + brainrotEnergy);

        System.out.println("Signature move: " + moveName + " (power " + movePower + ")");
       
        System.out.println();
        System.out.println("BOMBARDIRO CROCODILO  |  HP " + rivalHealth + "  POWER " + rivalPower + "  DEFENSE " + rivalDefense);
        System.out.println();

        System.out.println("Fighter power rating: " + heroPower);
        System.out.println("Fate roll: " + fateRoll + "  (maximum rizz achieved? " + maxRizz + ")");
        System.out.println(heroName + " lands " + finalDamage + " damage with " + moveName + "!");
        System.out.println("Rival health remaining: " + rivalHealthRemaining);
        System.out.println();

        System.out.println("Rival fury roll: " + rivalFuryRoll);
        System.out.println("BOMBARDIRO CROCODILO deals " + rivalDamage + " damage!");
        System.out.println(heroName + "'s health remaining: " + heroHealthRemaining);
        System.out.println();

        System.out.println("----- THE RIZZ REWARD -----");
        System.out.println("Base points earned: " + basePoints);
        System.out.println("Damage bonus: " + bonusPoints);
        System.out.println("TOTAL RIZZ POINTS: " + totalRizz);
        

    }
}