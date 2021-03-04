import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoalsArrayList {

    public static void main(String[] args) {

        System.out.println("Please enter the maximum number of inputs: ");
        int limit = 0;
        Scanner number = new Scanner(System.in);
        limit = number.nextInt();

        System.out.println("Please enter some numbers: ");
        Scanner in = new Scanner(System.in);

        List<Integer> goals = new ArrayList<Integer>();

        for(int i=0; i<limit; i++){
            goals.add(in.nextInt());
        }

        for(int i=0; i<goals.size(); i++){
            System.out.println(goals.get(i));
        }

        number.close();
        in.close();


        goals.add(3);
        goals.add(7);
        goals.add(14);
        goals.add(21);
        goals.add(28);

        for(int i=0; i<goals.size(); i++){
            System.out.println(goals.get(i));
        }
    }
}
