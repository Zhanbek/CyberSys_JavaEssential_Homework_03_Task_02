package model;

public class Pupil {
    private String name;

    public Pupil(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void study() {
        System.out.print("Executing Pupil.study()");
    }

    public void read() {
        System.out.println("Executing Pupil.read()");
    }

    public void write() {
        System.out.println("Executing Pupil.write()");
    }

    public void relax() {
        System.out.println("Executing Pupil.relax()");
    }

    public void getInfo() {
        this.study();
        this.read();
        this.write();
        this.relax();
    }
}
