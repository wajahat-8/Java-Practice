package hashing;

import java.util.*;

public class HashMapCode {

    static class CustomHashMap<K, V> { // Using CustomHashMap for clarity
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // Number of key-value pairs
        private int bucketCount; // Number of buckets
        private LinkedList<Node>[] buckets; // Array of linked lists (buckets)

        @SuppressWarnings("unchecked")
        public CustomHashMap() {
            this.bucketCount = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // Hash function to calculate the bucket index for a given key
        private int computeBucketIndex(K key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % bucketCount;
        }

        // Searches for a key in the linked list at the given bucket index
        private int findKeyInBucket(K key, int bucketIndex) {
            LinkedList<Node> linkedList = buckets[bucketIndex];

            for (int i = 0; i < linkedList.size(); i++) {
                if (linkedList.get(i).key.equals(key)) {
                    return i; // Key found at index i in the linked list
                }
            }

            return -1; // Key not found
        }

        // Doubles the size of the buckets array and rehashes all keys
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            bucketCount = bucketCount * 2;
            buckets = new LinkedList[bucketCount];
            for (int i = 0; i < bucketCount; i++) {
                buckets[i] = new LinkedList<>();
            }

            // Reinsert all nodes into the new bucket array
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bucketIndex = computeBucketIndex(key);
            int keyIndexInBucket = findKeyInBucket(key, bucketIndex);

            if (keyIndexInBucket == -1) { // Key doesn't exist
                buckets[bucketIndex].add(new Node(key, value));
                size++;
            } else { // Key exists, update the value
                Node node = buckets[bucketIndex].get(keyIndexInBucket);
                node.value = value;
            }

            // Calculate the load factor (lambda)
            double loadFactor = (double) size / bucketCount;

            if (loadFactor > 2.0) { // Rehash if load factor exceeds 2.0
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bucketIndex = computeBucketIndex(key);
            int keyIndexInBucket = findKeyInBucket(key, bucketIndex);

            return keyIndexInBucket != -1; // Return true if key exists, false otherwise
        }

        public V remove(K key) {
            int bucketIndex = computeBucketIndex(key);
            int keyIndexInBucket = findKeyInBucket(key, bucketIndex);

            if (keyIndexInBucket == -1) { // Key doesn't exist
                return null;
            } else { // Key exists, remove the node and return its value
                Node removedNode = buckets[bucketIndex].remove(keyIndexInBucket);
                size--;
                return removedNode.value;
            }
        }

        public V get(K key) {
            int bucketIndex = computeBucketIndex(key);
            int keyIndexInBucket = findKeyInBucket(key, bucketIndex);

            if (keyIndexInBucket == -1) { // Key doesn't exist
                return null;
            } else { // Key exists, return its value
                Node node = buckets[bucketIndex].get(keyIndexInBucket);
                return node.value;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (LinkedList<Node> bucket : buckets) {
                for (Node node : bucket) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 50);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("India");
        System.out.println(map.get("India")); // Should print null since "India" is removed
    }
}
