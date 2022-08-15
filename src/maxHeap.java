/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noobrock123-laptop
 */
public class maxHeap implements maxHeapADT {
    
    private int[] arr = new int[10];
    
    public void showArr(){
        if (arr.length == 0) {
            System.out.println("This array is empty!");
        }
        else {
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println("");
        }
    }
    
    @Override
    public void insert(int n) {
        if (arr.length == 0) {
            arr[0] = n;
        }
        else {
            int p = arr.length + 1;
            while (p != 0 && arr[parent(p)] < n) {
                arr[p] = arr[parent(p)];
                p = parent(p);
            }
            arr[p] = n;
        }
        System.out.println("Inserted " + n);
    }
    
    @Override
    public void removeMax(){
        if (arr.length < 1) {
            System.err.println("Heap is empty!");
        }
        else {
            System.out.println(arr[0] + " has been removed");
            arr[0] = arr[arr.length - 1];
            System.out.println("Max heapifying...");
            maxHeapify(0);
        }
    }
    
    @Override
    public void maxHeapify(int i){
        int l = leftChild(arr.length);
        int r = rightChild(arr.length);
        int largest;
        if (l < arr.length && arr[l] > arr[i]) {
            largest = l;
        }
        else { largest = i;}
        if (r < arr.length && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(largest);
        }
    }
    
    @Override
    public int parent(int i){
        return (i - 1) / 2;
    }
    @Override
    public int leftChild(int i) {
        return (i * 2) + 1;
    }
    @Override
    public int rightChild(int i) {
        return (i * 2) + 2;
    }
    
}
