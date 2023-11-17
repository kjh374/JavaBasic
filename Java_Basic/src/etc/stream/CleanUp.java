package etc.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class CleanUp {

    public static List<String> getHealthyDishName(List<Dish> menu) {
        /*
        요리 목록에서 칼로리가 400칼로리보다 작은 요리들만 추출해서
        칼로리가 낮은순서대로 오름차정렬한 후
        그 요리의 이름들만 추출해서 리스트로 만들고 싶어요~
        */

        // 스트림을 사용하지 않은 코드
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish dish : menu) {
            if (dish.getCalories() < 400){
                lowCaloricDishes.add(dish);
            }
        }
        // 칼로리 낮은 순으로 오름차 정렬
        lowCaloricDishes.sort(new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return o1.getCalories() - o2.getCalories();
            }
        });

        // 정렬된 리스트에서 이름만 뽑은 리스트를 만들자
        List<String> dishNames = new ArrayList<>();
        for (Dish lowCaloricDish : lowCaloricDishes) {
            dishNames.add(lowCaloricDish.getName());
        }

        return dishNames;
    }

    // 슽림을 사용한 코드
    public static List<String> getHealthyDishName2(List<Dish> menu){
        return menu.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .collect(toList());



    }

    public static void main(String[] args) {

        List<String> dishName1 = getHealthyDishName(menuList);
        System.out.println("dishName1 = " + dishName1);

        List<String> dishName2 = getHealthyDishName2(menuList);
        System.out.println("dishName2 = " + dishName2);
    }

}