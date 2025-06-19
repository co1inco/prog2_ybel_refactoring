package refactoring;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillTest {

    private Date _sampleDate;

    @BeforeEach
    public void initialize() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

        _sampleDate = simpleDateFormat.parse("01.01.2001");
    }


    @Test
    public void getDetails() {
        //Arrange
        Bill bill = new Bill(
        "Customer",
            "Nickname",
            "Street",
            "56",
            1234,
            _sampleDate,
            "sample@email.de",
            "City"
        );
        bill.addArticle(new Article(
            new Bike(null, 1, 1, 1, 1),
            5));
        bill.addArticle(new Article(
            new Bike(null, 1, 1, 1, 1),
            10));

        String expected = """
            Details for "Customer"
            Street 56
            1234 City
            Geburtstag: Mon Jan 01 00:00:00 CET 2001
            Email: sample@email.de

            refactoring.Article:\s
            	null	x	5	=	0.0
            	null	x	10	=	0.0

            Total price:	0.0
            """;

        //Act
        String details = bill.getDetails();

        //Assert
        assertEquals(expected, details);
    }


}
