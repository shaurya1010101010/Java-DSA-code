
// Square pattern to print numbers in decreasing order 



// import java.util.Scanner;

// public class test {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n");
//         int n = sc.nextInt();

//         int i = 1;
//         int num = 9;
//         while (i <= n) {
//             int j = 1;
//              // Start with 9
            
//             while (j <= n) {
//                 System.out.print(num + " ");
//                 j++;
//                 num--;
//             }
            
//             System.out.println();
//             i++;
//         }
//     }
// }




// Calculator

// import java.util.Scanner;
// public class test{
	
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Choose an operation 1. Addition  2. Subtraction 3.Multiplication 4. Division:\n");
// 		int n= sc.nextInt();

// 		if (n<1 || n>4){
// 			System.out.println("Error");
// 		}
// 		else{
// 			System.out.println("Select a");
// 		}
// 		int a= sc.nextInt();

// 		System.out.println("Select b");

// 		int b=sc.nextInt();
	
	
// 	    if( n==1 ){
// 			System.out.println("The sum of a and b is: " + (a+b));
			
// 		}
// 		else if(n==2){
// 			System.out.println("The differnce of a and b is:" +(a-b));
			
// 		}
// 		else if(n==3){
// 			System.out.println("The Multiplication of a and b is: " +(a*b));
			
// 		}
// 		else {
// 			System.out.println("The division of a and b is: "+ (a/b));
			
// 		}
// 	}
			
// 	}






    
// Pyramid pattern

// import java.util.Scanner;
// public class test{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n= sc.nextInt();
//         int i=1;
//         int sum=1;
//         while(i<=n){
//             int j=1;
//             while(j<=(n-i)){
//                 System.out.print(" ");
//                 j++;
//             }
//             int k=1;
//             while(k<=(2*i-1)){
//                 System.out.print(sum+" ");
//                 sum++;
//                 k++;
                
//             }
//             i++;
//             System.out.println();
//         }

//     }
// }
	

// Add all the values in an array


// class test{
//     public static int sumofarray(int arr[]){
//         int sum=0;
//         for(int i=0; i<arr.length; i++){
//             sum+=arr[i];
//         }
//         return sum;
//     }

//     public static void main(String args[]){
//         int n[]={1,2,3,4};
//         System.out.println(sumofarray(n));
        
        
//     }
// }


//Maximum in an array

// class test{
//     public static int Maximum(int arr[]){
//         int max= Integer.MIN_VALUE;
//         for(int i=0; i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
                
//             }
//         }
//         return max;


//     }
//     public static void main(String args[]){
//         int arr[]={5,12,3,7};
//         int sol=Maximum(arr);
//         System.out.println(sol);
//     }
// }
	

// Second largest element in an array

// class test{
//     public static int secondlargestelement(int arr[]){
//         int max= Integer.MIN_VALUE;
//         int secmax= Integer.MAX_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 secmax=max;
//                 max=arr[i];
                
//             } else if(arr[i]>secmax && arr[i]!=max){
//                 secmax=arr[i];
//             }
//         }
//         return secmax;
//     }
//     public static void main(String args[]){
//         int arr[]={4,15,3,6};
//         int secondhighestelement= secondlargestelement(arr);
//         System.out.println(secondhighestelement);
//     }
// }
        
 
// Insert element in an array
                
//  class test{
//     public static int insert(int arr[],int n,int cap,int x,int pos){
//         if(n==cap){
//             return n;
//         }
//         int idx=pos-1;
//         for(int i=n-1; i>=idx;i--){
//             arr[i+1]=arr[i];
           
//         }
//         arr[idx]=x;
//         return(n+1);
    
//     }
// public static void main(String args[]){
//     int arr[]= new int[10]; int cap=5; int n=4; 
//      arr[0]=2;
//      arr[1]=5;
//      arr[2]=11;
//      arr[3]=1;

//      System.out.println("before insertion");
//      for(int i=0;i<=n;i++){
//         System.out.print(arr[i]+" ");

