/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noobrock123-laptop
 */
public interface maxHeapADT {
    
    public void insert(int n);
    public void removeMax();
    public void maxHeapify(int i);
    
    public int parent(int i);
    public int leftChild(int i);
    public int rightChild(int i);
}
