import java.util.*;
import java.lang.*;

class j4 {
public static void main(String [] args){
    Scanner s =new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0){boolean b=false;
        int n=s.nextInt();
        int[] a=new int[n]; int[] a1=new int[4];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        if(a[0]>5);
        else{
            for(int i=0;i<n;i++){
                a1[a[i]/5]++;b=true;
                if(a[i]/5==2){
                    if(a1[1]>0){a1[1]--;b=true;continue;}
                    else {b=false; break;}
                }
                if(a[i]/5==3){
                    if(a1[2]>0){b=true;a1[2]--;continue;}
                    else if(a1[1]>1){b=true;a1[1]--;continue;}
                    else {b=false; break;}
                }
            }

        }
        if(b==true)System.out.println("YES");
        else System.out.println("NO");
    }
}

}

