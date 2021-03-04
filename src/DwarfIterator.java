import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class DwarfIterator {

    public static void main(String[] args) {
        List<String> dwarf = new ArrayList<String>();

        dwarf.add("Bashful");
        dwarf.add("Doc");
        dwarf.add("Dopey");
        dwarf.add("Grumpy");
        dwarf.add("Happy");
        dwarf.add("Sleepy");
        dwarf.add("Sneezy");

        System.out.println("This is using the iterator and a while loop");
        ListIterator<String> it = dwarf.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("This is using a for each loop");
        for(String dwarves:dwarf){
            System.out.println(dwarves);
        }

        System.out.println("This is using a for loop");
        for(int i=0; i<dwarf.size(); i++){
            System.out.println(dwarf.get(i));
        }

    }
}
