package com.microprofile.PetStore;

import java.util.ArrayList;
import java.util.List;

public class PetTypeSingleton {

    private static PetTypeSingleton myInstance;
    public List<PetTypes> petTypes = new ArrayList<PetTypes>();
    PetTypes petTypes1 = new PetTypes();
    PetTypes petTypes2 = new PetTypes();
    PetTypes petTypes3 = new PetTypes();

    private PetTypeSingleton() {

        petTypes1.setPetTypeId(1);
        petTypes1.setPetType("Dogs");
        petTypes1.setPetsQuantity(10);

        petTypes2.setPetTypeId(2);
        petTypes2.setPetType("Cats");
        petTypes2.setPetsQuantity(8);

        petTypes3.setPetTypeId(3);
        petTypes3.setPetType("Birds");
        petTypes3.setPetsQuantity(15);

        petTypes.add(petTypes1);
        petTypes.add(petTypes2);
        petTypes.add(petTypes3);
    }
    public static PetTypeSingleton getInstance() {
        if (myInstance == null)
            myInstance = new PetTypeSingleton();
        return myInstance;
    }
    public void setArrayList(List<PetTypes> petTypes) {
        this.petTypes = petTypes;
    }
    public List<PetTypes> getArrayList() {
        return this.petTypes;
    }
}

