package stack.base;

public interface AbstractStack<X> {
  public X pop() throws Exception;

  boolean push(X item);

  public X peek() throws Exception;

  public boolean isNotEmpty();

  public int size();

  public X search(X item) throws Exception;

  public boolean contains(X item) throws Exception;

  public void printStack();
}
