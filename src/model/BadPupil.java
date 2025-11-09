package model;

public class BadPupil extends Pupil {
    public BadPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(this.getName() + " вчиться погано!");
    }

    @Override
    public void read() {
        System.out.println(this.getName() + " читає погано!");
    }

    @Override
    public void write() {
        System.out.println(this.getName() + " пише погано!");
    }

    @Override
    public void relax() {
        System.out.println(this.getName() + " відпочиває погано!");
    }
}

