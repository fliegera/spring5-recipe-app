package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String decription;

	public UnitOfMeasure() {
		super();
	}

	public UnitOfMeasure(Long id, String decription) {
		super();
		this.id = id;
		this.decription = decription;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the decription
	 */
	public String getDecription() {
		return decription;
	}

	/**
	 * @param decription the decription to set
	 */
	public void setDecription(String decription) {
		this.decription = decription;
	}

}
