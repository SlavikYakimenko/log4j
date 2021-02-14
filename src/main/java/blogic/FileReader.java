package blogic;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Logger;

public class FileReader implements Reader{
    int num;
    final static Logger logger = Logger.getLogger(String.valueOf(FileReader.class));


    @Override
    public String read() {
        String mess="";
        try {
            URI url = ClassLoader.getSystemResource("message.txt").toURI();
            logger.warning("Generated number - " + num);

        }catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return mess;
    }
}
