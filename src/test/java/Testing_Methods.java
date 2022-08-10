import com.tsi.training.Bat;
import com.tsi.training.Cat;
import com.tsi.training.Penguin;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Testing_Methods {

    @Test
    public void get_cat_name() {

        Cat cat = new Cat();

        assertEquals("Ginger", cat.getName(), cat.getName());
    }

    @Test
    public void get_bat_flying(){

        Bat bat = new Bat();

        assertEquals("I'm flying!!", bat.flying());
    }

    @Test
    public void get_bird_layingEgg() {

        Penguin penguin = new Penguin();

        assertEquals("I'm laying an egg!!", penguin.getLayEgg());
    }

    @Test
    public void get_penguin_swimming() {

        Penguin penguin = new Penguin();

        assertEquals("I'm swimming!!", penguin.swim());
    }
}
