package org.maven.java;
import java.*;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App  
{  
 
  
    public static void main(String[] args) {
        System.out.println(primesum(-10));
    }

    static int primesum(int n) {
        int sum = 0, num;
    
        //insert your code here
        if(n<=0)
        {
            sum=0;
        }
        
        else{
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
    
        for (int p = 2; p * p <= n; p++) {
          if (isPrime[p]) {
            for (int i = p * p; i <= n; i += p)
              isPrime[i] = false;
          }
        }
    
    
    
        for(int i = 2; i < isPrime.length; i++) {
          if(isPrime[i]) {
            sum += i;
          }
        }

    }
        return sum;
    }
} 
