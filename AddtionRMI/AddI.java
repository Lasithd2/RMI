/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;

/**
 *
 * @author hp
 */
public interface AddI extends Remote {
    public int add(int x,int y) throws Exception;

}
