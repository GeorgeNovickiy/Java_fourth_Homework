import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.

public class Task1 {
    public static void main(String[] args) {
        Deque <Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(1);
        deque1.addFirst(2);
        deque1.addFirst(3);
        System.out.println(deque1);

        Deque <Integer> deque2 = new ArrayDeque<>();
        deque2.addFirst(3);
        deque2.addFirst(4);
        deque2.addFirst(5);
        System.out.println(deque2);

        String str1= new String();
        str1 = Integer.toString(deque1.pollLast());
        str1 += Integer.toString(deque1.pollLast());
        str1 += Integer.toString(deque1.pollLast());
        System.out.println(str1);

        String str2= new String();
        str2 = Integer.toString(deque2.pollLast());
        str2 += Integer.toString(deque2.pollLast());
        str2 += Integer.toString(deque2.pollLast());
        System.out.println(str2);

        int result = 0;
        result = Integer.parseInt(str1) * Integer.parseInt(str2);
        System.out.println(result);

        LinkedList<Integer> link = new LinkedList<>();
        int firstDigit = 0;
        firstDigit = result%10;
        link.add(0,firstDigit);
        firstDigit = result%100/10;
        link.add(0,firstDigit);
        firstDigit = result%1000/100;
        link.add(0,firstDigit);
        firstDigit = result%10000/1000;
        link.add(0,firstDigit);
        firstDigit = result%100000/10000;
        link.add(0,firstDigit);

        System.out.println(link);





    }
}
