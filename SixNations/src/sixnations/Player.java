/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixnations;

/**
 *
 * @author Davy Sheehy
 */
public class Player extends TeamMember {
    int caps;
    int tries;
    String club;

    public Player(int caps, int tries, String club, String name, int age, String country) {
        super(name, age, country);
        this.caps = caps;
        this.tries = tries;
        this.club = club;
    }

    public int getCaps() {
        return caps;
    }

    public void setCaps(int caps) {
        this.caps = caps;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public String getClub() {
        return club;
    }

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
