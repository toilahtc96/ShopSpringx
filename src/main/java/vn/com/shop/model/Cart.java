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
@Table(name = "carts", uniqueConstraints = { @UniqueConstraint(columnNames = { "car_id" }) })
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id", length = 11, nullable = false, unique = true)
	private Integer carId;

	@Column(name = "car_user_id", nullable = true)
	private Integer carUserId;

	@Column(name = "car_list_product_quantity", length = 500, nullable = true)
	private String carListProductQuantity;

	@Column(name = "car_status", nullable = true)
	private Integer carStatus;

	@Column(name = "car_created_at", nullable = true)
	private Date carCreatedAt;

	@Column(name = "car_updated_at", nullable = true)
	private Date carUpdatedAt;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Integer carId, Integer carUserId, String carListProductQuantity, Integer carStatus, Date carCreatedAt,
			Date carUpdatedAt) {
		super();
		this.carId = carId;
		this.carUserId = carUserId;
		this.carListProductQuantity = carListProductQuantity;
		this.carStatus = carStatus;
		this.carCreatedAt = carCreatedAt;
		this.carUpdatedAt = carUpdatedAt;
	}

	@Override
	public String toString() {
		return "Cart [carId=" + carId + ", carUserId=" + carUserId + ", carListProductQuantity="
				+ carListProductQuantity + ", carStatus=" + carStatus + ", carCreatedAt=" + carCreatedAt
				+ ", carUpdatedAt=" + carUpdatedAt + "]";
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public Integer getCarUserId() {
		return carUserId;
	}

	public void setCarUserId(Integer carUserId) {
		this.carUserId = carUserId;
	}

	public String getCarListProductQuantity() {
		return carListProductQuantity;
	}

	public void setCarListProductQuantity(String carListProductQuantity) {
		this.carListProductQuantity = carListProductQuantity;
	}

	public Integer getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(Integer carStatus) {
		this.carStatus = carStatus;
	}

	public Date getCarCreatedAt() {
		return carCreatedAt;
	}

	public void setCarCreatedAt(Date carCreatedAt) {
		this.carCreatedAt = carCreatedAt;
	}

	public Date getCarUpdatedAt() {
		return carUpdatedAt;
	}

	public void setCarUpdatedAt(Date carUpdatedAt) {
		this.carUpdatedAt = carUpdatedAt;
	}

}
