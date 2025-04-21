# Pseudo Sorting Algorithm - Java

## Overview

This Java project implements a simplified, non-traditional array transformation that replaces all elements in an integer array with the average of its elements. While named to resemble a sorting algorithm, it intentionally performs no actual sorting. The primary objective of this project is to demonstrate array traversal, value transformation, and clean Java coding practices using Allman brace style.

## Purpose

This project serves as a foundational example for:

- Practicing control structures in Java
- Working with arrays and value aggregation
- Writing clear and maintainable code using best practices
- Demonstrating clean formatting and commenting using Allman style

It is particularly useful for beginners seeking to understand array manipulation and core Java syntax.

## Functionality

The main class, `Solutions.java`, performs the following steps:

1. Initializes an integer array.
2. Computes the sum of all elements.
3. Calculates the average (using integer division).
4. Replaces every element in the array with the average value.
5. Outputs the array before and after processing.

## Example

Input:
```
[2, 31, 13, 15, 7, 11]
```

Output:
```
[13, 13, 13, 13, 13, 13]
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command-line interface or Java IDE (e.g., IntelliJ IDEA, Eclipse)

### Compiling and Running

1. Clone the repository or download the source code.

2. Compile the program:
   ```bash
   javac Solutions.java
   ```

3. Run the program:
   ```bash
   java Solutions
   ```

The output will display the contents of the array before and after the transformation.

## Project Structure

```
pseudo-sorting-algorithm-java/
│
├── Solutions.java   // Contains the main method and averaging logic
└── README.md        // Project documentation
```

## Code Style and Documentation

- Allman brace style is used throughout the code for clarity and consistency.
- JavaDoc comments are included for all public methods.
- Internal logic is documented with clear, concise inline comments.

## Disclaimer

This implementation is not a sorting algorithm in the traditional sense. The project name reflects its illustrative and non-standard behavior for teaching and exploration purposes.
```
