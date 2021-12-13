import ConverstionRateCHF.ConversionRateCHF;
import MoneyInCHF.MoneyInCHF;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MoneyConversionUSDToCHFTest {
    @Test
    public void TestMoneyUSDtoCHF() {

        ConversionRateCHF convert = Mockito.mock(ConversionRateCHF.class);
        Mockito.when(convert.get()).thenReturn(0.80);
        MoneyInCHF money = new MoneyInCHF(convert);
        assertEquals(1.60, money.MoneyUSDtoCHF(2));

    }
}
