package de.melzer;

import de.hs_furtwangen.informatik.meldeauskunft.domain.Resident;
import de.hs_furtwangen.informatik.meldeauskunft.repository.ResidentRepository;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tizian Melzer on 29.05.2018.
 */
public class ResidentRepositoryStub implements ResidentRepository {
    public List<Resident> getResidents() {

        List<Resident> list = new LinkedList<Resident>();

        Resident resident1 = new Resident("Jan", "Knoblauch", "Banhofstrasse",
                "Furtwangen", new Date(2000,10,22));

        Resident resident2 = new Resident("Tizian", "Melzer", "Muellerweg",
                "Loerrach", new Date(1996, 06, 21));
        list.add(resident1);
        list.add(resident2);


        return list;
    }
}
