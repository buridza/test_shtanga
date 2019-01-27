import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    private List<Integer> storage = new ArrayList<>();

    public static void main(String[] args) {

    }

    public List<Integer> randomiser() {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < random.nextInt(50) + 1; i++) {
            integers.add(random.nextInt(19) + 10);
        }
        System.out.println("our list " + integers);
        return integers;
    }

    public List<Integer> distinct(List<Integer> arr) {
        ArrayList<Integer> second = new ArrayList<>();
        arr.sort(Comparator.naturalOrder());
        for (Integer integer : arr) {
            if (second.contains(integer)) {
                second.remove(second.size() - 1);
                storage.add(integer);
            } else
                second.add(integer);
        }
        System.out.println("our list before distinct " + second);
        return second;

    }

    public Integer method(List<Integer> second) {
        Integer storageSum = sumAllElements(storage);
        if (second.size() < 2) {
            return storageSum;
        }
        List<Integer> stack = new ArrayList<Integer>;
        Integer secondSum = sumAllElements(second);
        if(secondSum %2 == 0) {
            int searchNumber = secondSum / 2;
            for (int i = 0; i < second.size(); i++) {
                searchNumber -= second.get(i);
                if (searchNumber <= 0) {
                    if(searchNumber == 0) {
                        break;
                    } else {
                        return storageSum;
                    }
                }
                stack.add(second.get(i));
            }

            second.removeAll(stack);
            Integer rest = sumAllElements(second);
            if(rest == secondSum/2) }

        }


    }
    private Integer sumAllElements(List<Integer> arr) {
        return arr.stream().reduce((integer, integer2) -> integer = integer + integer2).get();
    }

    public Integer search(List<Integer> a, Integer b) {
        Collections.reverse(a);
        for (Integer integer : a) {
            if (integer <= b)
                return integer;
        }


    }


}