import java.util.*;

public class Q2_SlidingWindowMedian
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of input: ");
        int size = sc.nextInt();
        System.out.println("Enter the k: ");

        int k = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");

        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        List<Integer> l = new ArrayList<>();
        List<Integer> res = new ArrayList<>();


        for(int i = 0;i<size;i++)
        {
            if(l.size() < k)
            {
                l.add(arr[i]);
                if(l.size() != k)
                    continue;
            }
            res.add(findMedian(new ArrayList<>(l),k));
            l.remove(0);
        }
        System.out.print("Output: ");

        System.out.println(res);

    }

    private static int findMedian(List<Integer> l,int n)
    {
        Collections.sort(l);
        if(n%2 == 1)
        {
            return l.get(l.size()/2);
        }
        else
        {
            return ((l.get(n / 2 - 1) + l.get(n / 2)) / 2);
        }
    }
}
