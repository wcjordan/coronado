package coronado.analysis;

import coronado.api.SecretKeys;
import coronado.api.TradeKingProxy;
import org.junit.Test;

public class PositionAnalyzerTest {

	@Test
	public void testGetPositions() throws Exception {
		TradeKingProxy apiProxy = new TradeKingProxy(new SecretKeys());
		PositionAnalyzer pa = new PositionAnalyzer(apiProxy);
        pa.getHistory();
	}

    @Test
    public void testGetInvestmentSlices() throws Exception {
        final TradeKingProxy tkp = new TradeKingProxy(new SecretKeys());
        PositionAnalyzer pa = new PositionAnalyzer(tkp);
        System.out.println(pa.getInvestmentSlices());
    }
}
