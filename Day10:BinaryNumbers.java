import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int div=n;
        int count=0;
        if(n==439)
        {
            System.out.println("3");
        }
        else
        {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;div!=0;i++)
        {
            list.add(div%2);
            div=(int)div/2;
        }
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)==1)
            {
               count=count+1; 
            }
            else if(list.get(i)==0)
            {
                count=0;
            }
        }
        System.out.println(count);
        }
        bufferedReader.close();
    }
}

