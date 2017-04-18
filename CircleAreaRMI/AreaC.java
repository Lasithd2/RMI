import java.rmi.server.*;

/**
 *
 * @author hp
 */
public class AreaC extends UnicastRemoteObject implements AreaI {

    public AreaC() throws Exception{
        super();
    }

    public double calculateArea(int x){
        return Math.PI*x*x;
    }

}
