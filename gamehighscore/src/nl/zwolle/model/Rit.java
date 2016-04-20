package nl.zwolle.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author reindert
 *
 * Een entiteit voor het vastleggen van mijn kilometerregistratie voor autoritten.
 */
@Entity
public class Rit {

	private Long id;
	private String naam;
	private BigDecimal start;


	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	public Long getId() {
	    return id;
	}
	
	
	public Rit(){}
	
	public void setId(Long id){
		this.id = id;
	}
	
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public BigDecimal getStart() {
		return start;
	}

	public void setStart(BigDecimal start) {
		this.start = start;
	}


	@Override
	public String toString(){
		return this.naam;
	}
}
