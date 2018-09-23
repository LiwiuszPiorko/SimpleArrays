import java.util.Arrays;
public class Names {
    public static void main(String[]args){

        String[] names = new String[3];
        names[0] = "Bolek";
        names[1] = "Wiktor";
        names[2] = "Ania";

        String arrayString = Arrays.toString(names);
        System.out.println(arrayString);
    }
}
