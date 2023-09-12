package frontWeb.yt_music;

public class Songinfo {
   private String title;
   private String album_title;
   private String artist_name;
   private int ranking;
   private String genre;
   public Songinfo() {
      // TODO Auto-generated constructor stub
   }
   public Songinfo(String title, String album_title, String artist_name, int ranking, String genre) {
      this.title = title;
      this.album_title = album_title;
      this.artist_name = artist_name;
      this.ranking = ranking;
      this.genre = genre;
   }
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getAlbum_title() {
      return album_title;
   }
   public void setAlbum_title(String album_title) {
      this.album_title = album_title;
   }
   public String getArtist_name() {
      return artist_name;
   }
   public void setArtist_name(String artist_name) {
      this.artist_name = artist_name;
   }
   public int getRanking() {
      return ranking;
   }
   public void setRanking(int ranking) {
      this.ranking = ranking;
   }
   public String getGenre() {
      return genre;
   }
   public void setGenre(String genre) {
      this.genre = genre;
   }
   
}