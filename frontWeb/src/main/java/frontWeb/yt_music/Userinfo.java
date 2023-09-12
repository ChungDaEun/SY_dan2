package frontWeb.yt_music;

public class Userinfo {
   private String user_name;
   private String favorite_song;
   private String fsong_artist;
   private String favorite_genre;
   public Userinfo() {
      // TODO Auto-generated constructor stub
   }
   public Userinfo(String user_name, String favorite_song, String fsong_artist, String favorite_genre) {
      this.user_name = user_name;
      this.favorite_song = favorite_song;
      this.fsong_artist = fsong_artist;
      this.favorite_genre = favorite_genre;
   }
   public String getUser_name() {
      return user_name;
   }
   public void setUser_name(String user_name) {
      this.user_name = user_name;
   }
   public String getFavorite_song() {
      return favorite_song;
   }
   public void setFavorite_song(String favorite_song) {
      this.favorite_song = favorite_song;
   }
   public String getFsong_artist() {
      return fsong_artist;
   }
   public void setFsong_artist(String fsong_artist) {
      this.fsong_artist = fsong_artist;
   }
   public String getFavorite_genre() {
      return favorite_genre;
   }
   public void setFavorite_genre(String favorite_genre) {
      this.favorite_genre = favorite_genre;
   }

}