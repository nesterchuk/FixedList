import java.io.IOException;

public class ConsoleHelper {
    public void start() {
        String choice ="";
        FixedList<String> fixedList = new FixedList<String>();
        while (!choice.equals("0")) {
            System.out.print(
                    "Menu: \n" +
                            " 0) Exit \n" +
                            " 1) Create Collection of specified size \n" +
                            " 2) Add item to collection \n" +
                            " 3) Show collection \n" +
                            " Select from the list: "
            );
            ConsoleReader reader = new ConsoleReader();
            choice = reader.readString();
            switch (choice) {
                case ("0"): break;
                case ("1"):
                    System.out.print("Enter the size of the collection: ");
                    try {
                        fixedList = new FixedList<String>(reader.readInteger());
                        System.out.println("Collection created");
                    }
                    catch (NumberFormatException | IOException  e){
                        System.out.println("Illegal value");
                        break;
                    }
                    break;
                case("2"):
                        fixedList.push(reader.readString());
                    break;
                case("3"):
                    System.out.println(fixedList.getList());
                    break;
                default:
                    System.out.println("This item does not exist");
            }
        }
    }
}
