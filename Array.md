<h1><center>Array</center></h1>

- Elements of an array are located in a contiguous.
- Array can store data of specified type.
- Each element of an array has a unique index.
- The size of an array is predefined and cannot be modified.

### when we create an array ,

1- **Declare**: create a reference to array.

2- **Instantiation of an array**: create an array

3- **Initialization**:Assigns values to cells in array.
> Syntax of creationg an array in java

- dataType[] arr; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; --> Declaration
- arr = new dataType[5] &nbsp; &nbsp; --> instantiation
- arr[1]=3; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; -->initialization

#### Example:

- int[] numbers = new int[4];
- String[] names = {"Ali","Reza"};
- int numbers[] = new int[];

| Operation                      | Time complexity | Space complexity |
|--------------------------------|-----------------|------------------|
| Creating an array              | O(1)            | O(n)             |
| Inserting a value <br/>in array | O(1)            | O(1)             |
| Traversing a given array       | O(n)            | O(1)             |
| Accessing a given cell         | O(1)            | O(1)             |
| Searching a given value        | O(n)            | O(1)             |
| Deleting a given value         | O(n)            | O(1)             |
