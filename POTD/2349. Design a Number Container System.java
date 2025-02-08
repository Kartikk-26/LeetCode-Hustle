//Date : 08.02.2025                        
//Porblem Statement Number & Topic : 2349. Design a Number Container System

import java.util.NoSuchElementException;

class NumberContainers {
    Map<Integer, Integer> map; // Stores the number at each index
    Map<Integer, TreeSet<Integer>> valIdx; // Maps each number to a sorted set of indices

    // Constructor to initialize the maps
    public NumberContainers() {
        map = new HashMap<>();
        valIdx = new HashMap<>();
    }

    // Method to change the number at a given index
    public void change(int index, int number) {
        // If the number is not in valIdx, initialize it with an empty sorted set
        if (!valIdx.containsKey(number)) {
            valIdx.put(number, new TreeSet<>());
        }

        // If the index already has a number, update the frequency map
        if (map.containsKey(index)) {
            if(map.get(index)==number) return;
            int prevVal = map.get(index);
            valIdx.get(prevVal).remove(index); // Remove the index from the sorted set of the previous number
        }

        // Add the index to the sorted set of the new number
        valIdx.get(number).add(index);
        // Update the map with the new number at the given index
        map.put(index, number);
    }

    // Method to find the smallest index for a given number
    public int find(int number) {
        // If the number is in valIdx, return the smallest index from the sorted set
        if (valIdx.containsKey(number)) {
            try {
                return valIdx.get(number).first();
            } catch (NoSuchElementException e) {
                return -1;
            }
        }
        // If the number is not found, return -1
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */