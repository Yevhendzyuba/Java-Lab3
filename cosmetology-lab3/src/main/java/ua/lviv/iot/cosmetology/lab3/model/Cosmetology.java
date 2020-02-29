package ua.lviv.iot.cosmetology.lab3.model;

public abstract class Cosmetology extends AllCosmetology {

	public String typeOfSkin;

	Cosmetology(final PriceType priceInUAH, final int amountInPacket) {
		super(priceInUAH, amountInPacket);
	}

	public Cosmetology(final String appoinmentFor, final String produceCountry, final String descriptionOfProduct,
			final String categoryOfUse, final int amountInPacket, final String classOfCosmetic,
			final float capacityInMl, final PriceType priceInUAH, final String typeOfSkin) {

		super(appoinmentFor, produceCountry, descriptionOfProduct, categoryOfUse, amountInPacket, classOfCosmetic,
				capacityInMl, priceInUAH);
		this.typeOfSkin = typeOfSkin;
	}

	public String getTypeOfSkin() {
		return typeOfSkin;
	}

	public void setTypeOfSkin(String typeOfSkin) {
		this.typeOfSkin = typeOfSkin;
	}

}
