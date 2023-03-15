public class HW_6_2 {
    public static void main(String[] args) {

        // Задача №1 необходимо вывести все буквы “о” из этой строки.

        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'о'){
                System.out.println(s.charAt(i));
            }
        }

        // Задача №2 необходимо подсчитать количество букв “е” в строке.
        
        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        char letter = 'е';
        for (int i = 0; i < s2.length(); i++) {
            if(s2.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("количество букв \"" + letter + "\" в строке \"" + s2 + "\" = " + count);

        // Задача №3 необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.

        String s3 = "Посмотрите как Рите нравится ритм";

        int index = 0;
        for (int i = 0; i < s3.length() - 3; i++) {
            if(s3.toLowerCase().charAt(i) == 'р' && s3.charAt(i + 1) == 'и' && s3.charAt(i + 2) == 'т'){
                System.out.println(s3.indexOf('р'));

            }



        }

        // Задача №4 необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count4 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!array[i][j].contains("е")){
                    count4++;
                }
            }
        }
        System.out.println(count4);


    }
}
