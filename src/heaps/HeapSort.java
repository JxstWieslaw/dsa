 package heaps;

 import java.util.Scanner;

 public class HeapSort {
     public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
             while(t-- >0){
                 int maxsize = sc.nextInt();
                 MinHeap minHeap = new MinHeap(maxsize);
                 for(int i=1;i<=maxsize;i++){
                     minHeap.insert(sc.nextInt());
                 }
                 minHeap.heapSort();
                 minHeap.printHeap();
             }
        }
     }
 }

 class MinHeap{
     int maxsize;
     int size;
     int []heap;

     MinHeap(int maxsize){
         this.maxsize = maxsize + 1;
         this.size = 0;
         heap = new int [this.maxsize];
         heap[0] = Integer.MIN_VALUE;
     }

     void insert(int element){
         heap[++size] = element;
         shiftUp(size);
     }

     void swap(int i,int parent){
         int temp = heap[i];
         heap[i] = heap[parent];
         heap[parent] = temp;
     }

     void shiftUp(int index){ // minHeapify() going upwards;
         int parent = index / 2;
         if (index > 0 && heap[parent] > heap[index]) {
             swap(index, parent);
             shiftUp(parent);
         }
     }

     void printHeap(){
         for (int i = 1; i <=size; i++) {
             System.out.print(heap[i]+ " ");
         }
         System.out.println();
     }

     void shiftDown(int[] heap, int index) { //minHeapify(); going downwards.

         int smallest = index;

         int leftChild = 2 * index;
         int rightChild = 2 * index + 1;

         if (leftChild <= size && heap[leftChild] < heap[smallest]) {
             smallest = leftChild;
         }

         if (rightChild <= size && heap[rightChild] < heap[smallest]) {
             smallest = rightChild;
         }

         if (smallest != index) {
             swap(smallest,index);
             shiftDown(heap, smallest);
         }
     }

     void heapSort(){
        int length=size;
        for(int i=size;i>=2;i--){
            swap(1,i);
            size--;
            shiftDown(heap, 1);
        }
        size=length;
    }
 }

