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
@Table(name = "order_detail", uniqueConstraints = { @UniqueConstraint(columnNames = { "ordet_id" }) })
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ordet_id", length = 11, nullable = false, unique = true)
	private Integer ordetId;

	@Column(name = "ordet_order_id", nullable = true)
	private Integer ordetOrderId;

	@Column(name = "ordet_product_id", nullable = true)
	private Integer ordetProductId;

	@Column(name = "ordet_quantity", nullable = true)
	private Integer ordetQuantity;

	@Column(name = "ordet_status", nullable = true)
	private Integer ordetStatus;

	@Column(name = "ordet_note", length = 50, nullable = true)
	private String ordetNote;

	@Column(name = "ordet_created_at", nullable = true)
	private Date ordetCreatedAt;

	@Column(name = "ordet_updated_at", nullable = true)
	private Date ordetUpdatedAt;

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetail(Integer ordetId, Integer ordetOrderId, Integer ordetProductId, Integer ordetQuantity,
			Integer ordetStatus, String ordetNote, Date ordetCreatedAt, Date ordetUpdatedAt) {
		super();
		this.ordetId = ordetId;
		this.ordetOrderId = ordetOrderId;
		this.ordetProductId = ordetProductId;
		this.ordetQuantity = ordetQuantity;
		this.ordetStatus = ordetStatus;
		this.ordetNote = ordetNote;
		this.ordetCreatedAt = ordetCreatedAt;
		this.ordetUpdatedAt = ordetUpdatedAt;
	}

	@Override
	public String toString() {
		return "OderDetail [ordetId=" + ordetId + ", ordetOrderId=" + ordetOrderId + ", ordetProductId="
				+ ordetProductId + ", ordetQuantity=" + ordetQuantity + ", ordetStatus=" + ordetStatus + ", ordetNote="
				+ ordetNote + ", ordetCreatedAt=" + ordetCreatedAt + ", ordetUpdatedAt=" + ordetUpdatedAt + "]";
	}

	public Integer getOrdetId() {
		return ordetId;
	}

	public void setOrdetId(Integer ordetId) {
		this.ordetId = ordetId;
	}

	public Integer getOrdetOrderId() {
		return ordetOrderId;
	}

	public void setOrdetOrderId(Integer ordetOrderId) {
		this.ordetOrderId = ordetOrderId;
	}

	public Integer getOrdetProductId() {
		return ordetProductId;
	}

	public void setOrdetProductId(Integer ordetProductId) {
		this.ordetProductId = ordetProductId;
	}

	public Integer getOrdetQuantity() {
		return ordetQuantity;
	}

	public void setOrdetQuantity(Integer ordetQuantity) {
		this.ordetQuantity = ordetQuantity;
	}

	public Integer getOrdetStatus() {
		return ordetStatus;
	}

	public void setOrdetStatus(Integer ordetStatus) {
		this.ordetStatus = ordetStatus;
	}

	public String getOrdetNote() {
		return ordetNote;
	}

	public void setOrdetNote(String ordetNote) {
		this.ordetNote = ordetNote;
	}

	public Date getOrdetCreatedAt() {
		return ordetCreatedAt;
	}

	public void setOrdetCreatedAt(Date ordetCreatedAt) {
		this.ordetCreatedAt = ordetCreatedAt;
	}

	public Date getOrdetUpdatedAt() {
		return ordetUpdatedAt;
	}

	public void setOrdetUpdatedAt(Date ordetUpdatedAt) {
		this.ordetUpdatedAt = ordetUpdatedAt;
	}

}
