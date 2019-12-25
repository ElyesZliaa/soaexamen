package entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="infoEnfants")
public class InfoSante implements Serializable {

	private long age;
	private float poids ; 
	private float taille ; 
	private String typeNourriture;
	private String[] vaccins;
	private int eveil;
	
	public InfoSante() {
		
	}
	
	
	public InfoSante(String[] vaccins) {
		super();
		this.vaccins = vaccins;
	}


	public InfoSante(long age, float poids, float taille, String typeNourriture, String[] vaccins, int eveil) {
		super();
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.typeNourriture = typeNourriture;
		this.vaccins = vaccins;
		this.eveil = eveil;
	}

	public long getAge() {
		return age;
	}
	
	@XmlAttribute(name="Age")
	public void setAge(long age) {
		this.age = age;
	}
	
	public float getPoids() {
		return poids;
	}
	
	@XmlElement(name="poids")
	public void setPoids(float poids) {
		this.poids = poids;
	}
	
	public float getTaille() {
		return taille;
	}
	@XmlElement(name="taille")
	public void setTaille(float taille) {
		this.taille = taille;
	}
	
	public String getTypeNourriture() {
		return typeNourriture;
	}
	@XmlElement(name="typeNourriture",required=true)
	public void setTypeNourriture(String typeNourriture) {
		this.typeNourriture = typeNourriture;
	}
	
	public String[] getVaccins() {
		return vaccins;
	}
	@XmlElement(name="vaccins")
	public void setVaccins(String[] vaccins) {
		this.vaccins = vaccins;
	}
	
	public int getEveil() {
		return eveil;
	}
	
	@XmlElement(name="eveil")
	public void setEveil(int eveil) {
		this.eveil = eveil;
	}
	
	
}
