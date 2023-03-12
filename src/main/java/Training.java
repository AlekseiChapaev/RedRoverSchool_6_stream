public class Training {
    /**
     * ВНИМАНИЕ! ВНИМАНИЕ! ВНИМАНИЕ!
     * Случилось страшное! Нашу школу атаковали хакеры (скорее всего, наши конкуренты) и нахулиганили немного! Поздравляю, ваших знаний, которые вы до этого дня получили, вполне уже достаточно, чтобы всё исправить! Не зря Сергей назвал вас программистами на уроке!
     * Вандалы испортили название школы. Необходимо исправить и привести в нормальный вид строку: "RRReeedddRRRooovvveeerrr...sssccchhhoooooolll"
     * Хулиганы зашифровали линк на очень полезный сайт. Вот,  во что они эту ссылку превратили: "myyux?44|||3gz~rjfhtkkjj3htr4XjwljnI" Восстановите линк на этот сайт и проверьте (заходим по линку), может и на странице сайта что-то оставили нехорошее? Если нет, то дальше действуем уже по совести.
     * Тем же дешифровщиком дешифруйте вот эту строку: "^tz%fwj%f|jxtrj&%^tz%ini%ny&%Otns%tzw%yjfr&%Fqj}%Qjt3%Ny%nx%szrgjw%;%ns%ymj%qnxy%tk%lwtzux". Спасибо! Родина вас не забудет!))
     */

    public static void main(String[] args) {
        String row = "RRReeedddRRRooovvveeerrr...sssccchhhoooooolll";
        String url = "myyux?44|||3gz~rjfhtkkjj3htr4XjwljnI";
        String str = "^tz%fwj%f|jxtrj&%^tz%ini%ny&%Otns%tzw%yjfr&%Fqj}%Qjt3%Ny%nx%szrgjw%;%ns%ymj%qnxy%tk%lwtzux";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < row.length(); i += 3) {
            sb.append(row.charAt(i));
        }

        System.out.println(sb);

        sb.replace(0, sb.length(), "");
        for (int i = 0; i < url.length(); i++) {
            sb.append((char) (url.charAt(i) - 5));
        }

        System.out.println(sb);

        sb.replace(0, sb.length(), "");
        for (int i = 0; i < str.length(); i++) {
            sb.append((char) (str.charAt(i) - 5));
        }

        System.out.println(sb);
    }
}
