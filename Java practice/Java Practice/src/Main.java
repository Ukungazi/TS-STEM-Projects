import java.util.Scanner;
public class Main {
    boolean left = false;
    boolean right = false;
    boolean foreward = false;
    boolean backward = false;
    public static void main(String[] args) throws Exception {
        Main Default = new Main();
        Scanner Menu = new Scanner(System.in);
        Scanner imputsLeft = new Scanner(System.in);
        Scanner imputsRight = new Scanner(System.in);
        Scanner imputsForeward = new Scanner(System.in);
        Scanner imputsBackward = new Scanner(System.in);
        int Direction = 0;
        int leftWheelAcc = 0;
        int rightWheelAcc = 0;
        int menu;        
        
        System.out.println("Calculator = 1, movement thingy = 0");
        menu = Menu.nextInt();

        if (menu == 0) {
        System.out.println("Left");
        Default.left = imputsLeft.nextBoolean();
        System.out.println("Right");
        Default.right = imputsLeft.nextBoolean();
        System.out.println("Foreward");
        Default.foreward = imputsLeft.nextBoolean();
        System.out.println("Backward");
        Default.backward = imputsLeft.nextBoolean();

        while(Default.foreward) {
                leftWheelAcc++;
                rightWheelAcc++;
                System.out.println(leftWheelAcc);
                System.out.println(rightWheelAcc);
                if(leftWheelAcc >= 100 && rightWheelAcc > 100) {
                        break;
                }
            }
        while(Default.left) {
                rightWheelAcc++;
                leftWheelAcc--;
                System.out.println(leftWheelAcc);
                System.out.println(rightWheelAcc);
                Direction++;
                System.out.println(Direction);
                if (Direction >= 90) {
                    break;
                }
            }
        while (Default.right) {
        leftWheelAcc++;
        rightWheelAcc--;
        System.out.println(leftWheelAcc);
        System.out.println(rightWheelAcc);
        Direction--;
        System.out.println(Direction);
        if (Direction <= -90) {
            break;
            }
        }
        while (Default.backward) {
            leftWheelAcc--;
            rightWheelAcc--;
            System.out.println(leftWheelAcc);
            System.out.println(rightWheelAcc);
            if(leftWheelAcc <= -100 && rightWheelAcc < -100) {
                break;
            }
        }
            if(Default.left == false && Default.right == false && Default.foreward == false && Default.backward == false) {
                leftWheelAcc = 0;
                rightWheelAcc = 0;
                System.out.println("you are not moving");
            }
        }
        if (menu == 1) {
            Scanner functionScanner = new Scanner(System.in);
            Scanner FirstNum = new Scanner(System.in);
            Scanner SecondNum = new Scanner(System.in);

            int function;
            float firstNum;
            float secondNum;
            float awnser;

        System.out.println("Desired function: + == 1 - == 2 * == 3 / == 4");
        function = functionScanner.nextInt();
        System.out.println("First Num");
        firstNum = FirstNum.nextFloat();
        System.out.println("Second Num");
        secondNum = SecondNum.nextFloat();

        if (function == 1) {
            awnser = firstNum + secondNum;
            System.out.println(awnser);
        }
        if (function == 2) {
            awnser = firstNum  - secondNum;
            System.out.println(awnser);
        }
        if (function == 3) {
            awnser = firstNum  * secondNum;
            System.out.println(awnser);
        }
        if (function == 4) {
            awnser = firstNum / secondNum;
            System.out.println(awnser);
        }
    }
}
}

