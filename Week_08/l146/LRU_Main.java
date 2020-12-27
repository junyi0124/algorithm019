package l146;

public class LRU_Main {
    public static void main(String[] args) {
        LRUCache obj = new LRUCache(6);
        obj.put(111,111);
        int param_1 = obj.get(111);
    }
}
