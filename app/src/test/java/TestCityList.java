import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestCityList {

    static CustomList list;

    @Before
    public void createList(){

        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest(){
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest(){
        int listSize = list.getCount();
        City city = new City("Halifax", "NS");
        list.addCity(city);
        assertEquals(list.getCount(), listSize+1);
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize);
    }


}
