package DungeonGame;
import java.io.*;

public class DungeonTest {
    public static void main(String[] args) {
        DungeonGame d = new DungeonGame();
        System.out.println(d.getX() + d.getY() + d.getZ());

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dg.ser"));
            oos.writeObject(d);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dg.ser"));
            d = (DungeonGame) ois.readObject();
            ois.close();

        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(d.getX() + d.getY() + d.getZ());

    }

}
