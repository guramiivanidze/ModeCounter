package com.company;
import java.util.Arrays;
public class Main {
    static  void  Task_5 (){
        int[] param = {1,2,3,4,5,6,7,8,8,5,54,34,3,3,3,22,23,4,4,5,3};
        Arrays.sort(param);


        int counter = 1;
        int counter_2 = 1;
        int moda = param[0];

        for (int i=1; i < param.length; i++){
            if (param[i]== param[i-1]){
                counter++;
            }else {
                if (counter>counter_2){
                    counter_2=counter;
                    moda = param[i-1];
                }
                counter=1;
            }

        }


        if (counter==counter_2){
            System.out.println("moda yvela ricxvia ");
        }else{
            if (counter>counter_2){
                counter_2=counter;
                moda = param[param.length-1];
            }
            System.out.println("task5: moda is- " + moda);
        }

    }
    public static void main(String[] args) {
        Task_5();
    }
}
