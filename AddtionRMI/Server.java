/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.*;

/**
 *
 * @author hp
 */
public class Server {

    public static void main(String[] args)throws Exception
            {

                AddC obj = new AddC();
                Naming.rebind("ADD",obj);
                System.out.println("Server Started");



    }

}
