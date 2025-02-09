# 🚀 Java Annotations - Practice Level 1

## 📌 Introduction
Java annotations provide metadata about the code and help in various scenarios like overriding methods, suppressing warnings, and more. This practice focuses on understanding how Java annotations work.

## 📋 Exercises

### 🔹 Exercise 1: Hierarchy of Workers
Create a hierarchy of objects with three classes: `Worker`, `OnlineWorker`, and `OnSiteWorker`.

- The `Worker` class should have attributes `name`, `surname`, `hourlyRate`, and a method `calculateSalary()` that takes the number of hours worked as a parameter and returns the salary.
- The subclasses should override `calculateSalary()`, using the `@Override` annotation.
- In the `main()` method of the `Principal` class, make the necessary calls to demonstrate the functionality of `@Override`.

#### 🏢 OnSite Workers
- Their `calculateSalary()` method will take the number of hours worked per month as a parameter.
- Salary calculation: `(hoursWorked * hourlyRate) + gasolineBonus`.
- `gasolineBonus` should be a `static` attribute in this class.

#### 💻 Online Workers
- Their `calculateSalary()` method will also take the number of hours worked per month as a parameter.
- Salary calculation: `(hoursWorked * hourlyRate) + internetFlatRate`.
- `internetFlatRate` should be a constant in `OnlineWorker`.

### 🔹 Exercise 2: Deprecated Methods
- Add some deprecated methods to the subclasses and use the `@Deprecated` annotation.
- From an external class, invoke these deprecated methods while suppressing warnings using the appropriate annotation.

## 🎯 Objectives
- Learn how Java annotations work.
- Understand the use of `@Override` in method overriding.
- Apply `@Deprecated` to mark outdated methods.
- Use annotations to suppress warnings when needed.

## 🛠 Project Details
- Java Version: **Jbr17**
- IDE: **IntelliJ IDEA** (Recommended, but any IDE can be used)
- Can also be run from the console using appropriate commands

  ## 📝 Clone the repository
  - Repository: [🔗 GitHub - S107Annotations](https://github.com/acocinas/S107Annotations)

Happy coding! 🚀

