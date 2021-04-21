import java.util.*;
import java.util.stream.*;

//following contains the essential methods to create an addressBook
//and then that addressbook will be passed to Main class for further operations
public class performSorting {
    
    Map<Integer,List<String>> MAB = new HashMap<Integer,List<String>>();
    public String FirstName;
    public String LastName;
    public String Address;
    public String City;
    public String State;
    public String Zip;
    public String PhoneNumber;
    public performSorting addressBook;

    public int numberOfUser() {
        System.out.println("how many users u want to store");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public String[] userInput() {   
    
        String arr[] = new String[7];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FirstName  : ");
        String firstName = sc.nextLine();
        arr[0] = firstName;
        System.out.print("Enter LastName  : ");
        String lastName = sc.nextLine();
        arr[1] = lastName;
        System.out.print("Enter Address  : ");
        String address = sc.nextLine();
        arr[2] = address;
        System.out.print("Enter City  : ");
        String city = sc.nextLine();
        arr[3] = city;
        System.out.print("Enter State : ");
        String state = sc.nextLine();
        arr[4] = state;
        System.out.print("Enter PhoneNUmber : ");
        String phoneNumber = sc.nextLine();
        arr[5] = phoneNumber;
        System.out.print("Enter Zip : ");
        String zip = sc.nextLine();
        arr[6] = zip;
        return arr;
    }   

    public void setName() {
        String res[] = userInput();
        this.FirstName = res[0];
        this.LastName = res[1];
        this.Address = res[2];
        this.City = res[3];
        this.State = res[4];
        this.Zip = res[5];
        this.PhoneNumber = res[6];
   }

   public void addressBook() {
        int count = 0;
        int numberOfUser = numberOfUser();
        for(int i = 0 ; i < numberOfUser ; i++) {
            System.out.println();
            System.out.println("enter th detail of user:"+i);
            setName();
            List<String> take = new ArrayList<String>();
            while(true) {
                take.add(count++,FirstName);
                take.add(count++,LastName);
                take.add(count++,Address);
                take.add(count++,City);
                take.add(count++,State);
                take.add(count++,PhoneNumber);
                take.add(count++,Zip);
                count = 0;
                break;
            }
            MAB.put(i,take);
        }

        }
        
}
