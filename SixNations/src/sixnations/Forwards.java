/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixnations;

/**
 *
 * @author Wayne Hartigan
 */
public class Forwards extends Player {
    int weight;
    
    public Forwards(int weight, int caps, int tries, String club, String name, int age, String country) {
        super(caps, tries, club, name, age, country);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getCaps() {
        return caps;
    }

    @Override
    public void setCaps(int caps) {
        this.caps = caps;
    }

    @Override
    public int getTries() {
        return tries;
    }

    @Override
    public void setTries(int tries) {
        this.tries = tries;
    }

    @Override
    public String getClub() {
        return club;
    }

    @Override
    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }
}
