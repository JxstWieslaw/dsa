package greedy_algorithms;

import java.net.PortUnreachableException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class FractionalKnapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cap = sc.nextInt();
        float []profit = new float[n];
        float []weight = new float[n];
        Product ratio[] = new Product[n];

        for(int i=0;i<n;i++)
            weight[i]= sc.nextFloat();
        for(int i=0;i<n;i++)
            profit[i]= sc.nextFloat();
        for(int i=0;i<n;i++)
            ratio[i] = new Product(weight[i], profit[i]);
        fractionalKnapsack(ratio, cap, n);
    }

    private static void fractionalKnapsack(Product[] ratio, int cap, int n) {
        Arrays.sort(ratio, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                if(o1.profit < o2.profit)
                    return -1;
                else if(o1.profit > o2.profit)
                    return 1;
                else
                    return 0;
            }
        });

        int flag= 0;
        float totalProfit = 0;
        int i =0;
        for(i=n-1;i>=0;i--){
            float currentWt = ratio[i].wt;
            float currentPro = ratio[i].profit;

            if(cap>0 && currentWt <=cap){
                cap = (int) (cap - currentWt);
                totalProfit+=currentPro;
            }
            else{
                flag=1;
                break;
            }      
        }
        System.out.println(totalProfit); 
    }
    
}

class Product{
    float wt;
    float profit;
    float proftPerWeight;

    Product(float w, float p){
        this.wt = w;
        this.profit = p;
        this.proftPerWeight = p/w;
    }
}