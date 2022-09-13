// print 1 to 10 without using loops.

class Print {

    public static void printWithoutLoop(int n) {
        if (n <= 10) {
            System.out.println(n);
            printWithoutLoop(n + 1);
        }
    }

    public static void main(String[] args){
        printWithoutLoop(1);
    }
}