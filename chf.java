//created by Whiplash99
import java.io.*;
import java.util.*;
class chf
{
	static class Hashing
	{
	    long[] hash,pow;
	    long P, MOD;
	    int N;

	    Hashing(char str[], long P, long MOD)
	    {
	        this.N=str.length;this.P=P;this.MOD=MOD;
	        hash=new long[N+1];pow=new long[N+1];
	        init(str);
	    }
	    void init(char str[])
	    {
	        pow[0]=1;
	        for(int i=N-1;i>=0;i--)
	        {
	            hash[i]=((hash[i+1]*P)%MOD+(str[i]-'a'+1))%MOD;
	            pow[N-i]=(pow[N-i-1]*P)%MOD;
	        }
	        pow[N]=(pow[N-1]*P)%MOD;
	    }
	    long getHash(){return getHash(0,N-1);}
	    long getHash(int l, int r){return (MOD-(hash[r+1]*pow[r-l+1])%MOD+hash[l])%MOD;}
	}
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	    int i,N;

	    int T=Integer.parseInt(br.readLine().trim());
	    StringBuilder sb=new StringBuilder();

	    while(T-->0)
	    {
	        char str[]=br.readLine().trim().toCharArray();
	        Hashing hash=new Hashing(str,31,(int)(1e9+7)); //compute rolling-hash

	        int count=0; N=str.length;
	        for(i=2;i<=N-2;i+=2)
	        {
	            int l1=0,r1=i/2-1; //Part-1
	            int l2=r1+1,r2=i-1; //Part-2
	            int l3=i,r3=(i+N)/2-1; //Part-3
	            int l4=r3+1,r4=N-1; //Part-4

	            //Check if Part-1=Part2 and if Part-3=Part-4
	            boolean C1=hash.getHash(l1,r1)==hash.getHash(l2,r2);
	            boolean C2=hash.getHash(l3,r3)==hash.getHash(l4,r4);

	            if(C1&&C2) count++;
	        }
	        sb.append(count).append("\n");
	    }
	    System.out.println(sb);
	}
}