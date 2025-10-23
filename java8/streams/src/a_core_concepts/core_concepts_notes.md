What is a Stream?
A Stream is a sequence of elements that can be processed in a functional style. It allows for operations such as filtering, mapping, 
and reducing to be performed on collections of data in a concise and expressive manner.

Stream pipeline structure (source → intermediate → terminal)


What is Lazy evaluation?
Lazy evaluation is a programming technique where the evaluation of an expression is delayed until its value is actually needed. 
In the context of streams, this means that intermediate operations (like filtering or mapping) are not executed until a terminal operation 
(like collecting or counting) is invoked. 
This allows for more efficient processing, as only the necessary computations are performed.



What is Internal vs external iteration?
Internal iteration is when the iteration over a collection is handled by the stream itself, 
allowing for more concise and readable code.

Stream immutability (why streams cannot be reused)?
Streams are immutable, meaning that once a stream is created, it cannot be modified. 
Any operation on a stream produces a new stream without altering the original one.