package model;

public class GoodPupil extends Pupil {

    public GoodPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(this.getName() + " вчиться добре!");
    }

    @Override
    public void read() {
        System.out.println(this.getName() + " читає добре!");
    }

    @Override
    public void write() {
        System.out.println(this.getName() + " пише добре!");
    }

    @Override
    public void relax() {
        System.out.println(this.getName() + " відпочиває добре!");
    }
}
