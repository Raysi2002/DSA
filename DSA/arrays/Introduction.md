# Arrays

Basics of Arrays in Java

An array is a collection of elements of the same type, stored in contiguous memory locations. It is a fixed-size data structure that allows efficient access to elements using an index.

1. Declaration, Initialization, and Accessing Elements

Declaration:

An array is declared by specifying the type of its elements, followed by square brackets.

### Syntax
dataType[] arrayName;

### Examples
int[] numbers;      ### Array of integers
String[] names;     ### Array of strings
double[] prices;    ### Array of doubles

Initialization:

Arrays can be initialized either at the time of declaration or later.

### Declaration and Initialization
int[] numbers = {10, 20, 30, 40}; ### Direct initialization

### Using the 'new' keyword
int[] numbers = new int[5]; ### Allocates memory for 5 elements
numbers[0] = 10;            ### Assigning values individually
numbers[1] = 20;

### For Strings
String[] fruits = new String[3];
fruits[0] = "Apple";
fruits[1] = "Banana";
fruits[2] = "Cherry";

Accessing Elements:

Elements of an array are accessed using their index (0-based).

System.out.println(numbers[0]); ### Output: 10
System.out.println(fruits[1]); ### Output: Banana

2. Multidimensional Arrays

Java supports multidimensional arrays, such as 2D or 3D arrays. These arrays are essentially arrays of arrays.

2D Arrays:

Often used for matrices or tables.

### Declaration and Initialization
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

### Accessing Elements
System.out.println(matrix[1][2]); ### Output: 6 (row 1, column 2)

### Iterating through a 2D Array
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}

3D Arrays:

Used for data with more dimensions, like coordinates or volumetric data.

### Declaration and Initialization
int[][][] cube = {
    {
        {1, 2}, {3, 4}
    },
    {
        {5, 6}, {7, 8}
    }
};

### Accessing Elements
System.out.println(cube[1][0][1]); ### Output: 6 (second block, first row, second column)

3. Arrays of Objects

Java arrays can store objects, as long as the array type matches the object’s type.

### Array of Strings
String[] cities = {"Kathmandu", "Pokhara", "Biratnagar"};

### Array of Custom Objects
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Student[] students = new Student[2];
students[0] = new Student("Aashish", 21);
students[1] = new Student("Preeti", 20);

### Accessing Objects in the Array
System.out.println(students[0].name); ### Output: Aashish

4. Memory Representation of Arrays

Key Points:

	1.	Arrays are stored in contiguous memory locations.
	2.	The index acts as an offset to locate any element in O(1) time.
	3.	Arrays in Java are objects and are stored in the heap memory.

Example:

For an array int[] arr = {10, 20, 30};:
	•	Memory representation:

Address     Value
1000        10
1004        20
1008        30

(Assuming 4 bytes per integer.)

Java-Specific Memory Details:

	•	Array objects hold a reference to the heap where elements are stored.
	•	The JVM automatically manages bounds checking. If you try to access an invalid index, an ArrayIndexOutOfBoundsException is thrown.

int[] arr = new int[3]; ### JVM allocates memory for array
arr[0] = 5;
arr[1] = 10;
arr[2] = 15;

### Accessing an invalid index
System.out.println(arr[3]); ### Throws ArrayIndexOutOfBoundsException

Common Mistakes with Arrays

	1.	Uninitialized Elements: For primitive types, default values are assigned (e.g., 0 for int). For objects, default is null.
	2.	Index Out of Bounds: Always ensure the index is within 0 to length-1.
	3.	Shallow Copy Issues: Copying object arrays directly (array1 = array2) only copies references.

Would you like practical exercises or advanced topics like dynamic arrays or memory optimizations?