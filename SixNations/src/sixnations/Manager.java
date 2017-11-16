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
public class Manager extends TeamMember {
    private double winPercent;
    private int wins;
    private int losses;
    private int draws;

    public Manager(double winPercent, int wins, int losses, int draws, int age, String country, String name) {
        super(name,age,country);
        this.winPercent = winPercent;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    public double getWinPercent() {
        int totalGames = wins + losses + draws;
        winPercent = wins/totalGames;
        return winPercent;
    }

    public void setWinPercent(double winPercent) {
        this.winPercent = winPercent;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
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
