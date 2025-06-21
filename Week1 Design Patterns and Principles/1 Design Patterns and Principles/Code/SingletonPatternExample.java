package singleton;

public class SingletonPatternExample 
{
    public static void main(String[] args) 
    {
        Test object = new Test();
        object.test();
    }
}

class Logger 
{
    private static Logger instance;

    private Logger() 
    {
        System.out.println("Logger Initialized");
    }

    public static Logger getInstance() 
    {
        if (instance == null) 
        {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) 
    {
        System.out.println("LOG: " + message);
    }
}
class Test
{
    public void test()
    {
        singleton.Logger logger1 = singleton.Logger.getInstance();
        singleton.Logger logger2 = singleton.Logger.getInstance();

        logger1.log("Testing Logger from logger1");
        logger2.log("Testing Logger from logger2");

        if (logger1 == logger2)
        {
            System.out.println("Test: Singleton works, both instances are the same.");
        }
        else
        {
            System.out.println("Test: Singleton failed, instances are different.");
        }
    }
}