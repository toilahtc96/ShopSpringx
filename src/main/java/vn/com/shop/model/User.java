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
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "use_id" }) })
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "use_id", length = 11, nullable = false, unique = true)
	private Integer userId;

	@Column(name = "use_email", length = 50, nullable = true)
	private String userEmail;

	@Column(name = "use_name", length = 50, nullable = false)
	private String userName;

	@Column(name = "use_phone", length = 20, nullable = true)
	private String userPhone;

	@Column(name = "use_password", length = 20, nullable = false)
	private String userPassword;

	@Column(name = "use_active", nullable = true)
	private Integer userActive;

	@Column(name = "use_birthday", nullable = true)
	private Date userBirthday;

	@Column(name = "use_gender", nullable = true)
	private Integer userGender;

	@Column(name = "use_avarta", length = 50, nullable = true)
	private String userAvarta;

	@Column(name = "use_facebook", length = 50, nullable = true)
	private String userFacebook;

	@Column(name = "use_create_time", nullable = true)
	private Date userCreateTime;

	@Column(name = "use_update_time", nullable = true)
	private Date userUpdateTime;

	@Column(name = "use_address", length = 50, nullable = true)
	private String userAddress;

	@Column(name = "use_shop_address", length = 50, nullable = true)
	private String userShopAddress;

	@Column(name = "use_role", nullable = true)
	private Integer userRole;

	
	public Integer getUserRole() {
		return userRole;
	}

	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}

	public User() {

	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserActive() {
		return userActive;
	}

	public void setUserActive(Integer userActive) {
		this.userActive = userActive;
	}

	public Date getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}

	public Integer getUserGender() {
		return userGender;
	}

	public void setUserGender(Integer userGender) {
		this.userGender = userGender;
	}

	public String getUserAvarta() {
		return userAvarta;
	}

	public void setUserAvarta(String userAvarta) {
		this.userAvarta = userAvarta;
	}

	public String getUserFacebook() {
		return userFacebook;
	}

	public void setUserFacebook(String userFacebook) {
		this.userFacebook = userFacebook;
	}

	public Date getUserCreateTime() {
		return userCreateTime;
	}

	public void setUserCreateTime(Date userCreateTime) {
		this.userCreateTime = userCreateTime;
	}

	public Date getUserUpdateTime() {
		return userUpdateTime;
	}

	public void setUserUpdateTime(Date userUpdateTime) {
		this.userUpdateTime = userUpdateTime;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserShopAddress() {
		return userShopAddress;
	}

	public void setUserShopAddress(String userShopAddress) {
		this.userShopAddress = userShopAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmail=" + userEmail + ", userName=" + userName + ", userPhone="
				+ userPhone + ", userPassword=" + userPassword + ", userActive=" + userActive + ", userBirthday="
				+ userBirthday + ", userGender=" + userGender + ", userAvarta=" + userAvarta + ", userFacebook="
				+ userFacebook + ", userCreateTime=" + userCreateTime + ", userUpdateTime=" + userUpdateTime
				+ ", userAddress=" + userAddress + ", userShopAddress=" + userShopAddress + "]";
	}

	public User(Integer userId, String userEmail, String userName, String userPhone, String userPassword,
			Integer userActive, Date userBirthday, Integer userGender, String userAvarta, String userFacebook,
			Date userCreateTime, Date userUpdateTime, String userAddress, String userShopAddress) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userPassword = userPassword;
		this.userActive = userActive;
		this.userBirthday = userBirthday;
		this.userGender = userGender;
		this.userAvarta = userAvarta;
		this.userFacebook = userFacebook;
		this.userCreateTime = userCreateTime;
		this.userUpdateTime = userUpdateTime;
		this.userAddress = userAddress;
		this.userShopAddress = userShopAddress;
	}

}
