// Concept of Priority Queues:
// A priority queue is an abstract data type similar to a regular queue, but with an
// added feature: each element has an associated priority. While a regular queue
// follows the First-In, First-Out (FIFO) principle, a priority queue dequeues elements
// based on their priority.
// Key properties:
// ● Elements are associated with a priority (usually a numerical value).
// ● The element with the highest priority (or lowest, depending on the
// implementation) is always at the front of the queue.
// ● Elements with the same priority are typically dequeued in FIFO order.
// Common implementations:
// ● Heap: Binary heap (min-heap or max-heap) is the most common and efficient
// implementation.
// ● Sorted Array: Simple but less efficient for insertion and deletion.
// ● Linked List: Can be used, but less efficient than heaps.
// Applications in Algorithm Design:
// Priority queues are used in various algorithms and applications:
// 1. Scheduling:
// Job Scheduling: Processes with higher priority are executed before
// lower-priority ones.
// ○ Task Scheduling: Tasks in an operating system or real-time system can
// be scheduled based on their importance.
// 2. Graph Algorithms:
// ○ Dijkstra's Algorithm: Finding the shortest path in a graph. A min-priority
// queue is used to select the vertex with the smallest distance.
// ○ Prim's Algorithm: Finding the minimum spanning tree in a graph. A minpriority queue is used to select the edge with the smallest weight.
// 3. Data Compression:
// ○ Huffman Coding: Building a Huffman tree for data compression. A minpriority queue is used to repeatedly merge the nodes with the smallest
// frequencies.
// 4. Event-Driven Simulation: Processing events in order of their occurrence
// time.
// 5. Heap Sort: An efficient sorting algorithm that uses a heap.
// 6. Bandwidth Management: Prioritizing network traffic based on the type of
// data.
// 7. Best-First Search: In artificial intelligence, priority queues are used in search
// algorithms like A* search.