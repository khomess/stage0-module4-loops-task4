package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int i,x;
        int sum1 = 0;
        int sum2 = 0;
        if (numberToSkip<=lastInRow) {
            if(lastInRow>=0) {
                for (i = 0;i<=numberToSkip;i++) {
                    sum1 += i;
                }
                System.out.println("skipped sum is "+sum1);
                    for (x = numberToSkip + 1; x <= lastInRow; x++) {
                        sum2 += x;
                    }
                    System.out.println("counted sum is "+sum2);
            } else{
                System.out.println("last number in row is negative");
            }
        } else{
            System.out.println("number to skip is bugger then the last");
        }
    }
}
