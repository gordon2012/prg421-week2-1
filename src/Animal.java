/**
 * Title:          ArrayLists (Animal Catalog) - Week 3 Team Improvements
 * Author:         Team B - ( Elijah Cornell / Eric Landeis / Gordon Doskas /
 *                          James Rippon / Joseph Hart / Keith Green / Lance Branford )
 * Creation Date:  2016-02-05
 * Class:          PRG/421 - Roland Morales
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Animal object which contains a list of characteristic values
 */
public class Animal implements Serializable {

    /**
     * Animal name
     */
    private String name;

    /**
     * Listing the animal's characteristic values
     */
    private List<Characteristic> characteristicList;

    /**
     * Default constructor - Sets list known characteristic types
     */
    public Animal() {

        // Set default characteristics

        characteristicList = new ArrayList<Characteristic>();

        characteristicList.add(new CharacteristicString("Color", "is"));
        characteristicList.add(new CharacteristicBoolean("Fly", "Can", "Cannot"));
        characteristicList.add(new CharacteristicBoolean("Swim", "Can", "Cannot"));
        characteristicList.add(new CharacteristicBoolean("Vertebrate", "Is a", "Is not a"));

    }

    /**
     * @return Animal name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Animal name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Listing of the animal's characteristic values
     */
    public List<Characteristic> getCharacteristicList() {
        return characteristicList;
    }
}
