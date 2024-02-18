package simulationLifecycleManager;

public class ErrorHandler {

    public void handleException(Exception e, String customMessage) {
        System.err.println(customMessage);
        System.err.println("An error occurred: " + e.getMessage());
    }
}