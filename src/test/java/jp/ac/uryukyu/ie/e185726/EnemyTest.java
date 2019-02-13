package jp.ac.uryukyu.ie.e185726;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    /**
     * 「死んでる状態では攻撃できない」ことを確認。
     */
    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        enemy.setDead(true);
        for (int i = 0; i < 10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitpoint());
    }

}