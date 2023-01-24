
package javaapplication39;

public class JavaApplication39 {




   static void mymethod(){
        int i=0;
        while(i<10){
        
        
            System.out.println(i);
        
        
            i++;
            if(i==4){
                break;
            }
        }
    }
    
     static void myMethod1(){
         for(int i=0;i<10;i++){
             if(i==4){
                 continue;
             }
           
          System.out.println(i);
         }
     }
     static void mymethod2(){
         first:
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 if(i==1){
                     continue first;
                 }
                 System.out. println("[i="+i+",j="+j+"]");
             }
         }
         System.out.println();
         second:
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 if(i==1)
                     break second;
             }
          System.out.println("[i="+ i +",j="+ j +"]");
             }
     }
                 

      public static void main(String[] args) {
        int x=20;
        int y=5;
        if(x>y){
         System.out.println("x is greater than y");
        }
        {
         if(x<15){
          System.out.println("true");
         }
         else{
             System.out.println("false");
         }
         mymethod();
         myMethod1();
         mymethod2();
        }
              }
}


              



   
    

