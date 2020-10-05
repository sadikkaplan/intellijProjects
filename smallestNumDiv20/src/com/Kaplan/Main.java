package com.Kaplan;

public class Main {

    public static void main(String[] args) {
        int top1=0,top2=0;
        int topKare=0;
        for(int i=1;i<=100;i++){
            top1+=i*i;
        }
        for (int i=1;i<=100;i++){
            top2+=i;
        }
        topKare=top2*top2;

        System.out.println(topKare-top1);
    }
}
