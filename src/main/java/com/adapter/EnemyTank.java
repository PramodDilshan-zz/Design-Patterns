package com.adapter;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class EnemyTank implements EnemyAttacker {
    @Override
    public void fire() {
        System.out.println("firing...");
    }

    @Override
    public void move() {
        System.out.println("moving...");
    }
}
