package com.example.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.lang.Nullable;
@Entity
public class ToDoAlerte implements Serializable {
	
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ; 
	@Nullable
	private int numeroPlainte ;
	@Nullable
	private int casCRM;
	@Nullable
	private Date datePlainte ;
	@Nullable
	private int contact;
	@Nullable
	private int GSM ; 
	@Nullable
	private int nbrrec ;
	@Nullable
	private String gouvernerat ; 
	@Nullable
	private String delegation ;
	@Nullable
	private String callCentre ; 
	@Nullable
	private String etat ; 
	@Nullable
	private Date dateAffectation ; 
	@Nullable
	private String STT ; 
	@Nullable
	private Date dateResolution ; 
	@Nullable
	private String etatFinale ; 
	@Nullable
	private String cloture ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroPlainte() {
		return numeroPlainte;
	}
	public void setNumeroPlainte(int numeroPlainte) {
		this.numeroPlainte = numeroPlainte;
	}
	public int getCasCRM() {
		return casCRM;
	}
	public void setCasCRM(int casCRM) {
		this.casCRM = casCRM;
	}
	public Date getDatePlainte() {
		return datePlainte;
	}
	public void setDatePlainte(Date datePlainte) {
		this.datePlainte = datePlainte;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getGSM() {
		return GSM;
	}
	public void setGSM(int gSM) {
		GSM = gSM;
	}
	public int getNbrrec() {
		return nbrrec;
	}
	public void setNbrrec(int nbrrec) {
		this.nbrrec = nbrrec;
	}
	public String getGouvernerat() {
		return gouvernerat;
	}
	public void setGouvernerat(String gouvernerat) {
		this.gouvernerat = gouvernerat;
	}
	public String getDelegation() {
		return delegation;
	}
	public void setDelegation(String delegation) {
		this.delegation = delegation;
	}
	public String getCallCentre() {
		return callCentre;
	}
	public void setCallCentre(String callCentre) {
		this.callCentre = callCentre;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDateAffectation() {
		return dateAffectation;
	}
	public void setDateAffectation(Date dateAffectation) {
		this.dateAffectation = dateAffectation;
	}
	public String getSTT() {
		return STT;
	}
	public void setSTT(String sTT) {
		STT = sTT;
	}
	public Date getDateResolution() {
		return dateResolution;
	}
	public void setDateResolution(Date dateResolution) {
		this.dateResolution = dateResolution;
	}
	public String getEtatFinale() {
		return etatFinale;
	}
	public void setEtatFinale(String etatFinale) {
		this.etatFinale = etatFinale;
	}
	public String getCloture() {
		return cloture;
	}
	public void setCloture(String cloture) {
		this.cloture = cloture;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + GSM;
		result = prime * result + ((STT == null) ? 0 : STT.hashCode());
		result = prime * result + ((callCentre == null) ? 0 : callCentre.hashCode());
		result = prime * result + casCRM;
		result = prime * result + ((cloture == null) ? 0 : cloture.hashCode());
		result = prime * result + contact;
		result = prime * result + ((dateAffectation == null) ? 0 : dateAffectation.hashCode());
		result = prime * result + ((datePlainte == null) ? 0 : datePlainte.hashCode());
		result = prime * result + ((dateResolution == null) ? 0 : dateResolution.hashCode());
		result = prime * result + ((delegation == null) ? 0 : delegation.hashCode());
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + ((etatFinale == null) ? 0 : etatFinale.hashCode());
		result = prime * result + ((gouvernerat == null) ? 0 : gouvernerat.hashCode());
		result = prime * result + id;
		result = prime * result + nbrrec;
		result = prime * result + numeroPlainte;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ToDoAlerte other = (ToDoAlerte) obj;
		if (GSM != other.GSM)
			return false;
		if (STT == null) {
			if (other.STT != null)
				return false;
		} else if (!STT.equals(other.STT))
			return false;
		if (callCentre == null) {
			if (other.callCentre != null)
				return false;
		} else if (!callCentre.equals(other.callCentre))
			return false;
		if (casCRM != other.casCRM)
			return false;
		if (cloture == null) {
			if (other.cloture != null)
				return false;
		} else if (!cloture.equals(other.cloture))
			return false;
		if (contact != other.contact)
			return false;
		if (dateAffectation == null) {
			if (other.dateAffectation != null)
				return false;
		} else if (!dateAffectation.equals(other.dateAffectation))
			return false;
		if (datePlainte == null) {
			if (other.datePlainte != null)
				return false;
		} else if (!datePlainte.equals(other.datePlainte))
			return false;
		if (dateResolution == null) {
			if (other.dateResolution != null)
				return false;
		} else if (!dateResolution.equals(other.dateResolution))
			return false;
		if (delegation == null) {
			if (other.delegation != null)
				return false;
		} else if (!delegation.equals(other.delegation))
			return false;
		if (etat == null) {
			if (other.etat != null)
				return false;
		} else if (!etat.equals(other.etat))
			return false;
		if (etatFinale == null) {
			if (other.etatFinale != null)
				return false;
		} else if (!etatFinale.equals(other.etatFinale))
			return false;
		if (gouvernerat == null) {
			if (other.gouvernerat != null)
				return false;
		} else if (!gouvernerat.equals(other.gouvernerat))
			return false;
		if (id != other.id)
			return false;
		if (nbrrec != other.nbrrec)
			return false;
		if (numeroPlainte != other.numeroPlainte)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ToDoAlerte [id=" + id + ", numeroPlainte=" + numeroPlainte + ", casCRM=" + casCRM + ", datePlainte="
				+ datePlainte + ", contact=" + contact + ", GSM=" + GSM + ", nbrrec=" + nbrrec + ", gouvernerat="
				+ gouvernerat + ", delegation=" + delegation + ", callCentre=" + callCentre + ", etat=" + etat
				+ ", dateAffectation=" + dateAffectation + ", STT=" + STT + ", dateResolution=" + dateResolution
				+ ", etatFinale=" + etatFinale + ", cloture=" + cloture + "]";
	}
	public ToDoAlerte(int id, int numeroPlainte, int casCRM, Date datePlainte, int contact, int gSM, int nbrrec,
			String gouvernerat, String delegation, String callCentre, String etat, Date dateAffectation, String sTT,
			Date dateResolution, String etatFinale, String cloture) {
		super();
		this.id = id;
		this.numeroPlainte = numeroPlainte;
		this.casCRM = casCRM;
		this.datePlainte = datePlainte;
		this.contact = contact;
		GSM = gSM;
		this.nbrrec = nbrrec;
		this.gouvernerat = gouvernerat;
		this.delegation = delegation;
		this.callCentre = callCentre;
		this.etat = etat;
		this.dateAffectation = dateAffectation;
		STT = sTT;
		this.dateResolution = dateResolution;
		this.etatFinale = etatFinale;
		this.cloture = cloture;
	}
	public ToDoAlerte() {
		super();
	}
	
	
	
	
	
	
}
