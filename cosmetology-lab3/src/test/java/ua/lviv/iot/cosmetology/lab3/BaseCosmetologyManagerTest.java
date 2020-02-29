package ua.lviv.iot.cosmetology.lab3;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.cosmetology.lab3.model.AllCosmetology;
import ua.lviv.iot.cosmetology.lab3.model.Mask;
import ua.lviv.iot.cosmetology.lab3.model.Powder;
import ua.lviv.iot.cosmetology.lab3.model.PriceType;
import ua.lviv.iot.cosmetology.lab3.model.Scrub;

public abstract class BaseCosmetologyManagerTest {

	protected List<AllCosmetology> cosmetologyList;

	@BeforeEach
	public void createCosmetology() {

		cosmetologyList = new LinkedList<AllCosmetology>();

		cosmetologyList.add(new Mask(PriceType.HIGHEST, 2000));
		cosmetologyList.add(new Scrub(PriceType.LOWEST, 900));
		cosmetologyList.add(new Powder(PriceType.HIGHEST, 2600));

	}

}
