package vn.com.shop.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "product_comment", uniqueConstraints = { @UniqueConstraint(columnNames = { "pco_id" }) })
public class ProductComment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pco_id", length = 11, nullable = false, unique = true)
	private Integer pcoId;

	@Column(name = "pco_product_id", nullable = true)
	private Integer pcoProductId;

	@Column(name = "pco_user_id", nullable = true)
	private Integer pcoUserId;

	@Column(name = "pco_content", nullable = true)
	private Integer pcoContent;

	@Column(name = "pco_status", length = 500, nullable = true)
	private String pcoStatus;

	@Column(name = "pco_active", nullable = true)
	private Integer pcoActive;

	@Column(name = "pco_like", nullable = true)
	private Integer pcoLike;

	@Column(name = "pco_created_at", nullable = true)
	private Date pcoCreatedAt;

	@Column(name = "pco_updated_at", nullable = true)
	private Date pcoUpdatedAt;

	public ProductComment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductComment(Integer pcoId, Integer pcoProductId, Integer pcoUserId, Integer pcoContent, String pcoStatus,
			Integer pcoActive, Integer pcoLike, Date pcoCreatedAt, Date pcoUpdatedAt) {
		super();
		this.pcoId = pcoId;
		this.pcoProductId = pcoProductId;
		this.pcoUserId = pcoUserId;
		this.pcoContent = pcoContent;
		this.pcoStatus = pcoStatus;
		this.pcoActive = pcoActive;
		this.pcoLike = pcoLike;
		this.pcoCreatedAt = pcoCreatedAt;
		this.pcoUpdatedAt = pcoUpdatedAt;
	}

	@Override
	public String toString() {
		return "ProductComment [pcoId=" + pcoId + ", pcoProductId=" + pcoProductId + ", pcoUserId=" + pcoUserId
				+ ", pcoContent=" + pcoContent + ", pcoStatus=" + pcoStatus + ", pcoActive=" + pcoActive + ", pcoLike="
				+ pcoLike + ", pcoCreatedAt=" + pcoCreatedAt + ", pcoUpdatedAt=" + pcoUpdatedAt + "]";
	}

	public Integer getPcoId() {
		return pcoId;
	}

	public void setPcoId(Integer pcoId) {
		this.pcoId = pcoId;
	}

	public Integer getPcoProductId() {
		return pcoProductId;
	}

	public void setPcoProductId(Integer pcoProductId) {
		this.pcoProductId = pcoProductId;
	}

	public Integer getPcoUserId() {
		return pcoUserId;
	}

	public void setPcoUserId(Integer pcoUserId) {
		this.pcoUserId = pcoUserId;
	}

	public Integer getPcoContent() {
		return pcoContent;
	}

	public void setPcoContent(Integer pcoContent) {
		this.pcoContent = pcoContent;
	}

	public String getPcoStatus() {
		return pcoStatus;
	}

	public void setPcoStatus(String pcoStatus) {
		this.pcoStatus = pcoStatus;
	}

	public Integer getPcoActive() {
		return pcoActive;
	}

	public void setPcoActive(Integer pcoActive) {
		this.pcoActive = pcoActive;
	}

	public Integer getPcoLike() {
		return pcoLike;
	}

	public void setPcoLike(Integer pcoLike) {
		this.pcoLike = pcoLike;
	}

	public Date getPcoCreatedAt() {
		return pcoCreatedAt;
	}

	public void setPcoCreatedAt(Date pcoCreatedAt) {
		this.pcoCreatedAt = pcoCreatedAt;
	}

	public Date getPcoUpdatedAt() {
		return pcoUpdatedAt;
	}

	public void setPcoUpdatedAt(Date pcoUpdatedAt) {
		this.pcoUpdatedAt = pcoUpdatedAt;
	}

	
}
