

import java.rmi.*;

/**
 *
 * @author hp
 */
public class Server {

    public static void main(String[] args)throws Exception
            {

                AreaC obj = new AreaC();
                Naming.rebind("Area",obj);
                System.out.println("Server Started");



    }

}
