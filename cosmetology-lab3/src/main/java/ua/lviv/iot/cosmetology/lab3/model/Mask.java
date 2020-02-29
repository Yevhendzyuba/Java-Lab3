package ua.lviv.iot.cosmetology.lab3.model;

public class Mask extends Cosmetology {

	private float periodTimeOfUse;

	public Mask(final PriceType priceInUAH, final int amountInPacket) {

		super(priceInUAH,amountInPacket);
	}

	public Mask(final String appoinmentFor, final String produceCountry, final String descriptionOfProduct,
			final String categoryOfUse, final int amountInPacket, final String classOfCosmetic,
			final float capacityInMl, final PriceType priceInUAH, final String typeOfSkin, final float periodTimeOfUse) {
		super(appoinmentFor, produceCountry, descriptionOfProduct, categoryOfUse, amountInPacket, classOfCosmetic,
				capacityInMl, priceInUAH, typeOfSkin);
		this.periodTimeOfUse = periodTimeOfUse;

	}

	public float getPeriodTimeOfUse() {
		return periodTimeOfUse;
	}

	public void setPeriodTimeOfUse(float periodTimeOfUse) {
		this.periodTimeOfUse = periodTimeOfUse;
	}

}
