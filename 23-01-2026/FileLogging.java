
// Logging in Java :
//                     Logging is used to record information from a running program, such as:
//                     Errors
//                     Warnings
//                     Debug information
//                     Application-flow messages

// Logging is essential for debugging and monitoring production applications.

// Logging Options in Java
//                  Logging System                         	Description
//                  java.util.logging	                 Built-in logging framework.
//                     Log4j	                        Popular external logging library by Apache.
//                     SLF4J	                        A logging facade that connects to Log4j and Logback.
//                     Logback	                         Modern and faster successor to Log4j.


//                            Levels of Loggers
//                   Level                   Meaning
//                   SEVERE	               Critical error
//                   WARNING	           Something unexpected
//                    INFO	               General information
//                    CONFIG	            Configuration details
//                    FINE	                Debug level
//                    FINER	               More detailed debug
//                    FINEST	            Very detailed debug


import java.io.IOException;
import java.util.logging.*;

public class FileLogging {
    private static final Logger logger = Logger.getLogger(FileLogging.class.getName());

    public static void main(String[] args) throws IOException {
            FileHandler handler = new FileHandler("app.log", true);
            logger.addHandler(handler);

            logger.info("Application started");
            logger.warning("Potential issue detected");
            logger.severe("Error occurred!");


    }
}
