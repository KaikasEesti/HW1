public class Main {
    public static void main(String[] args) {
        int eaters = 5; // сколько людей будут есть
        int waters = 3000; // миллилитров воды
        int potatoes = 5; //картофелин
        int chicken = 6; // куриных бедер
        int spices = 10; // ложек специи

        System.out.println("Сварили суп. На одного человека вышло:");
        System.out.println((waters/ eaters ) + "миллилитров воды");
        System.out.println((potatoes / eaters )  + "картофелин (а)");
        System.out.println((chicken / eaters) + "куриных(ое) бедер(ро)");
        System.out.println((spices / eaters) + "ложек(ка) специй");

    }
}
