import java.until.scanner;
public class libraryapp{
    public static void main(string args){
        libraryservice libraryservice=new libraryservice ();
        scanner scanner = new scanner (sytem.in);
        while true{
            system.out.println("library management system");
            system.out.println("1. add item");
            system.out.println("2. remove item");
            system.out.println("4.vlist items");
            system.out.println("5.exist");
            system.out.print("enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    additem(libraryservice,scanner);
                    break;
                    case 2:
                        removeitem(libraryservice,scanner);
                        case 3:
                            finditembytitle(libraryservice,scanner);
                            case 4:
                                listitems (libraryservice);
                                break;
                                case 5:
                                    system.exit(0);
                                    break;
                                    default:
                                        system.out.println("invalid choice. please try again.");
            }
        }
}
private static void
additem(libraryservice libraryservice, scanner scanner){
}
private static void
listitems(libraryservice libraryservice){
}
}