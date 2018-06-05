package de.melzer;


import de.hs_furtwangen.informatik.meldeauskunft.repository.ResidentRepository;
import de.hs_furtwangen.informatik.meldeauskunft.service.BaseResidentService;
import org.hamcrest.*;

/**
 * Created by Tizian Melzer on 29.05.2018.
 */

public class BaseResidentServiceTest {

    public void testTransfer(){
        BaseResidentService residentService = new BaseResidentService();
        ResidentRepository stub = new ResidentRepositoryStub();

        residentService.setResidentRepository(new ResidentRepositoryStub());


         residentService.getFilteredResidentsList(stub.getResidents().get(0));
    }




}
