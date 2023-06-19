// Problem: Majority Element

// Instructions: Given an array of integers, find the majority element, i.e., the element that appears more than n/2 times (where n is the size of the array). If no majority element exists, return -1.

// Example Test Case:

// Input: [2, 4, 5, 5, 5, 5, 5]

// Output: 5
//  import java.io.*;
// import java.util.Scanner;
class majority_element_java {
    public static void main(String[] args) {
        int arr[]={1,3,5,5,5,5,5};
        System.out.println(majority_element(arr));
        
    }

    public static int majority_element(int arr[]){
        int cnt=0;
        int c=0,n=arr.length;
        int index = 0;

        for(int i=0 ; i<n ; i++){
            cnt =0;
            for(int j=0 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            
            if(cnt>c){
                c = cnt;
                index=i;
            }
           
        }
        if(c>n/2){
            return arr[index];
        }
        else{
            return -1;
        }

    }
}



