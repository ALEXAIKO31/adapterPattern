package mx.iteso.adapter.enemy.impl;

import mx.iteso.adapter.enemy.EnemyAttacker;

public class EnemyTank implements EnemyAttacker {

    public void fireWeapon() {
        System.out.println("Enemy tank fires weapon");
    }

    public void driveForward() {
        System.out.println("Enemy Tank moves forward");
     }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }

}