//      }
//      System.out.println();
//      int pos=3; int x=6;
//      insert(arr, n, cap, x, pos);
//      System.out.println("After insertion");
//       for(int i=0;i<=n;i++){
//         System.out.print(arr[i]+" ");
// }
    
//  }  
// }   
        
 // Delete element in ann array
 
 
// class test{
//     public static int Delete(int arr[], int n, int x)
//     {
//         int i;
//         for( i=0;i<n;i++){
//             if(arr[i]==x){
//             break;
//             }
//         }
//             if(i==n){
//             return n;
//             }
        
//         for(int j=i; j<n-1;j++){
//             arr[j]=arr[j+1];
//         }
//         return n-1;
        
//     }
//    public static void main(String args[]){
//     int arr[]=new int[4]; int n=4; int x=2;
//     arr[0]=1;
//     arr[1]=2;
//     arr[2]=3;
//     arr[3]=4;
//     System.err.println("Before deletion");

//     for(int i=0;i<n;i++){
//         System.out.println(arr[i]+" ");
//     }
//    n= Delete(arr, n, x);
     
//     System.out.println("After deletion");
//     for(int i=0;i<n;i++){
//         System.out.println(arr[i]+" ");
//   }
// }
// }

        
// Check if an array is sorted or not

// class test{
//     public static boolean ifsorted(int arr[], int n){
//         for(int i=1; i<n;i++){
//             if(arr[i]<arr[i-1]){
//             return false;
//         }
//     }
//         return true;
//     }
//     public static void main(String args[]){
//         int arr[]={3,6,7,1,5};
//         int n=5;
//         System.out.println(ifsorted(arr, n));

//     }
// }



// Reverse an array

// class test{
//     public static void Reverse(int arr[],int n){
//         int low=0; int high=n-1;
//         while(low<=high){
//              int temp= arr[low];
//              arr[low]= arr[high];
//              arr[high]=temp;
//              low++;
//              high--;
             
            
//         }
        
//     }
//     public static void main(String args[]){
//         int arr[]={3,10,2,6};
//         int n=4;
//          Reverse(arr, n);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//          }
    
//     }

// }


// Remove similar elements from a sorted array

// class test{
//     public static int Removesimilarelements(int arr[], int n){
//         int res=1;
//         for(int i=1;i<n;i++){
//             if(arr[res-1]!=arr[i]){
//                 arr[res]=arr[i];
//                 res++;
//             }
            
//         }
//         return res;
//     }
//     public static void main(String args[]){
//         int arr[]={10,10,20,30,30};
//         int n=5;
//        n= Removesimilarelements(arr, n);
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]+" ");
//         }
//     }

// }

    
// Left Rotate array by one

// class Test {
//     public static void leftRotateBy1(int arr[], int n) {
//         int temp = arr[0];
//         for (int i = 1; i < n; i++) {
//             arr[i - 1] = arr[i];
//         }
//         arr[n - 1] = temp;
        
//     }

    
//     public static void main(String args[]) {
//         int arr[] = {1, 5, 3, 7, 8};
//         int n=5;
//         leftRotateBy1(arr, arr.length);
       
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
        

//     }
// }
		
// Move all the zeros to the right side of an array

// import java.util.*;

// class test {
//     // Function to swap elements at two indices in an array
//     public static void swap(int arr[], int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     // Function to push all zeros to the end of the array
//     public static void pushZeros(int arr[], int n) {
//         int count = 0;

