package packages.package12;

import java.util.ArrayList;

public class CoinApp {
    public static void main(String[] args) {
        ArrayList<Coin> coins = new ArrayList<>();

        coins.add(new Coin("British Pound", 0.86));
        coins.add(new Coin("Dollar", 1.08));
        coins.add(new Coin("Russian Ruble", 99.22));
        coins.add(new Coin("Euro", 1));

        for (Coin coin : coins) {
            System.out.println(String.format("%.3f %s", coin.getExchangeRate(), coin.getName()));
        }

        System.out.println("Overview of exchange rates relative to " + coins.get(0).getName().toUpperCase() + ":");
        for (int i = 1; i < coins.size(); i++) {
            Coin otherCoin = coins.get(i);
            double relativeRate = otherCoin.getExchangeRate() / coins.get(0).getExchangeRate();
            System.out.println(String.format("%.3f %s ", relativeRate, otherCoin.getName().toUpperCase()));
        }
    }
}
