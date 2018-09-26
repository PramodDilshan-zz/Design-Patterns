package com.builder;

import java.util.Date;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public class BirthCertificate {
    String firstName;
    String lastName;
    Date dateOfBirth;
    String dateOfPlace;
    String fathersName;
    String mothersName;

    BirthCertificate(String firstName,
                     String lastName,
                     Date dateOfBirth,
                     String dateOfPlace,
                     String fathersName,
                     String mothersName){

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfPlace = dateOfPlace;
        this.fathersName = fathersName;
        this.mothersName = mothersName;

    }

    static class Builder{
        String firstName;
        String lastName;
        Date dateOfBirth;
        String dateOfPlace;
        String fathersName;
        String mothersName;

        public Builder firsName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder dateOfBirth(Date dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder dateOfPlace(String dateOfPlace){
            this.dateOfPlace = dateOfPlace;
            return this;
        }

        public Builder fathersName(String fathersName){
            this.fathersName = fathersName;
            return this;
        }

        public Builder mothersName(String mothersName){
            this.mothersName = mothersName;
            return this;
        }

        public BirthCertificate builder(){
            return new BirthCertificate(
                    firstName,
                    lastName,
                    dateOfBirth,
                    dateOfPlace,
                    fathersName,
                    mothersName);
        }
    }
}
