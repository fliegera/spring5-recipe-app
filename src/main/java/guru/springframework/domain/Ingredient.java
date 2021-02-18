package guru.springframework.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient {

	public Ingredient() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private BigDecimal amount;

	public Ingredient(Long id, String description, BigDecimal amount, Recipe receipe) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.receipe = receipe;
	}

	@ManyToOne
	private Recipe receipe;

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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the receipe
	 */
	public Recipe getReceipe() {
		return receipe;
	}

	/**
	 * @param receipe the receipe to set
	 */
	public void setReceipe(Recipe receipe) {
		this.receipe = receipe;
	}

}
