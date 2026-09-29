package thanhdnh.ueh.edu.article_app;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class ViewArticleActivity extends AppCompatActivity {
  ImageView iv_detail_avatar;
  TextView tv_detail_username, tv_detail_email, tv_detail_hobby, tv_detail_description;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_article);
    getSupportActionBar().hide();

    iv_detail_avatar = findViewById(R.id.iv_detail_avatar);
    tv_detail_username = findViewById(R.id.tv_detail_username);
    tv_detail_email = findViewById(R.id.tv_detail_email);
    tv_detail_hobby = findViewById(R.id.tv_detail_hobby);
    tv_detail_description = findViewById(R.id.tv_detail_description);

    int id = (int) getIntent().getLongExtra("id", 0);

    UserProfile user = ArticleData.getPhotoFromId(id);
    if (user != null) {
      Picasso.get().load(user.getAvatarUrl()).resize(400, 500).centerCrop().into(iv_detail_avatar);
      tv_detail_username.setText(user.getUserName());
      tv_detail_email.setText(user.getEmail());
      tv_detail_hobby.setText(user.getHobby());
      tv_detail_description.setText(user.getDescription());
    }
  }
}
