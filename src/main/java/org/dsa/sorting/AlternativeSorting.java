package org.dsa.sorting;
import java.util.Arrays;
public class AlternativeSorting {

        static int[] sort(int[]  input){

            Arrays.sort(input);
            int l=0;
            int len= input.length;
            int max=len-1;
            int i=0;
            int[] res= new int[len];
            while(max>=l)
            {
                if(max==l)
                {
                    res[i]=input[max];
                    break;
                }
                else{
                    res[i]=input[max];
                    res[i+1]=input[l];
                    l++;
                    max--;
                    i+=2;
                }
            }


            return res;

        }

        public static void main(String[] a)
        {
            int[] input= {7, 1, 2, 3, 4, 5, 6};
            int[] res= sort(input);
            for(int i:res)
                System.out.print(i);
        }

}
