import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class reads a file.
 */
public class FileReader {

    /**
     * Method to read the file and return a BST of profiles.
     *
     * @param filename the name of the file
     * @return BST of profiles created from the file
     */
    public static BST readProfileSet (String filename){
        File inputFile = new File(filename);
        Scanner in = null;
        try{
            in = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return FileReader.readLineByLine(in);
    }

    /**
     * Reads the data file used by the program and populates the BST.
     *
     * @param in the scanner of the file
     * @return BST of profiles created from the file
     */
    public static BST readLineByLine (Scanner in){
        while (in.hasNextLine()){
            readProfileInfo(in);
        }
        return FileReader.populateBST(in);
    }

    /**
     * Method to read a profile's attributes and create an instance of that profile.
     *
     * @param line containing the entries to create a new object
     * @return a profile created
     * */
    public static Profile readProfileInfo (Scanner line) {
        String profileSpec = String.valueOf(line);
        String[] splitProfSpec = profileSpec.split("[,;]");
        String lastName = splitProfSpec[1];
        String firstName = splitProfSpec[2];
        int DD = Integer.parseInt(splitProfSpec[3]);
        int MM = Integer.parseInt(splitProfSpec[4]);
        int YYYY = Integer.parseInt(splitProfSpec[5]);
        String email = splitProfSpec[6];
        String[] interests = splitProfSpec;
        String[] activity = splitProfSpec;

        Profile myNewProfile = new Profile(firstName,lastName,DD,MM,YYYY,email,interests,activity);

        return myNewProfile;
    }

    /**
     * Creates a BST and populates it with profiles created from data from file.
     *
     * @param in the scanner of the file
     * @return BST of profiles
     * */
    public static BST populateBST (Scanner in){
        BST newTree = new BST();
        while (in.hasNext()){
            newTree.addProfile(readProfileInfo(in));
        }
        return newTree;
    }
}

