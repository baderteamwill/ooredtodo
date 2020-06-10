package com.example.services.imp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.ls.LSInput;

import com.example.domain.ToDoAlerte;
import com.example.domain.User;
import com.example.repository.toDoListRepository;

@Service
public class ToDoAlerteService {
@Autowired
private toDoListRepository ToDoAlertePep;
	
	
	public List<ToDoAlerte> findAll() {
		// TODO Auto-generated method stub
		return ToDoAlertePep.findAll();
	} 
	
	public ToDoAlerte save(ToDoAlerte databaseModel) {
	
return ToDoAlertePep.save(databaseModel);		
	}	
	
	
	
	@Transactional
	public void update (int id ,ToDoAlerte alerte) 
	{DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(format.format(date));
		ToDoAlerte projectManagedEntity = ToDoAlertePep.findById(id);
		if(projectManagedEntity == null){
			throw new NoResultException();
		}
		projectManagedEntity.setCasCRM(alerte.getCasCRM());
		projectManagedEntity.setCallCentre(alerte.getCallCentre());
		projectManagedEntity.setCloture("non_cloture");
		projectManagedEntity.setContact(alerte.getContact());
		projectManagedEntity.setDateAffectation(new Date());
		projectManagedEntity.setDatePlainte(alerte.getDatePlainte());
		projectManagedEntity.setDateResolution(alerte.getDateResolution());
		projectManagedEntity.setDelegation(alerte.getDelegation());
		projectManagedEntity.setEtat(alerte.getEtat());
		projectManagedEntity.setEtatFinale(alerte.getEtatFinale());
		projectManagedEntity.setGouvernerat(alerte.getGouvernerat());
		projectManagedEntity.setGSM(alerte.getGSM());
		projectManagedEntity.setNbrrec(alerte.getNbrrec());
		projectManagedEntity.setNumeroPlainte(alerte.getNumeroPlainte());
		projectManagedEntity.setSTT(alerte.getSTT());

		
		
		
		
		
	}
	
	
	
	public List<ToDoAlerte> alllist(String test)
	{
		List<ToDoAlerte> list  = new ArrayList<ToDoAlerte>();
		List<ToDoAlerte> l  = new ArrayList<ToDoAlerte>();

		for (int i=0;i<findAll().size();i++)
		{
			if (findAll().get(i).getSTT().equalsIgnoreCase(test))
			{
				list.add(findAll().get(i));
			}
			
		}
		for (int j=0;j<list.size();j++)
		{
			
			if(list.get(j).getCloture().equalsIgnoreCase("non_cloture"))
					{
				l.add(list.get(j));
					}
			
			
		}
		return l ;
		
		
		
	}
	
	@Transactional
	public void upda (int id ,ToDoAlerte alerte) 
	{DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(format.format(date));
		ToDoAlerte projectManagedEntity = ToDoAlertePep.findById(id);
		if(projectManagedEntity == null){
			throw new NoResultException();
		}
		projectManagedEntity.setCasCRM(alerte.getCasCRM());
		projectManagedEntity.setCallCentre(alerte.getCallCentre());
		projectManagedEntity.setCloture("cloture");
		projectManagedEntity.setContact(alerte.getContact());
		projectManagedEntity.setDateAffectation(alerte.getDateAffectation());
		projectManagedEntity.setDatePlainte(alerte.getDatePlainte());
		projectManagedEntity.setDateResolution(new Date());
		projectManagedEntity.setDelegation(alerte.getDelegation());
		projectManagedEntity.setEtat(alerte.getEtat());
		projectManagedEntity.setEtatFinale(alerte.getEtatFinale());
		projectManagedEntity.setGouvernerat(alerte.getGouvernerat());
		projectManagedEntity.setGSM(alerte.getGSM());
		projectManagedEntity.setNbrrec(alerte.getNbrrec());
		projectManagedEntity.setNumeroPlainte(alerte.getNumeroPlainte());
		projectManagedEntity.setSTT(alerte.getSTT());

		
		
		
		
		
	}
	
	
	public List<ToDoAlerte>chercher(String test)
	{
		List<ToDoAlerte>list = new ArrayList<ToDoAlerte>();
		for (int i= 0 ;i<findAll().size();i++)
		{
			if(findAll().get(i).getCloture().equalsIgnoreCase(test))
			{
				list.add(findAll().get(i));
				
			}
			
			
		}
		
		return list;
		
	}
	
	
	public int somme(String test) {
		
		
		return chercher(test).size();
		
	}
	
	
	public List<ToDoAlerte>trouver (String test)
	{
		
		List<ToDoAlerte>list = new ArrayList<ToDoAlerte>();
		for (int i =0;i<findAll().size();i++)
		{
			if (findAll().get(i).getSTT().equalsIgnoreCase(test))
			{
				
				list.add(findAll().get(i));
				
				
				
			}
			
		}
		
		
		return list ;
	}
	
	public List<ToDoAlerte>search(String test,Date date1,Date date2)
	
	{List<ToDoAlerte>l = new ArrayList<ToDoAlerte>();
		List<ToDoAlerte>list = trouver(test) ;
		for (int i=0;i<list.size();i++)
		{
			if (list.get(i).getDateAffectation().after(date1)&&(list.get(i).getDateAffectation().before(date2)))
			{
				
				l.add(list.get(i));
			}
			
			
			
		}
		
		
		
		
		
		
		return l;
	}
	
	
	
	public void delete(int id )
	{
		
		ToDoAlertePep.deleteById(id);
		
	}
	
	
	
	
}
