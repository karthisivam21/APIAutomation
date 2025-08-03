package com.api.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class signUpResponse {

    @JsonProperty("Success")
	private boolean Success;
    
    @JsonProperty("Error")
	private String Error;
    
    @JsonProperty("Data")
	private Data Data	;

	
	
	public signUpResponse() {}

    public signUpResponse(boolean success, String error, com.api.models.response.signUpResponse.Data data) {
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
    	
	    @JsonProperty("Id")
	    private int Id;
	    
	    @JsonProperty("Email")
		private String Email;
	    
	    @JsonProperty("FullName")
		private String FullName;
	    
	    @JsonProperty("PhoneNumber")
		private String PhoneNumber;
		
		public Data() {}

		public Data(int id, String email, String fullName, String phoneNumber) {
			super();
			Id = id;
			Email = email;
			FullName = fullName;
			PhoneNumber = phoneNumber;
		}

		@Override
		public String toString() {
			return "Data [Id=" + Id + ", Email=" + Email + ", FullName=" + FullName + ", PhoneNumber=" + PhoneNumber
					+ "]";
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
