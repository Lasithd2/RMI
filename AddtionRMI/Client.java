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
        AddI obj = (AddI)Naming.lookup("ADD");
        System.out.print("Enter 1st number : ");
        int x= s.nextInt();
        System.out.print("Enter 2nd number : ");
        int y = s.nextInt();
        int n = obj.add(x,y);
        System.out.println("Addtion of"+ x+" and "+y+" is "+n);


    }

}
