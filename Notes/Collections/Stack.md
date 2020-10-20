# Stack Class

* Stack is implememted using Doubly linked list in Java.
* In Java collection framework, the *class Vector* is a legacy class
* *Stack* is a subclass of the *class Vector*
* It implements a standard last-in, first-out (LIFO) datastructure called stack.


|          Methods            |                     Description                                       |
|:---------------------------:|:---------------------------------------------------------------------:|
|boolean empty( )|Returns **true** if the stack is empty, and returns **false** if the stack contains elements|
|E peek( )  |Returns the element on the top of the stack, but does not remove it|
|E pop()    |Returns the element on the top of the stack, removing it in the process|
|E push(E element)    |Pushes element onto the stack. element is also returned|
|int search(Object element)|Searches for element in the stack. If found, its offset from the top of the stack is returned. Otherwise, -1 is returned|

**Note:** The methods which are availab;e for the *Vector* class is also avaolable to the *Stack* class, in addition, it has its own methods.
