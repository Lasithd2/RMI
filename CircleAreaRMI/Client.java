/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.rmi.*;

/**
 *
 * @author hp
 */
public class Client {
    public static void main(String[] args ) throws Exception {
        Scanner s = new Scanner(System.in);
        AreaI obj = (AreaI)Naming.lookup("Area");
        System.out.print("Enter Radius ");
        int x= s.nextInt();

        double n = obj.calculateArea(x);
        System.out.println("The area of circle with radius "+x+" is "+n);


    }

}
h