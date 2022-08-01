# Introduction
These are a suite of Java programs which deal with Sudoku Puzzles.<br>
They can achieve objectives like Sudoku Puzzle Validation and Sudoku Puzzle Solver.<br>

# Sudoku Solver
This is a program which solves 9x9 Sudoku puzzles. Written completely in Java and built wholly from scratch, this program reads input and solves the puzzle. It employs concepts such as backtracking and recursion.

# How It Works

### Sudoku Solver
This particular algorithm employs the use of backtracking, one of the more common methods to solve Sudoku puzzles. I've written a simple algorithm to give an idea of how the program works.
<ol>
<li>Start
<li>We start with the first empty cell.
<li>We generate a list of possible valid values that can be filled in that cell.
<li>We iterate over this list and start with the first value. This value is placed in the required cell.
<li>We move on to the next cell. We again generate a list of possibilities. However, if no list can be generated, then this means that there is something wrong with the value of the previous cell. We then move back to the previous cell and place the next value on the generated list in the cell now. We repeat this step until the <li>current cell has a valid value placed inside it.
<li>We stop when we reach the 10 row.
<li>The puzzle has now been solved.
<li>Stop
</ol>

### Sudoku Validator

The workings of the Sudoku Validator are quite simple, to be honest. Here's a simple algorithm explaining them all.
<ol>
<li>Start
<li>The values in all the cells are checked to see if they are in the range 1-9. If not, the puzzle is invalid.
<li>Every row is checked to see if it contains 1-9 atleast once. If not, the solution is invalid.
<li>Every column is checked to see if it contains 1-9 atleast once. If not, the solution is invalid.
<li>Every 3x3 grid is checked to see if it contains 1-9 atmost once. If not, the solution is invalid.
<li>If all the criteria have been satisfied, the solution is valid.
<li>Stop
</ol>

# Future Direction
<ul>
<li>Right now, the Sudoku Solver Suite is just a CLI application with a I/O interface. However, if we could make it into a CLI utility which takes in inputs through parameters and switches, that would make it easier for other developers to reuse.
</ul>
