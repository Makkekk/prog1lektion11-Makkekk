package opgave03;

public class Hero {
    public int lifePoints;
    public int damagePoints;
    public int chanceOfHit;
    public String name;
    public String pronoun;
    public String weapon;

    public Hero(int lifePoints, int damagePoints, int chanceOfHit, String name, String pronoun, String weapon) {
        this.lifePoints = lifePoints;
        this.damagePoints = damagePoints;
        this.chanceOfHit = chanceOfHit;
        this.name = name;
        this.pronoun = pronoun;
        this.weapon = weapon;
    }


    public static void heroAttacks(int roll, Hero hero, Monster monster) {
        System.out.print(hero.name + " attacks with " + hero.pronoun + " " + hero.weapon);
        if (roll <= hero.chanceOfHit) {
            System.out.println(" and hits the " + monster.description + " inflicting " + hero.damagePoints);
            monster.lifePoints -= hero.damagePoints;
            if (monster.lifePoints <= 0) {
                System.out.println("killing the " + monster.description);
            }
        } else {
            System.out.println(" but misses the target.");
        }
    }
}

