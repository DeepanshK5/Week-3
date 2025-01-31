package hashmapandhashfunctions.myhashmap;

public class MyHashMap {
    private static final int SIZE = 1000;  // Size of the hash map
    private Node[] map;

    // Node class to store key-value pairs
    private static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    // Constructor to initialize the map
    public MyHashMap() {
        map = new Node[SIZE];
    }

    // Hash function to get index
    private int getIndex(int key) {
        return key % SIZE;
    }

    // Add or update key-value pair
    public void put(int key, int value) {
        int index = getIndex(key);
        Node node = map[index];

        if (node == null) {
            map[index] = new Node(key, value);
        } else {
            while (node != null) {
                if (node.key == key) {
                    node.value = value;  // Update if key exists
                    return;
                }
                if (node.next == null) break;
                node = node.next;
            }
            node.next = new Node(key, value);  // Add new node if key doesn't exist
        }
    }

    // Get value for a key
    public int get(int key) {
        int index = getIndex(key);
        Node node = map[index];

        while (node != null) {
            if (node.key == key) {
                return node.value;
            }
            node = node.next;
        }
        return -1;  // Key not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = getIndex(key);
        Node node = map[index];
        Node prev = null;

        while (node != null) {
            if (node.key == key) {
                if (prev == null) {
                    map[index] = node.next;  // Remove the first node
                } else {
                    prev.next = node.next;  // Remove node by skipping it
                }
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 100);
        hashMap.put(2, 200);
        hashMap.put(3, 300);

        System.out.println(hashMap.get(1));  // Output: 100
        System.out.println(hashMap.get(2));  // Output: 200
        System.out.println(hashMap.get(3));  // Output: 300
        System.out.println(hashMap.get(4));  // Output: -1 (not found)

        hashMap.remove(2);
        System.out.println(hashMap.get(2));  // Output: -1 (not found)
    }
}
