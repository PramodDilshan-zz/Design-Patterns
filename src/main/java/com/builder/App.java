package com.builder;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class App {

    public static void main(String[] args) {

        BirthCertificate birthCertificate = new BirthCertificate.Builder()
                .firsName("pramod")
                .lastName("dilshan")
                .builder();
    }
}
