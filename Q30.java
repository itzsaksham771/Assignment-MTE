/*Concept of Linked Lists:
A linked list is a linear data structure where elements are not stored at contiguous
memory locations. Instead, each element (called a node) contains two parts:
● Data: The actual value being stored.
● Pointer (or Reference): A link to the next node in the sequence.
The first node in a linked list is called the head, and the last node's pointer
typically points to None (or NULL).
Types of Linked Lists:
● Singly Linked List: Each node points only to the next node.
● Doubly Linked List: Each node has two pointers: one to the next node and
one to the previous node. This allows for traversal in both directions.
● Circular Linked List: The last node's pointer points back to the head node,
forming a cycle.
Applications in Algorithm Design:
Linked lists are versatile and have several applications in algorithm design due to
their dynamic nature and efficient insertion/deletion at arbitrary positions:
1. Implementation of Abstract Data Types:
○ Stacks: Linked lists can be used to implement stacks (LIFO - Last-In,
First-Out) where insertion (push) and deletion (pop) occur at the head.
○ Queues: Linked lists can implement queues (FIFO - First-In, First-Out)
where insertion (enqueue) happens at the tail and deletion (dequeue)
happens at the head.
○ Hash Tables: Linked lists are often used for collision resolution in hash
tables (separate chaining). When two keys hash to the same index, a
linked list can store the colliding key-value pairs.
2. Dynamic Memory Allocation: Linked lists can efficiently manage dynamically
allocated memory. Each block of free memory can be represented as a node
in a linked list, allowing for easy allocation and deallocation.
3. Polynomial Representation: Polynomials can be represented using linked
lists where each node stores a coefficient and an exponent. This allows for 
efficient addition, subtraction, and multiplication of polynomials.
4. Undo/Redo Functionality: In text editors or other applications, a doubly
linked list can store the history of operations, allowing for easy undoing and
redoing of actions by moving backward and forward in the list.
5. Graph Representation (Adjacency List): Linked lists are commonly used in
the adjacency list representation of graphs. For each vertex, a linked list
stores its neighboring vertices.
6. Music Playlists: Linked lists are suitable for implementing music playlists
where you can easily add, remove, or rearrange songs in the sequence.
7. Operating System Tasks: Linked lists are used in operating systems for
various tasks like managing processes, memory, and files.
Advantages of Linked Lists:
● Dynamic Size: Linked lists can grow or shrink in size during runtime.
● Efficient Insertion and Deletion: Insertion and deletion of nodes at any
position can be done in O(1) time if the position is known (after traversing to
that position, which takes O(n) in the worst case for a singly linked list).
● No Memory Wastage (Potentially): Memory is allocated only when needed.
Disadvantages of Linked Lists:
● Random Access Not Efficient: Accessing an element at a specific index
takes O(n) time as you need to traverse from the head.
● Extra Memory Overhead: Each node requires extra memory to store the
pointer(s).
*/