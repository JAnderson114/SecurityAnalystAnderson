/*
 * Joshua Anderson - janderson114@dmacc.edu
 * CIS171 Tues Afternoon
 * Date: 9/21/2026
 * Operating System: DMACC Computer
 * IDE: IntelliJ
 * Program Description(short): This program defines a SecurityAnalyst class
 * with attributes, constructors, getters, setters, and methods.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified
 * Documentation of Resources Used: Canvas
 */
package model;

public class SecurityAnalyst {

    // Instance fields
    private String analystName;
    private String certification;
    private int yearsExperience;
    private boolean activeIncident;

    // Default constructor
    public SecurityAnalyst() {
        analystName = "Unknown";
        certification = "None";
        yearsExperience = 0;
        activeIncident = false;
    }

    // Non-default constructor
    public SecurityAnalyst(String analystName, String certification,
                           int yearsExperience, boolean activeIncident) {
        this.analystName = analystName;
        this.certification = certification;
        this.yearsExperience = yearsExperience;
        this.activeIncident = activeIncident;
    }

    // Getters
    public String getAnalystName() {
        return analystName;
    }

    public String getCertification() {
        return certification;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public boolean isActiveIncident() {
        return activeIncident;
    }

    // Setters
    public void setAnalystName(String analystName) {
        this.analystName = analystName;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public void setActiveIncident(boolean activeIncident) {
        this.activeIncident = activeIncident;
    }

    // Investigate method
    public String investigate() {
        return analystName + " is investigating a potential security incident.";
    }

    // toString method
    @Override
    public String toString() {
        return "SecurityAnalyst{" +
                "analystName='" + analystName + '\'' +
                ", certification='" + certification + '\'' +
                ", yearsExperience=" + yearsExperience +
                ", activeIncident=" + activeIncident +
                '}';
    }
}