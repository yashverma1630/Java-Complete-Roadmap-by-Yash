import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

            System.out.print("Enter Length of Array : ");
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];

            System.out.println("Enter Numbers in Array : ");
            for(int i=0; i<n; i++){
                arr[i]= Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);

            int secondLargest = 0;
            boolean flag=false;
            for(int i=n-1; i>=0; i--){
                if(arr[i]!=arr[n-1]) {
                    secondLargest=arr[i];
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println("Second largest in array : "+secondLargest);
            }
            else{
                System.out.println("Second largest Not Found");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
