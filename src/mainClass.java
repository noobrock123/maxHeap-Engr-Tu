
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noobrock123-laptop
 */
public class mainClass {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maxHeap mh = new maxHeap();
        
        mh.insert(23);
        mh.insert(15);
        mh.insert(26);
        mh.insert(18);
        mh.insert(25);
        
        int input;
        mainLoop: while(true) {
            System.out.println("1: Show\n" + "2: Insert\n" + "3: Remove Max\n" +
                    "0: Exit");
            input = sc.nextInt();
            switch(input) {
                case 1:
                    mh.showArr();
                    break;
                case 2:
                    System.out.print("Enter a value: ");
                    mh.insert(sc.nextInt());
                    break;
                case 3:
                    mh.removeMax();
                    break;
                case 0:
                    System.out.println("Exitting...");
                    break mainLoop;
                default:
                    System.err.println("E: Invalid option");
            }
        }
    }
    
}
