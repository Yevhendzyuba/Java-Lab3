package ua.lviv.iot.cosmetology.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.cosmetology.lab3.manager.CosmetologyManager;
import ua.lviv.iot.cosmetology.lab3.model.AllCosmetology;
import ua.lviv.iot.cosmetology.lab3.model.PriceType;

class CosmetologyManagerTest extends BaseCosmetologyManagerTest {

	private CosmetologyManager cosmetologyManager;

	@BeforeEach
	public void setUp() {

		cosmetologyManager = new CosmetologyManager();
		AllCosmetology cosmetologyList = null;
		cosmetologyManager.addCosmetic(cosmetologyList);
	}

	@Test
	public  void testFindByPrice() {
		List<AllCosmetology> cosmetology = cosmetologyManager.findByPrice(PriceType.HIGHEST);
		assertEquals(2, cosmetology.size());

		assertEquals(PriceType.HIGHEST, cosmetology.get(0).getPriceInUAH());
		assertEquals(PriceType.HIGHEST, cosmetology.get(1).getPriceInUAH());

	}
}