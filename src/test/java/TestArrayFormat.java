import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayFormat {
    @DataProvider(name = "test1")
    public static Object[][] testData(){
        int[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int[] arrAsc = {-9, -7, -3, -2, 0, 2, 4, 5, 6, 8};
        return new Object[][]{
                {arr,arrAsc}};
    }
    @DataProvider(name = "test2")
    public static Object[][] testData2(){
        int[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int[] arrDesc = {8, 6, 5, 4, 2, 0, -2, -3, -7, -9};
        return new Object[][]{
                {arr,arrDesc}};
    }
    @DataProvider(name = "test3")
    public static Object[][] testData3(){
        Integer[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        String str = "2,5,-2,6,-3,8,0,-7,-9,4";
        return new Object[][]{
                {arr,str}};
    }
    @DataProvider(name = "test4")
    public static Object[][] testData4(){
        Integer[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        String str2 = "2 5 -2 6 -3 8 0 -7 -9 4";
        return new Object[][]{
                {arr,str2}};
    }
    @DataProvider(name = "test5")
    public static Object[][] testData5(){
        int[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        return new Object[][]{
                {arr,8,5}};
    }
    @DataProvider(name = "test6")
    public static Object[][] testData6(){
        int[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        int[] dest= { 2, 5, -2, 6, -3, 9, 8, 0, -7, -9, 4 };
        return new Object[][]{
                {arr,9,5,dest}};
    }
    @Test(dataProvider="test1",enabled = false)
    public void testSortByAsc(int[] arr,int[] arrAsc){
        ArrayFormat.sortByAsc(arr);
        Assert.assertEquals(arrAsc,arr,"sortByAsc fail");
    }
    @Test(dataProvider="test1",enabled = false)
    public void testBubbleSortByAsc(int[] arr,int[] arrAsc){
        ArrayFormat.sortBubbleByAsc(arr);
        System.out.println(Arrays.toString(arr));
        Assert.assertEquals(arrAsc,arr,"sortBubbleByAsc fail");
    }
    @Test(dataProvider="test1")
    public void testSelectSortByAsc(int[] arr,int[] arrAsc){
        System.out.println(Arrays.toString(arr));
        ArrayFormat.sortSelectByAsc(arr);
        System.out.println(Arrays.toString(arr));
        Assert.assertEquals(arrAsc,arr,"sortSelectByAsc fail");
    }

    @Test(dataProvider="test1")
    public void testInsertSortByAsc(int[] arr,int[] arrAsc){
        System.out.println(Arrays.toString(arr));
        ArrayFormat.sortInsertByAsc(arr);
        System.out.println(Arrays.toString(arr));
        Assert.assertEquals(arrAsc,arr,"sortInsertByAsc fail");
    }
    @Test(dataProvider="test2",enabled = false)
    public void testSortByDesc(int[] arr,int[] arrAsc){
        ArrayFormat.sortByDesc(arr);
        Assert.assertEquals(arrAsc,arr,"sortByDesc fail");
    }
    @Test(dataProvider = "test3",enabled = false)
    public void testJoin(Integer[] arr,String str){
        String strRe= ArrayFormat.join(arr);
        Assert.assertEquals(str,strRe,"test arrayFormat.join fail");
    }
    @Test(dataProvider = "test4",enabled = false)
    public void testJoin2(Integer[] arr,String str){
        String strRe= ArrayFormat.join(arr," ");
        Assert.assertEquals(str,strRe,"test arrayFormat.join2 fail");
    }

    @Test(dataProvider="test5")
    public void testIndexOf(int[] arr,int ele,int index){
        System.out.println( ArrayFormat.indexOf(arr,ele));
        Assert.assertEquals(index,ArrayFormat.indexOf(arr,ele),"IndexOf fail");
    }
    @Test(dataProvider = "test6")
    public void testInsert(int[] arr,int ele, int index, int[] dest){
        Assert.assertEquals(dest,ArrayFormat.insert(arr,ele,index),"testInsert failed");
        System.out.println(Arrays.toString(ArrayFormat.insert(arr,ele,index)));
    }
}
