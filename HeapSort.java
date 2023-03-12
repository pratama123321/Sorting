package Github.Sorting;

import java.util.Arrays;

public class HeapSort {
    private int arrayCapacity = 10;
    private int[] data = new int[arrayCapacity];
    private int size = 0;

    private int getLeftIndex(int parentIndex) { return (parentIndex * 2) + 1; }
    private int getRightIndex(int parentIndex) { return (parentIndex * 2) + 2; }
    private int getParentIndex(int childIndex) { return (childIndex - 1) / 2; }

    private int left(int index) {  return this.data[getLeftIndex(index)]; }
    private int right(int index) {  return this.data[getRightIndex(index)]; }
    private int parent(int index) {  return this.data[getParentIndex(index)]; }

    private boolean hasLeft(int index) { return getLeftIndex(index) < size; }
    private boolean hasRight(int index) { return getRightIndex(index) < size; }
    
    public void add(int[] array) {
        // Adding new element to heap
        for(var index = 0; index < array.length; index++) {
            add(array[index]);
        }
    }

    public void add(int value) {
        // Adding new element to heap
        ensureCapacity();
        this.data[size] = value;
        size++;
        heapifyUp();
    }

    public int[] sort() {
        // Sorting
        for(var index = size - 1; index > 0; index--) {
            pool(index);
        }
        return this.data;
    }

    private void pool(int index) {
        swap(0, index);
        size--;
        heapifyDown();
    }
    
    private void ensureCapacity() {
        if(size >= arrayCapacity) {
            arrayCapacity *= 2;
            this.data = Arrays.copyOf(this.data, arrayCapacity);
        }
    }

    private void heapifyUp() {
        int index = size - 1;
        while(parent(index) < this.data[index]) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while(hasLeft(index)) {
            int biggest = getLeftIndex(index);
            if(right(index) > left(index) && hasRight(index)) {
                biggest = getRightIndex(index);
            }
            if(this.data[index] > this.data[biggest] || biggest == size) {
                break;
            } else {
                swap(index, biggest);
            }
            index = biggest;
        }
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = this.data[indexOne];
        this.data[indexOne] = this.data[indexTwo];
        this.data[indexTwo] = temp;
    }
}
