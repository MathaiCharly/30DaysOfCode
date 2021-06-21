import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String S;
        String Sev;
        String Sod;
        for(int i=1;i<=n;i++)
        {
          S=sc.next();
          Sev="";
          Sod="";
          int l=S.length();
          for(int j=0;j<l;j=j+2)
          {
              Sev=Sev+S.charAt(j);
              if(j==l-1)
              {
                  break;
              }
              Sod=Sod+S.charAt(j+1);
          }
          System.out.println(Sev+" "+Sod); 
        }
    }
}
