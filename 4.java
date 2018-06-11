
import java.util.*;
 import java.lang.*;
class Waveform
{
    void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
 
    void sortInWave(int arr[], int n)
    {
int i;
        Arrays.sort(arr);
        for ( i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
        for(i=0;i<n;i++)
           System.out.println(arr[i]);
    }
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
       int n = 10;
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        Waveform ob = new Waveform();
        ob.sortInWave(a, n);
} }