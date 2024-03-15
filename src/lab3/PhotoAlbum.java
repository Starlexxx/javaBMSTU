package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhotoAlbum {
    private List<Photo> photos;

    public PhotoAlbum() {
        this.photos = new ArrayList<>();
    }

    public void addPhoto(Photo photo) {
        this.photos.add(photo);
    }

    public int getPhotoCount() {
        return this.photos.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoAlbum that = (PhotoAlbum) o;
        return photos.equals(that.photos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photos);
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" +
                "photos=" + photos +
                '}';
    }
}
