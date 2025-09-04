package com.hospistat.model;

public class Patient {
    private final String patientId;
    private int heartRate;
    private double temperature;

    // Constructor to initialize a patient with their ID
    public Patient(String patientId) {
        this.patientId = patientId;
    }

    // Getter and Setter for heartRate
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    // Getter and Setter for temperature
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Getter for patientId (no setter, because the ID should not change)
    public String getPatientId() {
        return patientId;
    }

    // A helpful method to represent the patient's data as a CSV string
    public String toCsvString(long timestamp) {
        return timestamp + "," + patientId + "," + heartRate + "," + temperature;
    }
}
