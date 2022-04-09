package day21_ArrayPart2;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Ela", "Lale", "Leyla", "Leylak", "Elele", "Elle", "Sem", "Semmy", "Semra", "Ela", "Elle", "Lale"};

        for (String each : words) {
            int count = 0;
            for (String element : words) {
                if (element.equals(each)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.println(each);
            }
        }

    }
}
