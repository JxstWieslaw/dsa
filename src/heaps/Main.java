package heaps;

import java.util.*;
import java.io.*;

public class Main {

    private int size;
    private int [] heap;
    private int maxsize;

    public Main(int maxsize){
        this.maxsize = maxsize;
        size=0;
        heap = new int[this.maxsize+1];
        heap[0]=Integer.MIN_VALUE;
    }

    public void insert(int element){
        heap[++size]=element;
    }

    public boolean isLeaf(int pos){
        if(pos<=size && pos>size/2){
            return true;
        }
        else
            return false;
    }

    public void swap(int i,int largest){
        int temp=heap[i];
        heap[i]=heap[largest];
        heap[largest]=temp;
    }
    public void buildHeap(){

        int length = (int)Math.floor(size/2.0);

        for(int i=length;i>=1;i--){
            minHeapify(heap,i);
        }

    }

    public void minHeapify(int [] heap, int i){
        int rightChild=2*i+1;
        int leftChild=2*i;

        if(isLeaf(i)){
            return;
        }
        if(rightChild<=size){
            if(heap[i]<=heap[rightChild] && heap[i]<=heap[leftChild])
                return;
        }
        else{
            if(heap[i]<=heap[leftChild])
                return;
        }

        int largest;
        if(leftChild<=size && heap[i]>heap[leftChild]){
            largest=leftChild;
        }
        else{
            largest=i;
        }

        if(rightChild<=size && heap[largest]>heap[rightChild]){
            largest=rightChild;
        }

        if(largest!=i){
            swap(i,largest);
        }
        minHeapify(heap,largest);
    }

    public void printHeap(){
        for(int i=1;i<=size;i++){
            System.out.print(heap[i]+" ");
        }

    }



    public static void main(String args[]) throws IOException {
        Scanner obj = new Scanner(System.in);
        int t=obj.nextInt();
        while(t-- >0){
            int maxsize = obj.nextInt();
            Main minHeap = new Main(maxsize);

            for(int i=1;i<=maxsize;i++)
                minHeap.insert(obj.nextInt());
            minHeap.buildHeap();
            minHeap.printHeap();
            System.out.println();
        }

    }
}
