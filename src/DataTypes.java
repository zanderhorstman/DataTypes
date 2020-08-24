public class DataTypes {
    public static void main(String[] args){
        // Just declaring a boolean variable, no value
        boolean isRaining;
        // Declaring and initializing (giving it a value)
        boolean isSunny = false;
        // Byte is limited, mostly used for debugging
        byte b = 0;

        int myNumber = 239;

        double myDoubleVar = 1.2;

        char singleCharacter = 'y';

        String myFirstName = "Zander";
        String myLastName = "Horstman";

        System.out.println("First value of singleCharacter: " + singleCharacter);

        singleCharacter = 'a';

        System.out.println("Second value of singleCharacter: " + singleCharacter);

        System.out.println("Is it sunny? " + isSunny);

        System.out.println("My number variable is " + (myNumber + 1));

        System.out.println("My full name is " + myFirstName + " " + myLastName);

        System.out.println("My double is " + myDoubleVar);

    }
}
