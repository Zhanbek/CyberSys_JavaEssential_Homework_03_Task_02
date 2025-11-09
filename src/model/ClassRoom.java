package model;

public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(Pupil first, Pupil second) {
        this(first, second, new GoodPupil("Тарас"));
    }

    public ClassRoom(Pupil first, Pupil second, Pupil third) {
        this(first, second, third, new ExcelentPupil("Дмитро"));
    }

    public ClassRoom(Pupil first, Pupil second, Pupil third, Pupil fourth) {
        pupils = new Pupil[]{first, second, third, fourth};
    }

    public void getPupilsInfo() {
        for (Pupil pupil : pupils) {
            pupil.getInfo();
            System.out.println();
        }
    }

}
