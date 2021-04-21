import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    
    public static void main(String args[]){

        performSorting obj = new performSorting();
        obj.addressBook();
       
        //below mentioned statement creates addressbook which contains multiple contact persons 
        List<List<String>> valueList = new ArrayList(obj.MAB.values());

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
        String stringFromOne = o1.get(0);
        String stringFromOther = o2.get(0);
        int result = stringFromOne.compareTo(stringFromOther);
        return result;
    }

}
