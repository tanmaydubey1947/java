public class SwitchFinal {
    public static void main(String[] args) {

        //Before Java 14
        String command = "START";
        switch (command) {
            case "START" -> System.out.println("System is starting...");
            case "STOP" -> System.out.println("System is stopping...");
            case "PAUSE" -> System.out.println("System is pausing...");
            case "RESUME" -> System.out.println("System is resuming...");
            default -> System.out.println("Unknown command.");
        }

        //Java 14 and later
        String action = "TEST";
        String result = switch (action) {
            case "START" -> "System is starting...";
            case "STOP" -> "System is stopping...";
            case "PAUSE" -> "System is pausing...";
            case "RESUME" -> "System is resuming...";
            case "TEST" -> {
                // More complex logic can be handled here
                String testResult = "All systems go!";
                yield "System test result: " + testResult;
            }
            default -> "Unknown action.";
        };

        System.out.println(result);
    }
}