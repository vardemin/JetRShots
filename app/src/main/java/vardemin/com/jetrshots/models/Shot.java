package vardemin.com.jetrshots.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by xavie on 12.02.2017.
 */

public class Shot extends RealmObject {

    public Shot() {}

    public Shot(int id, String title, String description, String imageUrl, Date createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.createdAt = createdAt;
    }
    public Shot(int id, String title, String description, String imageUrl, String createdAt) throws ParseException {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        this.createdAt = format.parse(createdAt);
    }
    @PrimaryKey
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String imageUrl;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private Date createdAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Shot && (id == ((Shot) obj).getId()) && (description.equals(((Shot) obj).getDescription())) && (imageUrl.equals(((Shot) obj).getImageUrl())) && (createdAt.compareTo(((Shot) obj).getCreatedAt())==0);
    }
}
