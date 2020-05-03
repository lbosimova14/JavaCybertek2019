package Ass01_CybertekAssighments;

public class WhatILearned {

	public static void main(String[] args) {
		System.out.println(" 1. What does JVM, JRE, JDK stand for?");
		System.out.println("\n\tJVM is a engine that provides runtime environment to drive the Java Code or applications."
		                    +"\nIt converts Java bytecode into machines language.\n"+ 
				            "JVM is a part of JRE(Java Run Environment)."
				            + "\nIt stands for Java Virtual Machine.");
		System.out.println("\n\tJRE is Java Runtime Enviroment.It is the implementation of JVM.\n"
				            + "It physically exists.It contains set of libraries + other files that JVM uses at runtime");
		System.out.println("\n\tJDK is Java Development Kit. JDK is a superset of JRE. \n"
				            + "JDK contains everything that JRE has along with development tools for \n"
				            + "developing, debugging, and monitoring Java applications. \n"
				            + "You need JDK when you need to develop Java applications.");
		System.out.println("\n2. What's main method? ");
        System.out.print("\n\tEvery java application must have a method named \"main\"."
        		          +"\nThe \"main\" method is the starting point of an application."
        		          +"\nIf you are ever reading the code for someone else\'s app "
        		          +"\nand want to find where it starts, just look for the method named \"main\". \n");
        System.out.println("\n3. Explain the src folder and class");
        System.out.print("\n\t\"Src\" is the folder where the project's source files are located. "
        		          + "\nFor example, if you are working on a Java project,"
        		          + "\nsrc folder and its sub folders would hold the .java files. "
        		          + "\nClass file contains byte codes. When it compiles it stores the class files in bin.\n");
        System.out.println("\n 4. What is System.out.println  is used for?");
        System.out.println("\nThe \"System\"class is part of the Java API. \n"
        		          + "It has member objects and methods for performing system-level operations\n"
        		          + "such as sending output to the console.The \"out\" object is menber of the System class\n"
        		          + "It provides methods for sending output to the screen.\n"
        		          + "The\"print\" methods are member of out object.They actually perform the work of\n"
        		          + "wring characters on the screen.");
	}

}
