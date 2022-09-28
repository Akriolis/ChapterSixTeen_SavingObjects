import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        GameCharacter one = new GameCharacter(
                60,
                "Elf",
                new String[]{"bow","sword","dust"});
        GameCharacter two = new GameCharacter(
                200,
                "Troll",
                new String[]{"bare hands", "big ax"});
        GameCharacter three = new GameCharacter(
                120,
                "Magician",
                new String[]{"spells", "invisibility"});

        try{
            FileWriter writer = new FileWriter("Foo.txt");

            writer.write(one.getWeapons());
            writer.write(two.getWeapons());
            writer.write(three.getWeapons());
            writer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
