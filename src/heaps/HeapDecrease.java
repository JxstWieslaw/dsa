 package heaps;

 import java.util.Scanner;

 public class HeapDecrease {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-- >0){
             int maxsize = sc.nextInt();
             int key = sc.nextInt();
             MinHeap minHeap = new MinHeap(maxsize);
             for(int i=1;i<=maxsize;i++){
                 minHeap.insert(sc.nextInt());
             }
             minHeap.decreaseKey(key);
             minHeap.printHeap();
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

     private void extractMin() {
         heap[1] = heap[size];
         size--;
         shiftDown(heap, 1);
     }

     void decreaseKey(int key){
         if (key < 1 || key >= heap.length - 1) {
             return;
         }
         heap[key] = Integer.MIN_VALUE;
         shiftUp(key);
         extractMin();
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
 }

