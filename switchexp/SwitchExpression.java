package switchexp;
/**
 * Java 14
 * Switch Expression, yield, support for a list of case constants and the case with an arrow
 */
public class SwitchExpression {
    //Use blocks with an arrow
    public static void switchExpressionFunc3(){
        boolean stopNow;
        int eventCode = 9128;

        int priorityLevel = switch(eventCode) {
            //case stack
            case 1000, 1205, 8900 -> {
                stopNow = false;
                System.out.println("Alert");
                yield 1;
            }
            case 2000, 6010, 9128 -> {
                stopNow = false;
                System.out.println("Warning");
                yield 2;
            }
            case 1002, 7023, 9300 -> {
                stopNow = true;
                System.out.println("Danger");
                yield 3;
            }
            default -> {
                stopNow = false;
                System.out.println("Normal");
                yield 0;
            }
        };
        String output = String.format("Priority level for the event code %d is %d", eventCode, priorityLevel);
        System.out.println(output);
    }
    // Use the arror "shorthand" to supply the priority level 
    public static void switchExpressionFunc2(){
        int eventCode = 9090;

        int priorityLevel = switch(eventCode) {
            //case stack
            case 1000, 1205, 8900 -> 1;
            case 2000, 6010, 9128 -> 2;
            case 1002, 7023, 9300 -> 3;
            default -> 0;
        };
        String output = String.format("Priority level for the event code %d is %d", eventCode, priorityLevel);
        System.out.println(output);
    }
    //Convert a switch statement into a switch expression
    public static void switchExpressionFunc1(){
        int eventCode = 9090;

        int priorityLevel = switch(eventCode) {
            //case stack
            case 1000, 1205, 8900:            
                yield 1;
            case 2000, 6010, 9128:
                yield 2;
            case 1002, 7023, 9300:            
                yield 3;
            default: //default priority
                yield 0;
        };
        String output = String.format("Priority level for the event code %d is %d", eventCode, priorityLevel);
        System.out.println(output);
    }
    public static void main(String[] args) {
        //switchExpressionFunc1();
        //switchExpressionFunc2();
        switchExpressionFunc3();
    }
   
}
