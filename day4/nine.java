// Q.9. Write a Java Program to Access Super Class in a Method Overriding

class Parent
{
    public void exampleFunction()
    {
        System.out.println("exampleFunction() of Parent called!");
    }
}

class Child extends Parent
{
    public void exampleFunction()
    {
        System.out.println("exampleFunction() of Child called!");
    }
    public void callExampleFunction()
    {
        exampleFunction(); // calling the overridden function from within the child class
    }
}

class nine
{
    public static void main(String[] args)
    {
        Child Child1 = new Child();
        Child1.callExampleFunction();

        Parent Parent1 = new Parent();
        Parent1.exampleFunction();
    }
}

// Output
// exampleFunction() of Child called!
// exampleFunction() of Parent called!
