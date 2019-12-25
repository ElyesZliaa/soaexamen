package resource;

import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import entities.InfoSante;

@WebService(name="InfoService" , targetNamespace="https://www.suiviEnfants.tn")
@Remote
public interface InfoServiceRemote {

	@WebMethod
	@WebResult(name="Vaccin")
	public String[] recuperListVaccins(@WebParam(name="Age")long age);
	@WebMethod
	@WebResult(name="Vaccin")
	public String[] veriftypenourriture(@WebParam(name="Age")long age,@WebParam(name="Nourriture") String typeNourriture);	
	
	@WebMethod
	@WebResult(name="detailsEnfant")
	public InfoSante recupererDetailsByAge(@WebParam(name="Age")long age);	
	
		
}
