package com.practice.crisil.ing;

public class NthPrime {
    //2,3,5,7,11,13,17,19......................
    public static void main(String[] args) {
        System.out.println(findNthPrime(0));
        System.out.println("====================");
        System.out.println(findNthPrime(1));
        System.out.println("====================");
        System.out.println(findNthPrime(2));
        System.out.println("====================");
        System.out.println(findNthPrime(4));
        System.out.println("====================");
        System.out.println(findNthPrime(6));
        System.out.println("====================");
        System.out.println(findNthPrime(10));
    }

    static int findNthPrime(int N) {
        int limit = Integer.MAX_VALUE;
        int counter = 0;
        for (int i = 2; i < limit; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                counter++;
            }
            if (counter == N) {
                return i;
            }
        }
        return -1;
    }

    static boolean isPrime(int n) {
        int counter = 0;
        int start = 1;
        while (start <= n) {
            if (n % start == 0) {
                counter++;
            }
            start++;
        }
        if (counter == 2) {
            return true;
        } else {
            return false;
        }
    }


}
