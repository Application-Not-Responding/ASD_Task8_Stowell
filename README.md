# ASD_Task8_Stowell

To reiterate:

##Problem A (KWIC) 
is implemented using Method 1 (Abstract Data Types), where I've created classes representing the data structures (Line, CircularShift), and a class (KWICSystem) to coordinate the processing of the data.


##Problem B (Eight Queens) 
is implemented using Method 2 (Main/Subroutine with Stepwise Refinement). The code is organized with the main algorithm (solveQueens) and the chessboard representation (int[][] board).


###Method 1: Abstract Data Types for Problem A (KWIC)

*Line*: This class represents a line of text from the input. It should have methods to extract and manipulate words.
*CircularShift*: This class takes a Line object and generates all circular shifts of the line.
*Alphabetizer*: This class takes circular shifts and arranges them in alphabetical order.
*KWICSystem*: This class coordinates the execution of the KWIC system, taking input lines, performing circular shifts, alphabetizing, and providing access to the results.


###Method 2: Main/Subroutine with Stepwise Refinement for Problem B (Eight Queens)

*Board*: This class represents the chessboard and contains methods to place and remove queens.
*QueenSolver*: This class contains the main algorithm to solve the Eight Queens problem, using recursive backtracking and ensuring no two queens threaten each other.

| Criteria                           |              Problem A (KWIC) - Method 1               | Problem B (Eight Queens) - Method 2 -          |
|------------------------------------|:------------------------------------------------------:|------------------------------------------------|
| a) Change Implementation Algorithm |             Easier due to modular design.              | Easier due to the separation of solver logic.  |
| b) Change Data Representation      |          Easier due to clear data structures.          | Easier due to the Board class's abstraction.   |
| c) Add Additional Functions        |             Easier due to modular design.              | Easier due to adding functions to QueenSolver. |


