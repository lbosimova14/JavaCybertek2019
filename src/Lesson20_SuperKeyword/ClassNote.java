package Lesson20_SuperKeyword;

public class ClassNote {

}
 /*
11/01/2019
Java Reveiw: 
        1. Inheritance
        2. this & super keywords
        3. Constructor
Inheritance: super and sub classes
        
        class  Sait  extends  khurshed
        //      sub             super
        class  Olexander  extends khurshed
        //      sub                 super
        class  Ibrohim   extends   Olexander
        //      sub                    super
        sub class: gets more richer, inherits all visible and protected features from the super class
                private access modifier is not inheritable
                default access modifier is only inheritable to the classes that are in the smae package
        super class: super class cannot inherit any feature from the sub class
        a class can be extended by multiple  ( can have multiple sub classes)
super: refers to the object instance
    super. : used for calling instance variables and instance methods
             
             MUST be used in the sub class
            cannot be used in static methods or static block 
    super(): used for calling constructors from super class
                MUST be used in the sub class
this: refers to the object instances
    this. : used for calling instance variables  for the class itself
            cannot be used in static methods or static block 
    this(): calling the constructor from the class itself
    SUPER AND THIS SHOULD ONLY BE USED TO CALL OBJECT ISNTANCES , NOT THE STATICS
constructor:  parent class' constructor MUST be called in the sub class
                    at least one of them
            
             super class' default constructor is called in the sub class by default
next week:
        1. method overriding
        2. final keyword*/