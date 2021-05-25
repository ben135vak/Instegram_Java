
public class Picture {

	private String pictureName;
	private int likes;
	private int size;

	public Picture(String name, int size) {

		this.pictureName = name;
		this.size = size;
		this.likes = 0;

	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getLikes() {
		return likes;
	}

	public void like() {

		this.likes++;

	}

	public void unlike() {

		if (this.likes > 0) {

			this.likes--;

		}

	}

	public String toString() {

		return "Picture Name: " + this.pictureName + "\n" + "Num Of Likes: " + this.likes + "\n" + "Size is: "
				+ this.size + " Byts";

	}

}
