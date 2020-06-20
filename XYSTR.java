import java.lang.*;
import java.util.*;

class J2_1 {

    public static  void main(String [] args){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();s.nextLine();
        while(t-->0){
            String x=s.nextLine();
            char[] c;
            c=x.toCharArray();int cp=0;
            if(x.length()==1)System.out.println(0);
            else{
            for(int i=0;i<x.length()-1;i++){
                if(i==0){
                    if(c[i]!=c[i+1]){cp++;i++;}
                    //else {if(c[i]==c[i+1]){i++;}}
                }
                else if(c[i]!=c[i+1]){i++;cp++;}
            } System.out.println(cp);}
            //s.nextLine();
            /*int x1=x.length();int c=0;
            for(int i=0;i<x1;i++){
                if(x.charAt(i)=='x'){
                    if(x.charAt(i+1)=='y'){c++;
                    i=i+2;}
                }
                else{if(x.charAt(i)=='y'){
                    if(x.charAt(i+1)=='x'){c++;
                    i=i+2;}else i++;
                }}

            }*/
       }
    }

}

