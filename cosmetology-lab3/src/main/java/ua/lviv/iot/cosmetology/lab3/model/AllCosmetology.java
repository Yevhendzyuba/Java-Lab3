package ua.lviv.iot.cosmetology.lab3.model;

public abstract class AllCosmetology {

	public String appoinmentFor;

	public String produceCountry;

	public String descriptionOfProduct;

	public String categoryOfUse;

	public int amountInPacket;

	public String classOfCosmetic;

	public float capacityInMl;

	public PriceType priceInUAH;

	public AllCosmetology(final PriceType priceInUAH, final int amountInPacket) {
		this.priceInUAH = priceInUAH;
		this.amountInPacket = amountInPacket;
	}

	public AllCosmetology(final String appoinmentFor, final String produceCountry, final String descriptionOfProduct,
			final String categoryOfUse, final int amountInPacket, final String classOfCosmetic,
			final float capacityInMl, final PriceType priceInUAH) {
		this.appoinmentFor = appoinmentFor;
		this.produceCountry = produceCountry;
		this.descriptionOfProduct = descriptionOfProduct;
		this.categoryOfUse = categoryOfUse;
		this.amountInPacket = amountInPacket;
		this.classOfCosmetic = classOfCosmetic;
		this.capacityInMl = capacityInMl;
		this.priceInUAH = priceInUAH;

	}

	public final String getAppoinmentFor() {
		return appoinmentFor;
	}

	public final void setAppoinmentFor(String appoinmentFor) {
		this.appoinmentFor = appoinmentFor;
	}

	public final String getProduceCountry() {
		return produceCountry;
	}

	public final void setProduceCountry(String produceCountry) {
		this.produceCountry = produceCountry;
	}

	public final String getDescriptionOfProduct() {
		return descriptionOfProduct;
	}

	public final void setDescriptionOfProduct(String descriptionOfProduct) {
		this.descriptionOfProduct = descriptionOfProduct;
	}

	public final String getCategoryOfUse() {
		return categoryOfUse;
	}

	public final void setCategoryOfUse(String categoryOfUse) {
		this.categoryOfUse = categoryOfUse;
	}

	public final int getAmountInPacket() {
		return amountInPacket;
	}

	public final void setAmountInPacket(int amountInPacket) {
		this.amountInPacket = amountInPacket;
	}

	public final String getClassOfCosmetic() {
		return classOfCosmetic;
	}

	public final void setClassOfCosmetic(String classOfCosmetic) {
		this.classOfCosmetic = classOfCosmetic;
	}

	public final float getCapacityInMl() {
		return capacityInMl;
	}

	public final void setCapacityInMl(float capacityInMl) {
		this.capacityInMl = capacityInMl;
	}

	public final PriceType getPriceInUAH() {
		return priceInUAH;
	}

	public final void setPriceInUAH(PriceType priceInUAH) {
		this.priceInUAH = priceInUAH;
	}

}
