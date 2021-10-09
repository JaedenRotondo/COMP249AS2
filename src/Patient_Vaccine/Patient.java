package Patient_Vaccine;

import java.util.Objects;

public class Patient {

    private String name;
    private String healthCardNumber;
    private String emailAddress;
    private long phoneNumber;
    private Object Vaccine;

    // Default Constructor
    public Patient(String name, String healthCardNumber, String emailAddress, long phoneNumber, Object vaccine) {
        this.name = name;
        this.healthCardNumber = healthCardNumber;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        Vaccine = vaccine;
    }

    public Patient(Patient patient) {
        this.name = patient.name;
        this.healthCardNumber = patient.healthCardNumber;
        this.emailAddress = patient.emailAddress;
        this.phoneNumber = patient.phoneNumber;
        this.Vaccine = patient.Vaccine;
    }

    // Generate Accessors
    public String getName() {
        return name;
    }

    public String getHealthCardNumber() {
        return healthCardNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Object getVaccine() {
        return Vaccine;
    }

    // Generate Mutators

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthCardNumber(String healthCardNumber) {
        this.healthCardNumber = healthCardNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setVaccine(Object vaccine) {
        Vaccine = vaccine;
    }

    // Generate toString Method
    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", healthCardNumber='" + healthCardNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", Vaccine=" + Vaccine +
                '}';
    }

    // Generate equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return getPhoneNumber() == patient.getPhoneNumber() && Objects.equals(getName(), patient.getName()) && Objects.equals(getHealthCardNumber(), patient.getHealthCardNumber()) && Objects.equals(getEmailAddress(), patient.getEmailAddress()) && Objects.equals(getVaccine(), patient.getVaccine());
    }

}
