package stack.impl;

import stack.base.AbstractStack;

import java.util.Objects;

public class StackArrayImpl<X> implements AbstractStack<X> {

  private X[] data;
  private int top = 0;

  public StackArrayImpl(int initialCapacity) {
    this.data = (X[]) new Object[initialCapacity];
  }

  @Override
  public X pop() throws Exception {
    if (isNotEmpty())
      return data[--top];
    throw new Exception("No more elements in stack");
  }

  @Override
  public boolean push(X item) {
    if (size() == data.length) {
      X[] newData = (X[]) new Object[2 * data.length];
      System.arraycopy(data, 0, newData, 0, data.length);
      data = newData;
    }
    data[top++] = item;
    return true;
  }

  @Override
  public X peek() throws Exception {
    if (isNotEmpty())
      return data[top - 1];
    throw new Exception("No more elements in stack");
  }

  @Override
  public boolean isNotEmpty() {
    return top != 0;
  }

  @Override
  public int size() {
    return top;
  }

  @Override
  public X search(X item) throws Exception {
    while (isNotEmpty()) {
      for (int i = top - 1; i >= 0; i--) {
        if (data[i] == item)
          return item;
      }
    }
    throw new Exception("Not found");
  }

  @Override
  public boolean contains(X item) throws Exception {
    return Objects.nonNull(search(item));
  }

  @Override public void printStack() {
    for (int i = top - 1; i >= 0; i--) {
      System.out.println(data[i]);
    }
  }
}
