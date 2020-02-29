package ua.lviv.iot.cosmetology.lab3.model;

public class Pomade extends AllCosmetology {

	private String colourOfPomade;

	Pomade(final PriceType priceInUAH, final int amountInPacket) {
		super(priceInUAH, amountInPacket);
	}

	Pomade(final String appoinmentFor, final String produceCountry, final String descriptionOfProduct,
			final String categoryOfUse, final int amountInPacket, final String classOfCosmetic,
			final float capacityInMl, final PriceType priceInUAH, final String colourOfPomade) {
		super(appoinmentFor, produceCountry, descriptionOfProduct, categoryOfUse, amountInPacket, classOfCosmetic,
				capacityInMl, priceInUAH);
		this.colourOfPomade = colourOfPomade;

	}

	public String getColourOfPomade() {
		return colourOfPomade;
	}

	public void setColourOfPomade(String colourOfPomade) {
		this.colourOfPomade = colourOfPomade;
	}

}

enum colourOfPomade {
	RED, PURPLE, PINK;
}