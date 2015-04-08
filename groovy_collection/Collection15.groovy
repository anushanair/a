class Stack
{
  Object[] o=[1,2,3,4,5];
  void push(Object x)
  {
    
  }
  void pop()
  {
    println o.last();
    o.dropRight(1);
  }
  Object top()
  {
     return o.last();
  }
}
def obj=new Stack();
println obj.o
println obj.top()
obj.pop()
println obj.o