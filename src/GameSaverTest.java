import java.io.*;

public class GameSaverTest {
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
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("One's type: " + oneRestore.getType() + ", power: " + oneRestore.getPower() + ", weapons " + oneRestore.getWeapons());
            System.out.println("Two's type: " + twoRestore.getType() + ", power: " + twoRestore.getPower() + ", weapons " + twoRestore.getWeapons());
            System.out.println("Three's type: " + threeRestore.getType() + ", power: " + threeRestore.getPower() + ", weapons " + threeRestore.getWeapons());

        } catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
