package model;

public class ExcelentPupil extends Pupil{
    public ExcelentPupil(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(this.getName() +  " вчитися відмінно!");
    }

    @Override
    public void read() {
        System.out.println(this.getName() + " читає відмінно!");
    }

    @Override
    public void write() {
        System.out.println(this.getName() + " пише відмінно!");
    }

    @Override
    public void relax() {
        System.out.println(this.getName() + " відпочиває відмінно!");
    }
}
