package com.adapter;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class App {
    public static void main(String[] args) {

        EnemyAttacker enemy1 = new EnemyTank();

        EnemyRobot robot1 = new EnemyRobot();
        EnemyAttacker enemy2 = new EnemyRobotAdapter(robot1);

        enemy1.fire();
        enemy1.move();
        enemy2.fire();
        enemy2.move();
    }
}
