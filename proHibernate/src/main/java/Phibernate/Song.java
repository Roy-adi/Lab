package Phibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FVT")
public class Song {
	@Id
	private int id;

	private String Song_name;
	private String Singer;

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Song(int id, String song_name, String singer) {
		super();
		this.id = id;
		Song_name = song_name;
		Singer = singer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSong_name() {
		return Song_name;
	}

	public void setSong_name(String song_name) {
		Song_name = song_name;
	}

	public String getSinger() {
		return Singer;
	}

	public void setSinger(String singer) {
		Singer = singer;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id +" "+ this.Song_name+" "+ this.Singer;
	}

}
