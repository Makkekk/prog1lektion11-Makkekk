package opgave03;

    public class Monster {
        public int lifePoints;
        public int damagePoints;
        public int chanceOfHit;
        public String description;
        public String attackDescription;
        public String attribute;

        public Monster(int lifepoints, int damagePoints, int chanceOfHit, String description, String attackDescription, String attribute) {
            this.lifePoints = lifepoints;
            this.damagePoints = damagePoints;
            this.chanceOfHit = chanceOfHit;
            this.description =  description;
            this.attackDescription = attackDescription;
            this.attribute = attribute;
        }

        public static void monsterAttacks(int roll, Hero hero, Monster monster) {
            System.out.print("the " + monster.description + " " + monster.attackDescription);
            if (roll <= monster.chanceOfHit) {
                System.out.println(" inflicting " + monster.damagePoints + " damage");
                hero.lifePoints -= monster.damagePoints;
                if (hero.lifePoints <= 0) {
                    System.out.println("Slaying " + hero.name);
                }
            } else {
                System.out.println(" but " + hero.name + " defends heroically");
            }
        }

    }