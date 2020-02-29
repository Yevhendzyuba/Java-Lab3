package ua.lviv.iot.cosmetology.lab3.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.cosmetology.lab3.model.AllCosmetology;
import ua.lviv.iot.cosmetology.lab3.model.PriceType;

public class CosmetologyManager {

	private List<AllCosmetology> cosmetologyList = new LinkedList<>();

	public CosmetologyManager(List<AllCosmetology> cosmetologyList) {

		this.cosmetologyList = cosmetologyList;
	}

	public CosmetologyManager() {

	}

	public void addCosmetic(AllCosmetology addObject) {
		this.cosmetologyList.add(addObject);
	}

	public void addCosmetics(List<AllCosmetology> addObjects) {
		this.cosmetologyList.addAll(addObjects);
	}

	public List<AllCosmetology> findByPrice(PriceType priceType) {
		List<AllCosmetology> foundItems = new LinkedList<>();

		for (AllCosmetology cosmetology : cosmetologyList) {
			if (cosmetology.getPriceInUAH() == priceType) {
				foundItems.add(cosmetology);
			}
		}

		return foundItems;
	}

}
