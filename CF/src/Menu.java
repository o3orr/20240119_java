import java.util.*;
public class Menu {

    private static Scanner sc = new Scanner(System.in);
    private static HashMap<String, Integer> food = new HashMap<>();
    private static HashMap<String, Integer> orderFood = new HashMap<>(); //주문리스트
    private static Set<String> keys; //keySet()을 사용하여 키값가져오기

    private static int total = 0;

    public static void showMenu() {

        System.out.println("======= COFFEE ======");
        System.out.println("에스프레소          5000");
        System.out.println("아메리카노          5000");
        System.out.println("카페라떼           5500");
        System.out.println("카푸치노           5500");
        System.out.println("바닐라라떼          6000");
        System.out.println("======= BAKERY =======");
        System.out.println("푸딩               3000");
        System.out.println("에그타르트           2500");
        System.out.println("플레인스콘           1500");
        System.out.println("대파스콘            1500");
        System.out.println("팬케이크            2000");

    }

    public static void select() {
        System.out.println("1. 메뉴판 📖");
        System.out.println("2. 메뉴 주문 ☕️");
        System.out.println("3. 영수증 출력 🧾");
        System.out.println("메뉴를 선택해주세요 >> ");
        menuIn();
        while (true) {
            switch (sc.nextLine()) {
                case "1":
                    showMenu();
                    break;
                case "2":
                    order();
                    break;
                case "3":
                    printReciept();
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택하세요!");
            }
        }
    }

    public static void order() {
        while (true) {
            System.out.println("메뉴이름을 정확히 입력해주세요(종료키는 q)");
            String menu = sc.nextLine().trim();
            if (menu.equalsIgnoreCase("q")) {
                System.out.println("주문 종료");
                break;
            }

            int quantity = 0;

            keys = food.keySet();

            for(String key : keys) {
                if (key.contains(menu)){
                    total += food.get(key);
                    orderFood.put(key, food.get(key));
                    System.out.println("메뉴가 담겼습니다");
                    //주문한 메뉴를 주문리스트에 담음
                }
            }

            System.out.println("현재까지의 가격 : " + total);

        }
        select();
    }


    public static void menuIn() {
        food.put("에스프레소", 5000);
        food.put("아메리카노", 5000);
        food.put("아메리카노", 5000);
        food.put("카페라떼", 5500);
        food.put("바닐라라떼", 6000);
        food.put("푸딩", 3000);
        food.put("에그타르트", 2500);
        food.put("플레인스콘", 1500);
        food.put("대파스콘", 1500);
        food.put("팬케이크", 2000);
    }

    public static void printReciept() {

        keys = orderFood.keySet(); //주문리스트 불러옴

        System.out.println("==========================");
        System.out.println("          RECIEPT         ");
        System.out.println("대표:문어  전화:010-3424-0146");
        System.out.println("==========================");
        System.out.println("최영서   2024-02-18 16:31:53");
        System.out.println("상품                     금액");
        for(String key : keys) {
            System.out.println(key + "                   " + orderFood.get(key));
        }
        System.out.println("--------------------------");
        System.out.println("           판매총액: " + total);

    }
}