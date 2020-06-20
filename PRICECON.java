import java.lang.*;
import java.util.*;

class j1 {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
            int a=s.nextInt();int k=s.nextInt();
            int[] b=new int[a];int sum1=0;int sum2=0;
            for(int i=0;i<a;i++){
                b[i]=s.nextInt();
               // sum1+=b[i];
                if(b[i]>k){
                    sum2+=b[i]-k;///System.out.println(sum2);
                }
            }
            System.out.println(sum2);


        n--;}
    }
}

