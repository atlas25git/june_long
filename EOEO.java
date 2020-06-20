import java.lang.*;
import java.math.BigInteger;
import java.util.*;

class ts {
    public static void main(String []args){Scanner s= new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0) {

        BigInteger ts = s.nextBigInteger();
        BigInteger c = new BigInteger("0");
        BigInteger x = ts;
        int r = 0;
        BigInteger x1 = new BigInteger("0");
        BigInteger x2 = new BigInteger("1");
        BigInteger c1 = new BigInteger("2");
        BigInteger y = ts.mod(c1);
        int r1 = y.intValue();
        if(ts.intValue()==0);
        else if (ts.intValue()==1){
            r = 0;
            //System.out.print("exec1");
        } else if (r1 != 0) {
            c = ts.divide(c1);
            r = c.intValue();
            //System.out.print("exec2");
        } else {
            //System.out.print("exec3");
            while (x.mod(c1).intValue() == 0)
            {
                x1=x1.add(x2);
                x=x.divide(c1);
            }
            //System.out.println("************"+x1);
            int u = x1.intValue();
            BigInteger x3 = c1.pow(u + 1);//System.out.print(x3);
            //BigInteger.valueOf(Math.pow(2,(double)x1.add(x2)));
            //if(x2<ts)c++;
            //System.out.println("************"+x2);
            c = ts.divide(x3);//System.out.print(c);
            //for(int i=1;(x2*i)<ts;i++){
            //   c++;
            //}
        }

        //System.out.println(x1);
        System.out.println(c);


    }}}

