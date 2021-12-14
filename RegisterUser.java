package caclass;

	import java.sql.Date;
	import java.util.Objects;

	public class RegisterUser {
	    private int userId;
	    private String userName;
	    private String email;
	    private int mobileNumber;
	    private String userPassword;
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(int mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		@Override
		public int hashCode() {
			return Objects.hash(email, mobileNumber, userId, userName, userPassword);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			RegisterUser other = (RegisterUser) obj;
			return Objects.equals(email, other.email) && mobileNumber == other.mobileNumber && userId == other.userId
					&& Objects.equals(userName, other.userName) && Objects.equals(userPassword, other.userPassword);
		}
		@Override
		public String toString() {
			return "RegisterUser [userId=" + userId + ", userName=" + userName + ", email=" + email + ", mobileNumber="
					+ mobileNumber + ", userPassword=" + userPassword + "]";
		}
		public RegisterUser() {
			super();
			// TODO Auto-generated constructor stub
		}
		public RegisterUser(int userId, String userName, String email, int mobileNumber, String userPassword) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.email = email;
			this.mobileNumber = mobileNumber;
			this.userPassword = userPassword;
		}
		
	}




