    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapapplication;

/**
 *
 * @author Sifiso
 */
public class HeapApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heap maxHeap = new Heap(10);

        System.out.println("Inserting elements: 20, 15, 30, 5, 60");
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(30);
        maxHeap.insert(5);
        maxHeap.insert(60);
        System.out.print("Current Heap: ");
        maxHeap.printHeap();

        System.out.println("\nExtracting max:");
        int maxElement = maxHeap.extractMax();
        System.out.println("Max extracted: " + maxElement);
        System.out.print("Heap after extractMax: ");
        maxHeap.printHeap();

        System.out.println("\nDeleting element at index 1 (zero-based):");
        maxHeap.delete(1);
        System.out.print("Heap after deletion: ");
        maxHeap.printHeap();

        System.out.println("\nDecreasing key of element at index 1 to 2:");
        maxHeap.decreaseKey(1, 2);
        System.out.print("Heap after decreaseKey: ");
        maxHeap.printHeap();
    }
    
}
