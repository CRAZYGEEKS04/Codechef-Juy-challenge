package hackerRank;

import java.util.*;

public class Euler1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       // trick for O(n) fastest algorithms
        // 1. list of numbers divided  by 3 = [2,6,9,12,15.......3*n]
        // take 3 common out of all the = 3[,2,3,45....n]
        //2. List of numbers divided by 5 = [5 ,10 ,15 ,20 ,25 ....5*n]
        //take 5 common out of all the = 5[,2,3,45....n]


       for(int i = 1; i<=num ; i++){
            int n = sc.nextInt();
            int n3 = (n-1)/3;  //for getting the last element that will be divisibe by 3 is
            int n5 = (n-1)/5;   //for getting the last element that will be divisibe by 5 is
            int n15 = (n-1 )/15;
            int val3 =3*(n3 * (n3+1))/2;
            int val5 = 5*(n5 * (n5+1))/2;
            int val15 = 15*(n15 * (n15+1))/2;
            System.out.println(val3 + val5 -val15);//total value

         n--;

        }
    }
}
// =======================MY APPROACH ==========================
//            long sum3 = 0;
//            long sum5 =0;
//            int num = sc.nextInt();
//            for(int i = 0 ; i< num ; i++){
//                if(i % 3 == 0){
//                    sum3 += i;
//
//                }
//                else if(i%5 == 0){
//                    sum5 += i;
//                }
//            }
//            System.out.println(sum3 + sum5);

