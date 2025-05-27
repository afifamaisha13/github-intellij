import java.util.*;

public class KthSmallestElement {

    public static int findKthSmallest(ArrayList<Integer> list, int k) {
       
        // Sort the ArrayList
        Collections.sort(list);

        // Return the k-th smallest element (1-based indexing)
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int k = sc.nextInt();

            int smallest = findKthSmallest(list, k);
            System.out.println("The " + k + "-th smallest element is: " + smallest);
        
        sc.close();
    }
}
