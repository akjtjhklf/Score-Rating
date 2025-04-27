package Danhgia;

import org.testng.annotations.*;
import org.testng.Assert;


public class TestDanhGia {
    ReadExcelFile excel;

    @BeforeClass
    public void setup() {
        System.out.println("Before all testcases");
        excel = new ReadExcelFile("./TestData1.xlsx");
    }

    @AfterClass
    public void teardown() {
        System.out.println("After all testcases");
    }

    @DataProvider(name = "diemChuData")
    public Object[][] getDiemChuData() {
        int rows = excel.getRowCount(0);
        Object[][] data = new Object[rows - 1][2];
        for (int i = 1; i < rows; i++) {
            data[i - 1][0] = excel.getNumericData(0, i, 0);
            data[i - 1][1] = excel.getStringData(0, i, 1);
        }
        return data;
    }

    @Test(dataProvider = "diemChuData")
    public void TestDiemChu(double input, String expected) {
        String actual = DanhGia.diemChu(input);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "xepHangData")
    public Object[][] getXepHangData() {
        int rows = excel.getRowCount(1);
        Object[][] data = new Object[rows - 1][2];
        for (int i = 1; i < rows; i++) {
            data[i - 1][0] = excel.getNumericData(1, i, 0);
            data[i - 1][1] = excel.getStringData(1, i, 1);
        }
        return data;
    }

    @Test(dataProvider = "xepHangData")
    public void TestXepHangTN(double input, String expected) {
        String actual = DanhGia.xepHangTN(input);
        Assert.assertEquals(actual, expected);
    }
}