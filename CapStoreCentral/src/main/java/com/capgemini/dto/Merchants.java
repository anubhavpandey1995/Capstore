package com.capgemini.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="merchants")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Merchants {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="merchant_id")
	private int merchantId;
	
	@Column(name="merchant_name")
	@NotBlank(message="This field can't be empty")
	private String merchantName;
	
	@Column(name="merchant_email")
	@NotBlank(message="This field can't be empty")
	private String merchantEmail;
	
	@Column(name="merchant_pswd")
	@Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")
	private String merchantPswd;
	
	@Column(name="merchant_mobile")
	@NotBlank(message="This field can't be empty")
	@Digits(integer=10,fraction=0,message="Length should be only 10" )	
	private String merchantMobile;
	
	@Column(name="merchant_type")
	private String merchanttype;
	
	@Column(name="merchant_address")
	@NotBlank(message="This field can't be empty")
	private String merchantAddress;
	
	@Column(name="merchant_rating")
	private double merchantRating;
	
	@Column(name="merchant_flag")
	private boolean merchantFlag;
	
	@ManyToMany(mappedBy="merchants")
	List<Products> listproducts;
	
	
	
	public Merchants() {
		super();
		merchantId=-1;
		// TODO Auto-generated constructor stub
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	public String getMerchantPswd() {
		return merchantPswd;
	}
	public void setMerchantPswd(String merchantPswd) {
		this.merchantPswd = merchantPswd;
	}
	public String getMerchantMobile() {
		return merchantMobile;
	}
	public void setMerchantMobile(String merchantMobile) {
		this.merchantMobile = merchantMobile;
	}
	public String getMerchanttype() {
		return merchanttype;
	}
	public void setMerchanttype(String merchanttype) {
		this.merchanttype = merchanttype;
	}
	public String getMerchantAddress() {
		return merchantAddress;
	}
	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}
	public double getMerchantRating() {
		return merchantRating;
	}
	public void setMerchantRating(double merchantRating) {
		this.merchantRating = merchantRating;
	}
	public boolean isMerchantFlag() {
		return merchantFlag;
	}
	public void setMerchantFlag(boolean merchantFlag) {
		this.merchantFlag = merchantFlag;
	}
	public boolean getMerchantFlag(){
		return this.merchantFlag;
	}

	@Override
	public String toString() {
		return "Merchants [merchantId=" + merchantId + ", merchantName=" + merchantName + ", merchantEmail="
				+ merchantEmail + ", merchantPswd=" + merchantPswd + ", merchantMobile=" + merchantMobile
				+ ", merchanttype=" + merchanttype + ", merchantAddress=" + merchantAddress + ", merchantRating="
				+ merchantRating + ", merchantFlag=" + merchantFlag + "]";
	}
}