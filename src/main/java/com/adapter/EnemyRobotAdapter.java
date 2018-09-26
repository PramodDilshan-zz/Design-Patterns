package com.adapter;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;

    EnemyRobotAdapter(EnemyRobot enemyRobot){
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fire() {
        enemyRobot.fightWithHand();
    }

    @Override
    public void move() {
        enemyRobot.jump();
    }
}
