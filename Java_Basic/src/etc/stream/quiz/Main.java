package etc.stream.quiz;

import java.util.List;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        out.println("        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).\n");
        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(comparing(transaction -> transaction.getValue()))
                .map(transaction -> transaction.getValue())
                .collect(toList())
                .forEach(integer -> out.println("tr2021 = " + integer));

        out.println("        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.\n");
        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());

        out.println("cities = " + cities);

        out.println("        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.\n");
        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity() == "Cambridge")
                .map(transaction -> transaction.getTrader())
                .distinct()
                .sorted(comparing(trader -> trader.getName()))
                .collect(toList())
                .forEach(out::println);

        out.println("        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환\n");
        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환
        List<String> nameList = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted() // 문자나 숫자는 Comparator를 사용하지 않아도 됩니다.
                .collect(toList());

        out.println("nameList = " + nameList);

        out.println("        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?\n");
        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean isTrader = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Milan"));
        out.println("isTrader = " + isTrader);


        out.println("        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.\n");
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int totalValue = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("CaMbrIdGe"))
                .mapToInt(transaction -> transaction.getValue())
                        .sum();

        out.println("totalValue = " + totalValue);


        out.println("        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?\n");
        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
//        int value = transactions.stream()
//                .max(comparing(transaction -> transaction.getValue()))
//                .get().getValue();
//
//        out.println("value = " + value);

        int maxValue = transactions.stream()
                .mapToInt(trs -> trs.getValue())
                .max()
                .getAsInt();

        out.println("maxValue = " + maxValue);


        out.println("        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색\n");
        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
//        transactions.stream()
//                .min(comparing(transaction -> transaction.getValue()))
//                .ifPresent(out::println);

        Transaction transaction1 = transactions.stream()
                .min(comparing(transaction -> transaction.getValue()))
                .get();

        out.println("transaction1 = " + transaction1);
    }



}
