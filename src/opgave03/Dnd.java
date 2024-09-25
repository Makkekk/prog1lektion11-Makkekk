package opgave03;

import com.sun.tools.javac.Main;

public class Dnd {
    public static void main(String[] args) {

        Hero hero = new Hero(100, 20, 20, "Gregors", "superhuman", "Plastickrus");
        Monster Monster = new Monster (300,30, 5,"Ham nede fra kiosken", "Kast med arm", "Stor");
        fight(hero,Monster);
    }

    public static void fight(Hero hero, Monster monster) {
        while (hero.lifePoints > 0 && monster.lifePoints > 0) {
            int roll = rollD100();
            Hero.heroAttacks(roll, hero, monster);
            if (monster.lifePoints > 0) {
                roll = rollD100();
                Monster.monsterAttacks(roll, hero, monster);
            }
        }
    }


    public static int rollD100() {
        return (int) (Math.random() * 100 + 1);
    }
}