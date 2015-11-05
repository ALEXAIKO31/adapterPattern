package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyRobot;

public class EnemyGiantRobot implements EnemyRobot{

    public void smashWithHands() {
        System.out.println("Enemy Robot Causes Damage With Its Hands");
    }

    public void walkForward() {
        System.out.println("Enemy Robot Walks Forward");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }

}
