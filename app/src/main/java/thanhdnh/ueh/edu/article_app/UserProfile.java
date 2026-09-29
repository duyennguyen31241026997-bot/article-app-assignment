package thanhdnh.ueh.edu.article_app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserProfile {
  @SerializedName(value = "id", alternate = {"article_id", "user_id"})
  @Expose
  private int id;

  @SerializedName(value = "user_name", alternate = {"userName", "username", "article_title"})
  @Expose
  private String userName;

  @SerializedName(value = "email", alternate = {"user_email"})
  @Expose
  private String email;

  @SerializedName(value = "description", alternate = {"article_description", "bio"})
  @Expose
  private String description;

  @SerializedName(value = "avatar_url", alternate = {"avatarUrl", "article_image"})
  @Expose
  private String avatarUrl;

  @SerializedName(value = "hobby", alternate = {"hobbies"})
  @Expose
  private String hobby;

  public UserProfile(int id, String userName, String email, String description, String avatarUrl, String hobby) {
    this.id = id;
    this.userName = userName;
    this.email = email;
    this.description = description;
    this.avatarUrl = avatarUrl;
    this.hobby = hobby;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName != null ? userName : "User #" + id;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email != null ? email : (getUserName().toLowerCase().replaceAll("[^a-z0-9]", "") + "@ueh.edu.vn");
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDescription() {
    return description != null ? description : "Sinh viên UEH - Khoa Công nghệ thông tin kinh doanh.";
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAvatarUrl() {
    return avatarUrl != null ? avatarUrl : "https://i.pravatar.cc/300";
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getHobby() {
    return hobby != null ? hobby : "Đọc sách, Nghe nhạc, Lập trình Android";
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }
}
