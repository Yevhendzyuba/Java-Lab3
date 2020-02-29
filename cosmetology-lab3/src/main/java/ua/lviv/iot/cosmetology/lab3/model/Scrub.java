package ua.lviv.iot.cosmetology.lab3.model;

public class Scrub extends Cosmetology {

	private String naturalComponents;

	public Scrub(final PriceType priceInUAH, final int amountInPacket) {

		super(priceInUAH, amountInPacket);
	}

	public Scrub(final String appoinmentFor, final String produceCountry, final String descriptionOfProduct,
			final String categoryOfUse, final int amountInPacket, final String classOfCosmetic,
			final float capacityInMl, final PriceType priceInUAH, final String typeOfSkin,
			final String naturalComponents) {
		super(appoinmentFor, produceCountry, descriptionOfProduct, categoryOfUse, amountInPacket, classOfCosmetic,
				capacityInMl, priceInUAH, typeOfSkin);
		this.naturalComponents = naturalComponents;

	}

	public String getNaturalComponents() {
		return naturalComponents;
	}

	public void setNaturalComponents(String naturalComponents) {
		this.naturalComponents = naturalComponents;
	}
}

enum naturalComponents {

	COFFE, COCONUT, SUGAR;
}
