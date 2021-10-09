package Driver;

import Patient_Vaccine.Patient;
import Patient_Vaccine.Vaccine;

public class Driver {
    public static void main(String[] args) {
        Vaccine v = new Vaccine();
        Patient a  = new Patient("name", "Healthcard Number", "email Adress", 234324, v);
        // String name, String healthCardNumber, String emailAddress, long phoneNumber, Object vaccine
        System.out.println(a);
    }
}
