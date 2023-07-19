/*
apporch
1.sort array in dec order;
2.cost += A[i]*(i+1)

remove highest element frist
A=4,6,1
remove 6 --> 4+6+1 =11
remove 4 -->4+1=5
remove 1 -->1=1 total 17(min)

6*(0+1)+4(1+1)+1(2+1) = 17
 */
import java.util.*;
public class ElementsRemovalCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
        System.out.println(minimumCost(A,n));
    }
    public static int minimumCost(int A[],int n)
    {
        int result = 0;
        Arrays.sort(A);
        int des[] = new int [n];
        for(int i=0;i<n;i++)
        {
            des[i] = A[n-i-1];
        }

        for(int i=0;i<n;i++)
        {
            result += des[i]*(i+1);
        }
        return result;
    }
}
/*
Elements Removal
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.

Example Input
Input 1:
A = [2, 1]
Input 2:
A = [5]
Example Output
Output 1:
4
Output 2:
5
 */
