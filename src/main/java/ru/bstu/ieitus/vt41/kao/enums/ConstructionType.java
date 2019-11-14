package ru.bstu.ieitus.vt41.kao.enums;

import lombok.Getter;
import ru.bstu.ieitus.vt41.kao.exceptions.IllegalConstructionTypeNumber;
import ru.bstu.ieitus.vt41.kao.model.*;

public enum ConstructionType {
    APARTMENT_HOUSE ("Многоквартирный дом"){
        @Override
        public ApartmentHouse create()
        {
            return new ApartmentHouse();
        }

    },
    PRIVATE_HOUSE("Частный дом"){
        @Override
        public PrivateHouse create()
        {
            return new PrivateHouse();
        }
    },
    SUPERMARKET ("Супермаркет"){
        @Override
        public Supermarket create()
        {
            return new Supermarket();
        }
    },
    BRIDGE("Мост") {
        @Override
        public Bridge create()
        {
            return new Bridge();
        }
    },
    TUNNEL ("Тоннель"){
        @Override
        public Tunnel create()
        {
            return new Tunnel();
        }
    };

    @Getter
    private String mName;
    ConstructionType(String name) {mName = name;}

    public abstract Construction create();

    public static ConstructionType getByIndex(int index){
        for(ConstructionType constructionType : ConstructionType.values())
        {
            if(constructionType.ordinal() == index)
            {
                return constructionType;
            }
        }
        throw new IllegalConstructionTypeNumber();
    }

    @Override
    public String toString()
    {
        return ordinal() + " - " + getMName() + "\n";
    }

    public static String show()
    {
        StringBuilder result = new StringBuilder();
        for(ConstructionType constructionType : ConstructionType.values())
        {
            result.append(constructionType.toString());
        }
        return result.toString();
    }
}
