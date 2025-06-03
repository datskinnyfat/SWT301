import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import datpv.example.AccountService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountServiceTest {

    AccountService accountService = new AccountService();

    @ParameterizedTest(name = "Test {index}: username={0}, password={1}, email={2}, expected={3}")
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    void testRegisterAccountFromCsv(String username, String password, String email, boolean expected) {
        boolean result = accountService.registerAccount(username, password, email);
        assertEquals(expected, result,
                () -> String.format("Expected %s but got %s for input: [%s, %s, %s]",
                        expected, result, username, password, email));
    }
}