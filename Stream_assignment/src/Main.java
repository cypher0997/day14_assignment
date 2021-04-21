import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    
    public static void main(String args[]){

        performSorting obj = new performSorting();
        obj.addressBook();
        List<List<String>> valueList = new ArrayList(obj.MAB.values());
        Collections.sort(valueList, new sort_UnSort());
        System.out.println();
        System.out.println("the sorted adrresBook:");
        System.out.println();
        valueList.stream().map(x -> "contact Person" + x).forEach(y -> System.out.println(y));      
    }

}

class sort_UnSort implements Comparator<List<String>>{

    @Override
    public int compare(List<String> o1, List<String> o2) {
        String stringFromOne = o1.get(0);
        String stringFromOther = o2.get(0);
        int result = stringFromOne.compareTo(stringFromOther);
        return result;
    }

}
