import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;

import java.nio.file.*;

public class Main {

    /**
     * Saving Objects
     * objects can be flattened and inflated
     * objects can have state and behavior
     */

    // if your data will be used only by the Java program, u can use serialization

    // of your data will be used by other programs, u can use plain-text file

    /*FileOutputStream fileStream = new FileOutputStream("MyGame.ser");

    ObjectOutputStream os = new ObjectOutputStream(fileStream);

    os.writeObject(characterOne);
    os.writeObject(characterTwo);
    os.writeObject(characterThree);

    os.close();*/

    /**
     * Connection streams repsresent a connection to a source or destination
     * (file, network socket, etc),
     * while chain streams can't connect on their own and must be chained to a connection stream
     */

    // when an object is serialized, all the objects it refers to from instance
    // variables are also serialized, same goes for all the objects
    // those objects refer to are serialized

    // if you want to your class to be serializable, implement Serializable

    // transient says "don't save this variable during serialization, just skip it"

    // deserialization

    /*FileInputStream fileStream = new FileInputStream("MyGame.ser");
    ObjectInputStream os = new ObjectInputStream(fileStream);

    Object one = os.readObject();
    Object two = os.readObject();
    Object three = os.readObject();

    GameCharacter elf = (GameCharacter) one; // you have to cast it from type Object to native type
    GameCharacter troll = (GameCharacter) two;
    GameCharacter magician = (GameCharacter) three;

    os.close();*/

    /**
     * Version ID
     *
     * using the serialVersionUID
     *
     * you can add static final long serialVersionUID to a class which was changed
     * if you are sure that you can handle connections between old and new version of a class
     */
    /*public static void main(String[] args) {


        String toTest = "What is blue + yellow?/green";
        String[] result = toTest.split("/");
        for (String token : toTest) {
           System.out.println(token);
        }
    }*/

    /**
     * java.nio.file
     *
     * a Path object represents the location (name and path) of a file or directory on disk,
     * but it does not represent or give access to data in the file
     */

    Path myPath = Paths.get("Foo.txt");

    /**
     * Try-with-resources(TWR)
     */



}
