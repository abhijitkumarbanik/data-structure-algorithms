package hashtable.v2;

import java.util.Objects;

public class BasicHashTable<X, Y> {

  private HashTableEntry[] entry;
  private int size;
  private int capacity;

  public BasicHashTable(int capacity) {
    this.entry = new HashTableEntry[capacity];
    this.size = 0;
    this.capacity = capacity;
  }

  public int getSize() {
    return this.size;
  }

  public Y get(X key) {
    int hashValue = hashFunction(key);
    if (Objects.isNull(hashValue)) {
      return null;
    }
    return (Y) entry[hashValue].getValue();
  }

  public void put(X key, Y value) {
    //if(getSize()+1> capacity)
    //
    int hashValue = hashFunction(key);
    entry[hashValue] = new HashTableEntry<>(key, value);
    size++;
  }

  public Y remove(X key) {
    Y value = get(key);
    if (Objects.nonNull(value)) {
      int hashValue = hashFunction(key);
      entry[hashValue] = null;
      size--;
      reHashing(hashValue);
    }
    return value;
  }

  private void reHashing(int hashValue) {
    hashValue = hashValue + 1 % this.capacity;
    while (Objects.nonNull(entry[hashValue])) {
      HashTableEntry<X, Y> hashTableEntry = entry[hashValue];
      entry[hashValue] = null;
      this.put((X) hashTableEntry.getKey(), (Y) hashTableEntry.getValue());
      size--;
      hashValue = hashValue + 1 % this.capacity;
    }
  }

  private int hashFunction(X key) {
    int hashValue = key.hashCode() % this.capacity;
    while (entry[hashValue] != null && !entry[hashValue].getKey().equals(key)) {
      hashValue = (hashValue + 1) % this.capacity;
    }
    return hashValue;
  }

  public boolean hasValue(X key) {
    return Objects.nonNull(get(key));
  }

  public boolean hasKey(X value) {
    for (int i=0; i<= size; i++) {
      if (entry[i].getValue().equals(value))
          return true;
    }
    return false;
  }

  private static class HashTableEntry<X, Y> {
    private X key;
    private Y value;

    public HashTableEntry(X key, Y value) {
      this.key = key;
      this.value = value;
    }

    public X getKey() {
      return key;
    }

    public void setKey(X key) {
      this.key = key;
    }

    public Y getValue() {
      return value;
    }

    public void setValue(Y value) {
      this.value = value;
    }

  }

}



