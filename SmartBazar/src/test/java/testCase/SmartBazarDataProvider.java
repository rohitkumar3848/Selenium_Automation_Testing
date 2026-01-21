package testCase;

import org.testng.annotations.DataProvider;
import org.utils.ExcelUtil;

public class SmartBazarDataProvider {

    @DataProvider(name = "productData",parallel = false)
    public static Object[][] getProductData() {
        return ExcelUtil.getExcelData(
                "SmartBazarTestData.xlsx",
                "Products"
        );
    }

}
