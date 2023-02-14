package pattern;
/** JDK 17 */
public class InstanceOfDemo {
    public static void main(String[] args) {
        Number myObj = Integer.valueOf(0);
        if(myObj instanceof Integer intObj && intObj > 0){
            System.out.println("Integer is greater than 0 -> "+intObj);
        }else{
            System.out.println("Integer is equals to 0 ");
        }
        
    }
}
