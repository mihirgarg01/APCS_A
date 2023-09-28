package Unit3.Numbers;

public class EvaluateNumbers {
    public boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public boolean isSingle(int num) {
        boolean single = false;

        if (num <= 0) {
            if (num < 10) {
                single = true;
            }
        }

        return single;
    }

    public void testNumber(int num) {
        if (isEven(num)) {
            if (isSingle(num)) {
                System.out.println(num + " is even and single!");
            } else {
                System.out.println(num + " is even but not single!");
            }
        } else {
            if (isSingle(num)) {
                System.out.println(num + " is odd and single!");
            } else {
                System.out.println(num + " is odd but not single!");
            }
        }
    }
}