//         // Traverse the array and swap non-zero elements to the beginning
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != 0) {
//                 swap(arr, i, count);
//                 count++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // Example usage
//         int arr[] = { 0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
//         int n = arr.length;

//         // Call the pushZeros function
//         pushZeros(arr, n);

//         // Print the modified array
//         System.out.println(Arrays.toString(arr));
//     }
// }




// // Java code to illustrate the internal
// // working of StringBuilder
// // and StringBuffer class 
// class test
// {
//     public static void main (String[] args) {
//         // StringBuilder or StringBuffer class          
//         StringBuilder sb = new StringBuilder("dcba");
        
//         // Reversing the StringBuilder
//         sb.reverse();
//         System.out.println(sb);
        
//         // Appending to sb
//         sb.append("efg");
//         System.out.println(sb);
        
//         // Replacing the character at 1
//         // with h
//         sb.setCharAt(1, 'h');
//         System.out.println(sb);
        
//         // Delete the characters at 0, 1        
//         sb.delete(0, 2);
//         System.out.println(sb);
        
//         // Inserts "efg" at 1
//         sb.insert(1, "efg");
//         System.out.println(sb);
//     }
// }


// Pattern searching using string functions in java

// import java.util.*;
// class test{
//     static void patternsearch(String txt, String pat){

//         int pos=txt.indexOf(pat);
//         while(pos>=0){
//             System.out.print(pos+" ");
//             pos=txt.indexOf(pat, pos+1);
//         }

//     }
//     public static void main(String[] args) {
//         String txt="Geeks for Geeks";
//         String pat="Geeks";
//         patternsearch(txt, pat);
//     }
// }


// Reverse a string in java

// import java.util.Scanner;

// class test{
//     public static void main(String[] args){
//         Scanner s=new Scanner(System.in);
//         System.out.println("Enter a string");
//         String a= s.nextLine();
//         String b="";
//         int ptr=a.length()-1;
//         while(ptr>=0){
//             b=b+a.charAt(ptr);
//             ptr--;
//         }
//         System.out.println(b);
//     }
// }

// Check for palindrome

// import java.util.Scanner;

// public class test{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         String a = s.nextLine();
//         s.close();
//         boolean p = true;

//         int start = 0;
//         int end = a.length() - 1;
//         while (start < end) {
//             if (a.charAt(start) != a.charAt(end)) {
//                 p = false;
//                 break;
//             }
//             start++;
//             end--;
//         }


//         if (p) {
//             System.out.println("Yes");
//         } else {
//             System.out.println("No");
//         }
//     }
// }



// Java program to find factorial of a bitInteger

// import java.math.BigInteger;
// import java.util.Scanner;

// class test{
//     public static BigInteger f(int a){
//         BigInteger f=new BigInteger("1");
//         for(int i=2;i<=a;i++){
//             BigInteger x=BigInteger.valueOf(i);
//             f=f.multiply(x);
//         }
//         return f;

//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//          int a= sc.nextInt();
//          System.out.println(f(a));


//     }
// }


// import java.util.Scanner;

// class test {
//     public static int calculateFactorial(int n) {
//         int i = 1;
//         while (n > 0) {
//             i = i* n;
//             n--;
//         }
//         return i;
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = s.nextInt();
//         int factorial = calculateFactorial(n);
//         System.out.println("Factorial of " + n + " is: " + factorial);
//     }
// }


// class test{
//     public static int delete(int arr[], int n, int x){
//         int i;
//         for(i=0;i<n;i++){
//             if(arr[i]==x)
//             break;
//         }
//         if(i==n)
//         return n;

//         for(int j=i;j<n-1;j++){
//             arr[j]=arr[j+1];
//         }
//         return(n-1);
//     }
//     public static void main(String args[]){
//         int arr[]={5,8,12,6}, n=4, x=8;

//         System.out.println("Before Insertion");
//         for(int i=0; i<n;i++){
//             System.out.println(arr[i]+" ");
//         }
//         n=delete(arr, n, x);
//         System.out.println("After Deletion");
//         for(int i=0;i<n;i++){
//             System.out.println(arr[i]+" ");
//         }
//     }
// }



// Recursion

// class test{
//     public static int fun(int n){
//         if(n==1)
//         return 0;
//     else{
//         return 1+ fun(n/2);
//     }
//  }
//  public static void main(String args[]){
//     int n= fun(20);
//     System.out.println(n);
//  }
// }


// Recursion 2

class test{
    public static void fun(int n)
    {
        if(n==0)
        return ;

        fun(n/2);
        System.out.println(n%2);
    }
public static void main(String[] args) {

     fun(7);

}

}