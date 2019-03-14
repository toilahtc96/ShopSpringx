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
@Table(name = "orders", uniqueConstraints = { @UniqueConstraint(columnNames = { "ord_id" }) })
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ord_id", length = 11, nullable = false, unique = true)
	private Integer orderId;

	@Column(name = "ord_user_id", length = 20, nullable = false)
	private Integer orderUserId;

	@Column(name = "ord_total_price", length = 5, nullable = true)
	private Float orderTotalFrice;

	@Column(name = "ord_status", length = 5, nullable = true)
	private Integer orderStatus;

	@Column(name = "ord_created_at", length = 5, nullable = true)
	private Date orderCreatedAt;

	@Column(name = "ord_updated_at", length = 5, nullable = true)
	private Date orderUpdatedAt;

	public Order() {
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderUserId() {
		return orderUserId;
	}

	public void setOrderUserId(Integer orderUserId) {
		this.orderUserId = orderUserId;
	}

	public Float getOrderTotalFrice() {
		return orderTotalFrice;
	}

	public void setOrderTotalFrice(Float orderTotalFrice) {
		this.orderTotalFrice = orderTotalFrice;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderCreatedAt() {
		return orderCreatedAt;
	}

	public void setOrderCreatedAt(Date orderCreatedAt) {
		this.orderCreatedAt = orderCreatedAt;
	}

	public Date getOrderUpdatedAt() {
		return orderUpdatedAt;
	}

	public void setOrderUpdatedAt(Date orderUpdatedAt) {
		this.orderUpdatedAt = orderUpdatedAt;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderUserId=" + orderUserId + ", orderTotalFrice=" + orderTotalFrice
				+ ", orderStatus=" + orderStatus + ", orderCreatedAt=" + orderCreatedAt + ", orderUpdatedAt="
				+ orderUpdatedAt + "]";
	}

	public Order(Integer orderId, Integer orderUserId, Float orderTotalFrice, Integer orderStatus, Date orderCreatedAt,
			Date orderUpdatedAt) {
		super();
		this.orderId = orderId;
		this.orderUserId = orderUserId;
		this.orderTotalFrice = orderTotalFrice;
		this.orderStatus = orderStatus;
		this.orderCreatedAt = orderCreatedAt;
		this.orderUpdatedAt = orderUpdatedAt;
	}

}