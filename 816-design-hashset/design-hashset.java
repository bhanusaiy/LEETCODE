class MyHashSet {

    private static final int SIZE = 1000;
    private List<Integer>[] buckets;

    public MyHashSet() {
        buckets = new List[SIZE];

        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public void add(int key) {
        int index = key % SIZE;

        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(int key) {
        int index = key % SIZE;

        buckets[index].remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = key % SIZE;

        return buckets[index].contains(key);
    }
}