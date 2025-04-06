<!DOCTYPE html>
<html>
<head>
    README - Heap Application
</head>
<body>
    <h1>Heap Application</h1>
    <p>A Java implementation of a Max Heap data structure.</p>
    
   <h2>📌 Features</h2>
    <ul>
        <li>Implements a Max Heap using an array.</li>
        <li>Supports operations: <code>insert()</code>, <code>extractMax()</code>, <code>heapifyUp()</code>, and <code>heapifyDown()</code>.</li>
        <li>Efficient <strong>O(log n)</strong> time complexity for insertion and deletion.</li>
    </ul>
    
   <h2>📂 Project Structure</h2>
    <pre>
    HeapApplication/
    ├── src/
    │   ├── Heap.java
    │   ├── Main.java
    ├── README.html
    └── .gitignore
    </pre>
    
   <h2>⚡ Usage</h2>
    <p>Clone the repository and run the Java program:</p>
      <pre>
      git clone https://github.com/chisa-sifisoHeapApplication.git
      cd HeapApplication/src
      javac Main.java
      java Main
      </pre>
      
   <h2>📜 Code Example</h2>
    <pre>
    Heap heap = new Heap(10);
    heap.insert(50);
    heap.insert(30);
    heap.insert(20);
    heap.insert(15);
    heap.insert(10);
    heap.printHeap();
    </pre>
   <h3>Developed :by Sifiso Vinjwa</h3>
    
  <h2>🔗 License</h2>
    <p>This project is licensed under the MIT License.</p>
</body>
</html>
