package simulationLifecycleManager;

public class ErrorHandler {

    public void handleException(Exception e) {
        System.err.println("An error occurred: " + e.getMessage());
    }
}