package heaps;

import java.util.Scanner;

public class HeapDecrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int maxsize = sc.nextInt();
            MinHeap minHeap = new MinHeap(maxsize);
            for(int i=1;i<=maxsize;i++){
                minHeap.insert(sc.nextInt());
            }            
        }
        
        

    }
}

class MinHeap{
   int maxsize;
   int size;
   int []heap;
   
   MinHeap(int maxsize){
       this.maxsize = maxsize;
       this.size = 0;
       heap = new int [maxsize + 1];
       heap[0] = Integer.MIN_VALUE;
   }

   void insert(int element){
       heap[++size] = element;
   }

   void swap(){

   }

   void minHeapify(){

   }
   
   void buildHeap(){

   }

   void shiftDown(){

   }

    void shiftUp(int index){
        int parent = index / 2;
        if (index > 0 && heap[parent] > heap[index]) {
            int t = heap[index];
            heap[index] = heap[parent];
            heap[parent] = t;
            shiftUp(parent);
        }
    }
    void printHeap(){
        for (int i = 1; i <=maxsize; i++) {
            System.out.println(heap[i]+ " ");
          }
    }

    void decreaseKey(int key){
        if (key < 1 || key >= heap.length - 1) {
            return;
        }
        heap[key] = Integer.MIN_VALUE;
        shiftUp(key);
        extractMin();
    }

    private void extractMin() {
        heap[1] = heap[size];
        size--;
        shiftDown(heap, 1);
    }

    private void shiftDown(int[] heap, int index) {

        int smallest = index;
        
        int leftChild = 2 * index;
        int rightChild = 2 * index + 1;
        
        if (leftChild < size && heap[leftChild] < heap[smallest]) {
        smallest = leftChild;
        }
        
        if (rightChild < size && heap[rightChild] < heap[smallest]) {
        smallest = rightChild;
        }
        
        if (smallest != index) {
        int t = heap[index];
        heap[index] = heap[smallest];
        heap[smallest] = t;
        shiftDown(heap, smallest);
        }
    }  
}
