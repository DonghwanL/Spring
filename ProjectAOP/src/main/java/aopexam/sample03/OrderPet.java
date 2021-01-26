package aopexam.sample03;

public class OrderPet implements Order {

	@Override
	public void order() {
		String msg = "PetShop에서 상품을 주문 합니다.";
		System.out.println(msg);
	}

}
