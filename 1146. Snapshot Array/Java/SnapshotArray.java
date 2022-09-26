package snapshotArray;

class SnapshotArray {
    int count = 0;
    TreeMap<Integer,Integer> map[];

public SnapshotArray(int length) {
    map = new TreeMap[length];
    for(int i = 0; i< length; i++){
        map[i] = new TreeMap<Integer,Integer>();
        map[i].put(0,0);
    }
}

public void set(int index, int val) {
    map[index].put(count, val);
}

public int snap() {
    return count++;        
}

public int get(int index, int snap_id) {
    return map[index].floorEntry(snap_id).getValue();
}
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */