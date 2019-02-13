package jp.ac.uryukyu.ie.e185726;

/**
 * Created by tnal on 2016/11/13.
 */
public class Main {
    public static void main(String[] args){
        Hero hero = new Hero();
        Enemy enemy = new Enemy();

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( !hero.isDead()  && !enemy.isDead()  ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}