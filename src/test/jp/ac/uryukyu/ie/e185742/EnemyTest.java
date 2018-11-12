package jp.ac.uryukyu.ie.e185742;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        enemy.dead = true;
        for(int i = 0; i<10; i++); {
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.hitPoint);
    }
}