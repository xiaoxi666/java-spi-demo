import com.ExchangeRate;

import java.time.LocalDate;

/**
 * @author xiaoxi666
 * @date 2020-08-11 16:20
 */
public class Main {
    public static void main(String[] args) {
        ExchangeRate exchangeRate = new ExchangeRate();
        exchangeRate.providers(true)
            .forEachRemaining(System.out::println);
        System.out.println("------------------------------------------------");
        exchangeRate.providers(true)
            .forEachRemaining(provider -> System.out.println(provider.create().getQuotes("abc", LocalDate.now())));
    }
}
