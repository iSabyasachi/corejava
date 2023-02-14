package switchexp;

public class SwitchStatementWithArrow {
    public static void main(String[] args) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;

        char direction = 'R';
        // Use arror with a switch statement.Notice that no value is produced
        switch(direction){
            case 'L' -> {
                System.out.println("Turning Left");
                left++;
            }
            case 'R' -> {
                System.out.println("Turning Right");
                right++;
            }
            case 'U' -> {
                System.out.println("Turning Up");
                up++;
            }
            case 'D' -> {
                System.out.println("Turning Down");
                down++;
            }
        }
        System.out.println(right);
    }
}
