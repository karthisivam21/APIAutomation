package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {

    @JsonProperty("Success")
	private boolean Success;
    
    @JsonProperty("Error")
	private String Error;
    
    @JsonProperty("Data")
	private Data Data	;

	
	
	public LoginResponse() {}

	

    public LoginResponse(boolean success, String error, com.api.models.response.LoginResponse.Data data) {
		super();
		Success = success;
		Error = error;
		Data = data;
	}



	@Override
	public String toString() {
		return "LoginResponse [Success=" + Success + ", Error=" + Error + ", Data=" + Data + "]";
	}



	public static class Data {
    	
	    @JsonProperty("AccessToken")
	    private String AccessToken;
	    
	    @JsonProperty("ExpiresAt")
		private String ExpiresAt;
	    
	    @JsonProperty("Id")
		private int Id;
	    
	    @JsonProperty("Email")
		private String Email;
	    
	    @JsonProperty("FullName")
		private String FullName;
	    
	    @JsonProperty("PhoneNumber")
		private String PhoneNumber;
		
		public Data() {}
		
		
		public Data(String accessToken, String expiresAt, int id, String email, String fullName, String phoneNumber) {
			super();
			AccessToken = accessToken;
			ExpiresAt = expiresAt;
			Id = id;
			Email = email;
			FullName = fullName;
			PhoneNumber = phoneNumber;
		}

		
		@Override
		public String toString() {
			return "Data [AccessToken=" + AccessToken + ", ExpiresAt=" + ExpiresAt + ", Id=" + Id + ", Email=" + Email
					+ ", FullName=" + FullName + ", PhoneNumber=" + PhoneNumber + "]";
		}


		public String getAccessToken() {
			return AccessToken;
		}
		public void setAccessToken(String accessToken) {
			AccessToken = accessToken;
		}
		public String getExpiresAt() {
			return ExpiresAt;
		}
		public void setExpiresAt(String expiresAt) {
			ExpiresAt = expiresAt;
		}
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getFullName() {
			return FullName;
		}
		public void setFullName(String fullName) {
			FullName = fullName;
		}
		public String getPhoneNumber() {
			return PhoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			PhoneNumber = phoneNumber;
		} 
		
		
    }



	public boolean isSuccess() {
		return Success;
	}



	public void setSuccess(boolean success) {
		Success = success;
	}



	public String getError() {
		return Error;
	}



	public void setError(String error) {
		Error = error;
	}



	public Data getData() {
		return Data;
	}



	public void setData(Data data) {
		Data = data;
	}
	
	
	
}
