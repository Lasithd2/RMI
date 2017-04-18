/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.rmi.Remote;

/**
 *
 * @author hp
 */
public interface AreaI extends Remote {
    public double calculateArea(int x) throws Exception;

}
