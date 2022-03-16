package com.practice.threads;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class PrintRandom {
    public static void main(String[] args) {
        CompletableFuture completableFuture1 = CompletableFuture.runAsync(printEvens(10));
        CompletableFuture completableFuture2 = CompletableFuture.runAsync(printOddss(10));
        /*CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(Objects.requireNonNull(printEvens(10)))
                .thenRunAsync(printOddss(10)).thenCombineAsync();
*/
    }

    static Runnable printEvens(int n) {
        if (n % 2 == 0) {
            System.out.println(n + "\n");
        }
        return null;
    }

    static Runnable printOddss(int n) {
        if (n % 2 == 1) {
            System.out.println(n + "\n");
        }
        return null;
    }
}
