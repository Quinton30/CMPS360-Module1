# CMPS 360 — Module 1: Java Programming

This repository contains the guided Hello World lab and both Java programming assignments for Point Park University's CMPS 360 Module 1.

## Requirements
- Java Development Kit (JDK), version 21 or newer (or the version approved by the instructor)
- Visual Studio Code with the Extension Pack for Java
- Git for submitting source code to GitHub

## Folder structure
- `Lab/HelloWorld.java`: introductory console program
- `Assignment1/StudentGradeCalculator.java`: prints student information, three grades, their average and a pass/fail status
- `Assignment2/Product.java`: encapsulates product name, unit price and quantity with methods
- `Assignment2/InventoryApp.java`: reports the value of two products to the console and through a Swing dialog
- `WrittenWork/`: reflections, discussion draft and a submission checklist

## Run from VS Code
Open the `CMPS360-Java-Module1` folder using **File > Open Folder**. Open each Java file and use **Run**, or open the VS Code terminal and use the commands below from the repository root.

### Guided lab
```bash
cd Lab
javac HelloWorld.java
java HelloWorld
```

### Assignment 1
Return to the repository root first, then:
```bash
cd Assignment1
javac StudentGradeCalculator.java
java StudentGradeCalculator
```

The grades are example values and can be edited in the Java source file. The program reports **Passed** if the mean is at least 70; otherwise, it reports **Failed**.

### Assignment 2
Return to the repository root first, then:
```bash
cd Assignment2
javac Product.java InventoryApp.java
java InventoryApp
```

A console report and a Swing `JOptionPane` window appear. Close the message dialog to end the program. The dialog requires a desktop environment with a graphical display.

## GitHub submission
Create a new empty GitHub repository named `CMPS360-Java-Module1`. In a terminal opened at this project's root, run:
```bash
git init
git branch -M main
git add .
git commit -m "Complete CMPS 360 Module 1"
git remote add origin https://github.com/YOUR_USERNAME/CMPS360-Java-Module1.git
git push -u origin main
```
Replace `YOUR_USERNAME` with your GitHub username. If your Git setup asks you to set your commit identity, follow the displayed guidance. Check GitHub to confirm the source files uploaded.

## What to submit
- The repository URL with both programming assignments and README
- Screenshot of Assignment 1 console output in VS Code
- Screenshots of Assignment 2 console output **and** Swing GUI dialog
- Assignment 1 source-code-vs-bytecode reflection and Assignment 2 OOP explanation
- Initial discussion post and two original responses to classmates through the course LMS

Read `WrittenWork/SubmissionChecklist.md` before submitting. Compiled `.class` files are ignored by Git.
