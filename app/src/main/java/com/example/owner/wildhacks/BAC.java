package com.example.owner.wildhacks;

/**
 * Created by Owner on 11/21/2015.
 */
public class BAC {


    //Instance Variable
    private double amountOfAlcohol;
    private int weight;
    private double alcoholDistribution;
    private int height;
    private User user;


    public BAC (User user, double amountOfAlcohol) {
        this.user = user;
        this.amountOfAlcohol = amountOfAlcohol;
        this.weight = user.getWeight();
        this.height = user.getHeight();
        if (user.isFemale()) {
            this.alcoholDistribution = 0.66;
        } else {
            this.alcoholDistribution = 0.73;
        }
    }
    //inHours
    public Double getTime() {
        double timeInMin = (System.currentTimeMillis() / 60000);
        double timeInHours = timeInMin / 60;
        return timeInHours;
    }
    public Double getBAC() {
        double timeInMin = (System.currentTimeMillis() / 60000);
        double timeInHours = timeInMin / 60;

        return (amountOfAlcohol / (weight * alcoholDistribution)) - (0.015 * timeInHours);

    }

}
