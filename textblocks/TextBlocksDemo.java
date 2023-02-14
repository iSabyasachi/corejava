package textblocks;
/** JDK 15 */
public class TextBlocksDemo{
    public static void main(String[] args){
        String block = """
                Hello
                World! %s
                This is %d time and the price is %f. \
                "this is a paragraph"
                """;
        System.out.println(block);
        System.out.println(String.format(block, "Sabyasachi", 1, 1.03f));

    }
}