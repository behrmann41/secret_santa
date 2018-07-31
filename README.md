# Secret Santa - Java Edition!

Enter an even number of names and run to see the results of this year's Secret Santa!

### **Steps to Run**

1. Compile program

    `javac src/*.java -d build`

2. Run program

    `java -cp build Main [space-separated list of names]`

    Example: `java -cp build Main Tom, Bob, Jill, Louise, Hunter, Jeff`

### **Steps to Test**

1. Compile tests

    `javac -cp test/vendor/*:src test/*.java -d build`

2. Run tests

    `java -cp test/vendor/*:build TestRunner`