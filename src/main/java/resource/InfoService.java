package resource;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

import entities.InfoSante;

/**
 * Session Bean implementation class InfoService
 */
@WebService
@Stateless
@LocalBean
public class InfoService implements InfoServiceRemote {

	String[] tab= {"aa","bb","cc"};
	InfoSante infoSante = new InfoSante(1L,15.0f,10.f,"Fruit , Legumes , viande , poisson ",tab,10);
	List<InfoSante> lst= new ArrayList<InfoSante>();
	
	
    /**
     * Default constructor. 
     */
    public InfoService() {
    	String[] tab2= {"Rougeole , oreilllons"};
    	lst.add(infoSante);
    	lst.add(new InfoSante(1L,15.0f,10.f,"Fruit , Legumes , viansde , poisson ",tab2,10));
    }

	@Override
	public String[] recuperListVaccins(long age) {
		// TODO Auto-generated method stub
		return lst.get(0).getVaccins();
	}

	@Override
	public String[] veriftypenourriture(long age, String typeNourriture) {
		// TODO Auto-generated method stub
		return lst.get(0).getVaccins();
	}

	@Override
	public InfoSante recupererDetailsByAge(long age) {
		// TODO Auto-generated method stub
		return lst.get(1);
	}

}
