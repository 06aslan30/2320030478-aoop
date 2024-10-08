
 class Logger {
    private static Logger instance;
    
    private Logger() {
        // private constructor to restrict instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
 public class loggers {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("logged in");
    }
}
