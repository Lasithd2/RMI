/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.server.*;

/**
 *
 * @author hp
 */
public class AddC extends UnicastRemoteObject implements AddI {

    public AddC() throws Exception{
        super();
    }

    public int add(int x,int y){
        return x+y;
    }

}
