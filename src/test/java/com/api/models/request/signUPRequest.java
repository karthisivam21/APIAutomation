package com.api.models.request;

public class signUPRequest {
	
	private String email;
	private String fullName;
	private String phoneNumber;
	private String password;
	private String confirmPassword;
	
	public signUPRequest(String email, String fullName, String phoneNumber, String password, String confirmPassword) {
		super();
		this.email = email;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "singUPRequest [email=" + email + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	public static class Builder{
		private String email;
		private String fullName;
		private String phoneNumber;
		private String password;
		private String confirmPassword;
		
		public String getEmail() {
			return email;
		}
		public Builder Email(String email) {
			this.email = email;
			return this;
		}

		public Builder FullName(String fullName) {
			this.fullName = fullName;
			return this;
		}

		public Builder PhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public Builder Password(String password) {
			this.password = password;
			return this;
		}

		public Builder ConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
			return this;
		}
		
		public signUPRequest build()
		{
			signUPRequest signupReq = new signUPRequest(email, fullName, phoneNumber, password, confirmPassword);
			return signupReq;
		}
		
		
	}

}
