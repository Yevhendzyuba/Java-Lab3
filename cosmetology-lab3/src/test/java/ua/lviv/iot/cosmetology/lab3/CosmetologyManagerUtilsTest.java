package ua.lviv.iot.cosmetology.lab3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.cosmetology.lab3.manager.CosmetologyManager;
import ua.lviv.iot.cosmetology.lab3.manager.CosmetologyManagerUtils;
import ua.lviv.iot.cosmetology.lab3.model.SortType;

public class CosmetologyManagerUtilsTest extends BaseCosmetologyManagerTest {

	private CosmetologyManager cosmetologyManager;

	@BeforeEach
	public void setUp() {

		cosmetologyManager = new CosmetologyManager();
		cosmetologyManager.addCosmetics(cosmetologyList);
	}

	@Test
	public void testSortByCapacity() {
		CosmetologyManagerUtils.sortByCapacity(cosmetologyList, SortType.ASCENDING);
	}

	@Test 
	public void testSortByAppoinmentFor() {
	 CosmetologyManagerUtils.sortByAppoinmentFor(cosmetologyList, SortType.ASCENDING);
	}
}
