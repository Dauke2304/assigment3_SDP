What is the structural patterns, this is the patterns that allows us to modify, improve, change the existing code. More about 7 basic structural patterns:

The Adapter pattern allows incompatible interfaces to work together. It acts as a bridge between two objects, converting the interface of a class into another interface that a client expects. This helps in making existing classes work with others without modifying their code.

The Bridge pattern separates the abstraction from its implementation, allowing them to change independently. It decouples an interface from its implementation by placing them in different class hierarchies, making the code more flexible and easier to maintain.

The Composite pattern lets you treat individual objects and compositions of objects uniformly. It creates a tree structure of objects where leaf nodes (simple components) and composite nodes (containers of components) share a common interface, allowing you to work with them in the same way.

The Decorator pattern lets you add new behaviors or functionalities to objects dynamically. It wraps the original class with a new "decorator" class that provides additional features, making it easier to extend functionality without modifying the existing code.

The Facade pattern provides a simplified interface to a larger and more complex system. It hides the complexity by offering a single interface that interacts with multiple components, making the system easier to use.

The Flyweight pattern optimizes memory usage by sharing common parts of objects. It reduces the number of objects created by reusing existing ones when possible, using a factory to manage the shared objects.

The Proxy pattern provides a placeholder for another object. It controls access to the original object by adding extra functionality, such as lazy initialization, access control, or logging, while still keeping the same interface.
