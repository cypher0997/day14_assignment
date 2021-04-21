import java.util.*;

public class performSortionChoice {
    
    public void ps(){
        performSorting ps = new performSorting();
        ps.addressBook();

        //below mentioned statement creates addressbook which contains multiple contact persons
        List<List<String>> valueList = new ArrayList(ps.MAB.values());

         //below mentioned statement performs the sorting on addressBook
         Collections.sort(valueList, new sort_UnSort());
         System.out.println();
         System.out.println("the sorted adrresBook:");
         System.out.println();
 
         //in following statement stream api is used to print the sorted addressbook
         valueList.stream().map(x -> "contact Person" + x).forEach(y -> System.out.println(y)); 
    }
    

}

//this class implements the comparater interface which contain essential methods for sorting
class sort_UnSort implements Comparator<List<String>>{

    @Override
    //below id the overridin method from comparator interface which performs sorting
    public int compare(List<String> o1, List<String> o2) {
        
        /* this indication is for developer's purpose only
            developer cann decide to sort addressbook on basis for city,state,zip-code
            for doing sorting on basis of city provide get(3)
            or on basis of state provide get(4)
            or on basis of zip-code provide get(5)
            which is mentioned in following Statements
        */
        String stringFromOne = o1.get(4);
        String stringFromOther = o2.get(4);
        int result = stringFromOne.compareTo(stringFromOther);
        return result;
    }

}