//package heaps;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ChefAndMinimumColoringCodeChef {
//    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
//        int t = obj.nextInt();
//        while(t-->0){
//            int n=obj.nextInt();
//            int m=obj.nextInt(); //maxsize of heap , also number of colors/combinations
//            int []arr= new int[n];
//            Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
//            Map<Integer, Boolean> colorMap = new HashMap<Integer, Boolean>();
//            ArrayList <Pair <String,Integer> > l =
//                    new ArrayList <Pair <String,Integer> > ();
//            int j=0;
//            for(int i=0; i<n;i++){
//                arr[i]=obj.nextInt();
//                colorMap.put(i,j);
//            }
//            Arrays.sort(arr);
//            int minDifference = Integer.MAX_VALUE;
//            MinHeapCAMC minHeap = new MinHeapCAMC(m);
//            for(int i=0;i<n;i++){
//                //if it is a unique coloring index do insert
////                if()
//                //if it is not a unique index do deleteKey
//                minHeap.insert(arr[i]);
//            }
//        }
//
//    }
//}
//
//class MinHeapCAMC{
//    private int size;
//    private int[] heap;
//    private int maxsize;
//
//    public MinHeapCAMC(int maxsize){
//        this.maxsize= maxsize;
//        size=0;
//        heap = new int[maxsize];
//    }
//
//    public void minHeapify(){
//
//    }
//    public void deleteKey(int index){
//
//    }
//    public void remove(){
//
//    }
//    public void extractMinValue(){
//
//    }
//
//    public void insert(int element) {
//
//        heap[++size] = element;
//
//    }
//}
//// User defined Pair class
//class Pair {
//    int x;
//    int y;
//
//    // Constructor
//    public Pair(int x, int y)
//    {
//        this.x = x;
//        this.y = y;
//    }
//}
