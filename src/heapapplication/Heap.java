/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heapapplication;

/**
 *
 * @author Sifiso
 */
public class Heap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public Heap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Get parent index
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Get left child index
    private int leftChild(int index) {
        return 2 * index + 1;
    }

    // Get right child index
    private int rightChild(int index) {
        return 2 * index + 2;
    }

    // Check if heap is full
    private boolean isFull() {
        return size == capacity;
    }

    // Swap helper
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Heapify up (for insert)
    private void heapifyUp(int index) {
        int current = index;
        while (current > 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Heapify down (for extractMax or delete)
    private void heapifyDown(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        // Compare left child
        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }
        // Compare right child
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }
        // If the largest is not the current index, swap and continue heapify down
        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    /**
     * 1. Insert
     * Adds a new element to the heap and then 'heapifyUp' to maintain the max-heap property.
     */
    public void insert(int value) {
        if (isFull()) {
            throw new RuntimeException("Heap is full");
        }
        // Place the new element at the end
        heap[size] = value;
        size++;
        // Fix the heap property going upward
        heapifyUp(size - 1);
    }

    /**
     * 2. Extract Max
     * Removes and returns the root (maximum) element, then places the last element at the root
     * and calls 'heapifyDown' to restore the max-heap property.
     */
    public int extractMax() {
        if (size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        int maxValue = heap[0];
        // Move the last element to root
        heap[0] = heap[size - 1];
        size--;
        // Heapify down from the root
        heapifyDown(0);
        return maxValue;
    }

    /**
     * 3. Delete
     * Removes the element at the given index from the heap.
     * We swap the last element with the one to delete, reduce the size, and then re-heapify.
     */
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of heap range");
        }
        // Replace element to be removed with the last element
        heap[index] = heap[size - 1];
        size--;
        // Restore heap property from the index
        heapifyDown(index);
        // In some cases (if the new value is bigger than its parent), we might need to heapify up
        heapifyUp(index);
    }

    /**
     * 4. Decrease Key
     * Decreases the value at the given index, then performs heapifyDown (or potentially heapifyUp)
     * if needed to maintain the heap property.
     */
    public void decreaseKey(int index, int newValue) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of heap range");
        }
        if (newValue > heap[index]) {
            throw new IllegalArgumentException("New value is larger than current value");
        }
        heap[index] = newValue;
        // After decreasing the key, it might be smaller than children, so we might have to push it down
        heapifyDown(index);
    }

    // Utility to print heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    } 
}
