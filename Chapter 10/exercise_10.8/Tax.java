public class Tax {
	private static final int SINGLE_FILER = 0,
		MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1,
		MARRIED_SEPARATELY = 2,
		HEAD_OF_HOUSEHOLD = 3;
	private int filingStatus;
	private int brackets;
	private final int[][] brackets2001 = {
		{0, 0, 0, 0},
		{27050, 45200, 22600, 36250},
		{65500, 109250, 54625, 93650},
		{136750, 166500, 83250, 151650},
		{297350, 297350, 148675, 297350}
	};
	private final int[][] brackets2009 = {
		{0, 0, 0, 0},
		{8350, 16700, 8350, 11950},
		{33950, 67900, 33950, 45500},
		{52250, 137050, 68525, 117450},
		{171550, 208850, 104425, 190200},
		{372951, 372951, 186576, 372951}
	};
	private final double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
	private final double[] rates2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
	private int ratesIndex;
	private int year;

	private double taxableIncome;

	public Tax() {
	}
	public Tax(int filingStatus, double taxableIncome, int year) {
		this.year = year;
		this.filingStatus = filingStatus;
		this.ratesIndex = gatTaxRate(taxableIncome, year, filingStatus);
		this.taxableIncome = taxableIncome;
	}

	public int getFilingStatus() {
		return filingStatus;
	}
	public double getTaxableIncome() {
		return taxableIncome;
	}
	public int getRatesIndex() {
		return ratesIndex;
	}
	//////////////////////////////////////
	public double getRates2001() {
		return rates2001[ratesIndex];
	}
	public double getRates2009() {
		return rates2009[ratesIndex];
	}
	/////////////////////////////////////
	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	public void setRatesIndex(int ratesIndex) {
		this.ratesIndex = ratesIndex;
	}
	/////////////////////////////////////
	public double getTax() {
		int totalTax = 0;
		double tempTaxableIncome = taxableIncome;
		if (year == 2001) {
			for (int i = ratesIndex; i > 0; i--) {
				totalTax += (this.taxableIncome - brackets2001[i - 1][filingStatus]) * rates2001[ratesIndex];
				tempTaxableIncome = brackets2001[i - 1][filingStatus];
			}
		}
		else {
			for (int i = ratesIndex; i > 0; i--) {
				totalTax += (this.taxableIncome - brackets2009[i - 1][filingStatus]) * rates2009[ratesIndex];
				tempTaxableIncome = brackets2009[i - 1][filingStatus];
			}
		}
		return totalTax;
	}
	//////////////////////////////////////
/*	public double getTax2001() {
		int totalTax = 0;
		double tempTaxableIncome = taxableIncome;
		for (int i = ratesIndex; i > 0; i--) {`
			totalTax += (this.taxableIncome - brackets2001[i - 1][filingStatus]) * rates2001[ratesIndex];
			tempTaxableIncome = brackets2001[i - 1][filingStatus];
		}

		return totalTax;
	}

	/////////////////////////////////////
	public double getTax2009() {
		int totalTax = 0;
		double tempTaxableIncome = taxableIncome;
		for (int i = ratesIndex; i > 0; i--) {
			totalTax += (this.taxableIncome - brackets2009[i - 1][filingStatus]) * rates2009[ratesIndex];
			tempTaxableIncome = brackets2009[i - 1][filingStatus];
		}

		return totalTax;
	}
*/
	//计算 收入 和 年份 对应的税率下标
	public int gatTaxRate(double taxableIncome, int year, int filingStatus) {
		int i = 0;
		if (year == 2001) {
			for (; i < rates2001.length - 1; i++){
				if (taxableIncome > brackets2001[i][filingStatus] && taxableIncome <= brackets2001[i + 1][filingStatus])
					return i;
			}
			return rates2001.length - 1;
		}
		else {
			for (; i < rates2009.length - 1; i++){
				if (taxableIncome > brackets2009[i][filingStatus] && taxableIncome <= brackets2009[i + 1][filingStatus])
					return i;
			}
			return rates2009.length - 1;
		}
	}
}