package aopexam.sample03;

public class BoardPet implements Board {

	@Override
	public void Board() {
		String msg = "PetShop 관련 게시물을 작성 합니다.";
		System.out.println(msg);
	}

}
