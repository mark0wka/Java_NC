package com.mark0wka.chapter2;

public class EX9Car {

    private double kilometers = 0;
    private double litersOfFuel = 0;
    private double fuelConsumption = 0;

    public EX9Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void fillTank (double litersOfFuel) {
        this.litersOfFuel += litersOfFuel;
    }

    public double calculateDistance() {
        return kilometers;
    }

    public double getLitersOfFuel () {
        return litersOfFuel;
    }

    public void move (int kilometers) {
        if (kilometers <= this.litersOfFuel * this.fuelConsumption) {
            this.kilometers += kilometers;
            this.litersOfFuel -= kilometers / this.fuelConsumption;
        } else {
            System.out.println("Not enough fuel");
            this.kilometers += this.litersOfFuel * this.fuelConsumption;
            this.litersOfFuel = 0;
        }
    }
}
