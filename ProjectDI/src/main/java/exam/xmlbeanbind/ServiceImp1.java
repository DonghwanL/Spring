package exam.xmlbeanbind;

// 서비스와 관련된 실제 구현할 클래스
public class ServiceImp1 implements Service {
	// 배송지 담당자는 DeliveryDao, 주문 담당자는 OrderDao
	private OrderDao orderDao;
	private DeliveryDao deliveryDao;
	
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void setDeliveryDao(DeliveryDao deliveryDao) {
		this.deliveryDao = deliveryDao;
	}

	@Override
	public void order() { 
		// 주문
		// 배송지 정보 추가
		this.deliveryDao.insertAddress(); 
		
		// 주문 정보 추가
		this.orderDao.insertOrder();
	}

	@Override
	public void cancel() {
		// 주문 취소
		// 배송지 정보 삭제 
		this.deliveryDao.removeAddress();
		
		// 주문 정보 삭제
		this.orderDao.removeOrder();
	}

}
