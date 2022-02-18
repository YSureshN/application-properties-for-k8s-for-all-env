import com.herc.lighttower.listeners.UDPListener;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LightTowerUDPListener {

        private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        public static void main(String[] args) throws UnknownHostException {
            logger.info( "Light Tower Listener application started:");
            logger.info("Localhost address : "+ InetAddress.getLocalHost().getHostAddress());
            logger.info("Public/External IP : ");
            UDPListener udpListener = new UDPListener();
            udpListener.startListeners();
        }
}
