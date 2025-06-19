package refactoring;

import java.util.ArrayList;
import java.util.Date;

public class Bill {

    public String customerName;
    public String nickname;
    public Date birthday;
    public String email;
    public String street;
    public String streetNumber;
    public int postalCode;
    public String city;
    public ArrayList<Article> articles;

    public Bill(
        String customerName,
        String nickname,
        String street,
        String streetNUmber,
        int postalCode,
        Date birthday,
        String email,
        String city) {

        this.customerName = customerName;
        this.nickname = nickname;
        this.street = street;
        streetNumber = streetNUmber;
        this.postalCode = postalCode;
        this.birthday = birthday;
        this.email = email;
        this.city = city;
        articles = new ArrayList<>();
    }

    public boolean addArticle(Article a) {
        return articles.add(a);
    }

    public String getDetails() {
        double total = 0;

        StringBuilder result = new StringBuilder("Details for \"" + customerName + "\"\n");
        result.append(street).append(" ").append(streetNumber).append("\n");
        result.append(postalCode).append(" ").append(city).append("\n");
        result.append("Geburtstag: ").append(birthday).append("\n");
        result.append("Email: ").append(email).append("\n\n");
        result.append("refactoring.Article: \n");
        for (Article article : articles) {
            double price = getArticlePrice(article);

            result.append("\t")
                .append(article.bike().getProductName())
                .append("\tx\t")
                .append(article.purchaseAmount())
                .append("\t=\t")
                .append(price)
                .append("\n");
            total += price;
        }

        result.append("\nTotal price:\t").append(total).append("\n");

        return result.toString();
    }

    private static double getArticlePrice(Article article) {
        double price = 0;
        if (article.bike() instanceof Brompton) {
            if (article.purchaseAmount() > 1) {
                price += (article.purchaseAmount() - 1) * article.bike().getPrice() / 2;
            }
            price += article.bike().getPrice() * article.purchaseAmount();
        } else if (article.bike() instanceof EBike) {
            price += article.bike().getPrice() * article.purchaseAmount();
        } else if (article.bike() instanceof Mountainbike) {
            if (article.purchaseAmount() > 2) {
                price += article.purchaseAmount() * article.bike().getPrice() * 9 / 10;
            } else {
                price += article.bike().getPrice() * article.purchaseAmount();
            }
        }
        if (price > 1000f || price == 1000.0) {
            price = price * 0.8;
        }
        return price;
    }
}
