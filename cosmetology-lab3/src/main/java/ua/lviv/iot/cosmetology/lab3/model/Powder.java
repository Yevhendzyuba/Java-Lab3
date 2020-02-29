package ua.lviv.iot.cosmetology.lab3.model;

public class Powder extends Cosmetology {

	private String shadeOfShine;

	public Powder(final PriceType priceInUAH, final int amountInPacket) {

		super(priceInUAH, amountInPacket);
	}

	public Powder(final String appoinmentFor, final String produceCountry, final String descriptionOfProduct,
			final String categoryOfUse, final int amountInPacket, final String classOfCosmetic,
			final float capacityInMl, final PriceType priceInUAH, final String typeOfSkin, final String shadeOfShine) {
		super(appoinmentFor, produceCountry, descriptionOfProduct, categoryOfUse, amountInPacket, classOfCosmetic,
				capacityInMl, priceInUAH, typeOfSkin);
		this.shadeOfShine = shadeOfShine;

	}

	public String getShadeOfShine() {
		return shadeOfShine;
	}

	public void setShadeOfShine(String shadeOfShine) {
		this.shadeOfShine = shadeOfShine;
	}

}
