import Calculator.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
Scanner input = new Scanner(System.in);
        Addition a = new AdditionImp();
        Average a1 = new AverageImp();
        Substraction b = new SubstractionImp();
        Multiplication c = new MultiplicationImp();
        Division d = new DivisionImp();
        Modulus m = new ModulusImp();
        Square s = new SquareImp();
        Cube cube = new CubeImp();
        Factors f = new FactorsImp();
        Even_Odd g = new Even_oddImp();

        System.out.println(" ***** Perform Calculator Operations *****");
        System.out.println("Enter first number");
        int u = input.nextInt();
        System.out.println("Enter second number");
        int v = input.nextInt();

        System.out.println("Addition : "+ a.add(u, v));
        System.out.println("Substraction : "+b.substract(u,v));
        System.out.println("Multiplication : "+c.multiply(u,v));
        System.out.println("Division "+d.div(u,v));
        System.out.println("Even_Odd"+g.evenodd(u));
        System.out.println("Factors "+f.factor(u,v));
        System.out.println("Modulus "+m.mod(u,v));
        System.out.println("Cube:"+cube.cube(u));
        System.out.println("Square:"+s.square(u));
        System.out.println("Division "+d.div(u,v));

        System.out.println("Enter total number of average:" );
        int count = input.nextInt();
        input.nextLine();
        int[] numbers = new int[count];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
        }
System.out.println("Average: "+a1.avg(numbers));
        f.factor(u,v);
        System.out.println("Even_Odd: "+g.evenodd(u));
        }

            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

}