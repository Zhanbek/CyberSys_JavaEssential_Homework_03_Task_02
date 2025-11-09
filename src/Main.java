import model.BadPupil;
import model.ClassRoom;
import model.Pupil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pupil first = new BadPupil("Нафанаил");
        Pupil second = new BadPupil("Лада");

        ClassRoom room = new ClassRoom(first, second);

        room.getPupilsInfo();
    }
}