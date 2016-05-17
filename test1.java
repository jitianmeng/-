package Triangle1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1{

	 @Test
     public void testlsTringle1(){
         Triangle1 t=new Triangle1(-1,-2,-3);
         assertFalse(t.isTriangle1(t));
     } 
	 
	 @Test
     public void testlsTringle2(){
         Triangle1 t=new Triangle1(1,1,3);
         assertFalse(t.isTriangle1(t));
     }
     

     @Test
     public void testlsTringle3(){
         Triangle1 t=new Triangle1(3,0,5);
         assertFalse(t.isTriangle1(t));
     }
    
     @Test
     public void testlsTringle4(){
         Triangle1 t=new Triangle1(9,9,11);
         assertFalse(t.isTriangle1(t));
     }
     @Test
     public void testlsTringle5(){
         Triangle1 t=new Triangle1(5,7,10);
         assertFalse(t.isTriangle1(t));
     }
    @Test
     public void testlsTringle6(){
         Triangle1 t=new Triangle1(10,10,10);
         assertFalse(t.isTriangle1(t));
     }
    
    
     
}