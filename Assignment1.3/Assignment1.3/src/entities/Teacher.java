package entities;

import java.util.List;

public class Teacher extends User{
    private String[] certificates;

    public Teacher(int id, String firstName, String lastName, String[] certificates){
        super(id, firstName, lastName);
        this.certificates = certificates;
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }




}
