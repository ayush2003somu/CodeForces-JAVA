# CodeForces Java Solutions

This repository contains my accepted and practice solutions for Codeforces problems in Java.

I am using this repo to keep track of problems I solve regularly and organize them by difficulty/problem group.

## Repository Structure

Most solutions are grouped in folders like:

```text
900/
  1850D/
    demo.java
    input.txt
  1869A/
    demo.java
    input.txt
```

- `900/` represents the problem rating/category.
- Each problem usually has its own folder.
- `demo.java` contains the Java solution.
- `input.txt` is used for local testing in many solutions.

## How the Code Works Locally

Many files in this repo use this pattern:

- If the code is running locally, it reads input from `input.txt`
- If the code is running on Codeforces, it reads from standard input

That makes local testing easier while still keeping the solution compatible with online judges.

## Requirements

Make sure Java is installed on your system.

Check with:

```bash
javac -version
java -version
```

## How To Run a Solution

### Option 1: Run with `input.txt`

If the solution uses local file input, go to that problem folder first.

Example:

```bash
cd 900/1869A
javac demo.java
java demo
```

The program will read from `input.txt` in the same folder.

### Option 2: Run with Standard Input

If you want to run with terminal input instead, compile first:

```bash
cd 900/1869A
javac demo.java
```

Then run with:

```bash
java -DONLINE_JUDGE=true demo < input.txt
```

You can also type input manually:

```bash
java -DONLINE_JUDGE=true demo
```

## Example

```bash
cd 900/1850D
javac demo.java
java demo
```

Or:

```bash
cd 900/1850D
javac demo.java
java -DONLINE_JUDGE=true demo < input.txt
```

## Notes

- Some files may use class names other than `demo`
- In those cases, compile and run using that class name
- `.class` files may appear after compilation

## Goal

I plan to keep pushing every Codeforces problem I solve in Java to this repository.

This repo is mainly for:

- practice tracking
- revision
- quick reference for problem-solving patterns

