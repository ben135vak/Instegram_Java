
public class Insta {

	public static void cleanAlbom(Album albom, int minLikes, int MaxSize) {
		Picture[] newPictures = albom.getPictures();

		for (int i = 0; i < newPictures.length; i++) {

			if (newPictures[i].getLikes() < minLikes && newPictures[i].getSize() > MaxSize) {

				albom.setSize(albom.getSize() - (newPictures[i].getSize() / 1048576));
				newPictures[i] = null;

			}
		}

		albom.setPictures(newPictures);

	}

	public static void main(String[] args) {

		Picture[] pictures = new Picture[4];
		Picture[] pictures2 = new Picture[4];

		pictures[0] = new Picture("Beach", 256000000); // Gets The Name Of The Photo And Size in Bytes
		pictures[1] = new Picture("School", 500000000);
		pictures[2] = new Picture("Garden", 600000000);
		pictures[3] = new Picture("Garden", 256004000);
		
		pictures2[1] = new Picture("School", 500000000);
		pictures2[3] = new Picture("Garden", 256004000);
		Album album = new Album("My Photos", pictures);
		Album album2 = new Album("My Other Photos", pictures2);

		pictures[0].like();
		pictures[0].like();
		pictures[0].like();
		pictures[0].like();
		pictures[0].like();
		pictures[0].unlike();
		pictures[1].like();
		pictures[1].like();
		pictures[1].like();
		pictures[3].like();
		pictures[3].like();
		pictures[3].like();

		cleanAlbom(album, 2, 300000000);

		System.out.println(album.toString());
		System.out.println(album2.toString());


	}

}
