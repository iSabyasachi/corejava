package switchexp;
/**
 * Java 14
 * Switch Expression, yield, support for a list of case constants and the case with an arrow
 */
public class TraditionalSwitch {
    public static void switchStatement2(){
        int priorityLevel;

        int eventCode = 1000;

        switch(eventCode) {
            //case stack
            case 1000, 1205, 8900:            
                priorityLevel = 1;
                break;
            case 2000, 6010, 9128  :
                priorityLevel = 2;
                break;
            case 1002, 7023, 9300:            
                priorityLevel = 3;
                break;
            default: //default priority
                priorityLevel = 0;
        }
        String output = String.format("Priority level for the event code %d is %d", eventCode, priorityLevel);
        System.out.println(output);
    }
    public static void switchStatement1(){
        int priorityLevel;

        int eventCode = 1000;

        switch(eventCode) {
            //case stack
            case(1000):
            case(1205):
            case(8900):
                priorityLevel = 1;
                break;
            case(2000):
            case(6010):
            case(9128):
                priorityLevel = 2;
                break;
            case(1002):
            case(7023):
            case(9300):
                priorityLevel = 3;
                break;
            default: //default priority
                priorityLevel = 0;
        }
        String output = String.format("Priority level for the event code %d is %d", eventCode, priorityLevel);
        System.out.println(output);
    }
    public static void main(String[] args) {
        //switchStatement1();
        switchStatement2();

    }
   
}
