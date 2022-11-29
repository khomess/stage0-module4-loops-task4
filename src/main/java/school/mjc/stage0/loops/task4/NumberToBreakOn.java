package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith<numberToGoUntil){
            for(int i = 1; i < numberToGoUntil; i++){
                System.out.println(i);
                if(i == toBreakWith){
                    break;
                }
            }
        } else {
            System.out.println("iterating till the end");
            for(int i = 1; i <= numberToGoUntil; i++){
                System.out.println(i);
            }
        }
    }
}
