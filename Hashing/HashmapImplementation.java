package Hashing;
import java.util.*;

public class HashmapImplementation {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // number of key-value pairs
        private LinkedList<Node>[] buckets; // array of buckets

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.buckets = new LinkedList[4];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            this.size = 0;
        }

        private int hashFunction(K key) {
            int hashCode = key.hashCode();
            return Math.abs(hashCode) % buckets.length;
        }

        private int searchInLL(K key, int bucketIndex) {
            LinkedList<Node> ll = buckets[bucketIndex];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                buckets[bi].get(di).value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                size++;
            }

            double lambda = (double) size / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            buckets = new LinkedList[oldBuckets.length * 2];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            size = 0;
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                size--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value;
            } else {
                return null;
            }
        }

        public V getOrDefault(K key, V defaultValue) {
            V val = get(key);
            return val != null ? val : defaultValue;
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

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + hm.get(key));
        }
    }
}