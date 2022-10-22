package org.maven.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
        @Test
        public void negativeTest()
        {     
                
             int output = App.primesum(-10);
            
        //     assertEquals(76,output);
        //     if(76 == output){
                assertTrue(null, 0== output);
        //     }
            
        }
        @Test
        public void zeroTest()
        {
            long output = App.primesum(0);
        //     assertEquals(0, output);
        assertTrue(null, 0== output);
        }
        @Test
        public void positiveTest()
        {
            long output = App.primesum(20);
           // assertEquals(77, output);
            assertTrue(null, 77== output);
        }
    
}
