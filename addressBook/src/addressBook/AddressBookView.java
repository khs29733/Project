package addressBook;

public class AddressBookView {
public void AddressViewStart() {
	public void addressViewStart(){
		System.out.println("********************");
		System.out.println("  ��ȭ��ȣ ���� ���α׷�    ");
		System.out.println("********************");
		
	}
	
	public void AddressViesmenu() {
		public void addressViesMenu() {
			System.out.println("1.����Ʈ 2.��� 3.���� 4.�˻� 5.����");
			System.out.println("------------------");
			System.out.println(">�޴� ��ȣ : ");
		}
	}
	public void AddressViewEnd() {
		public void addressViewEnd() {
			System.out.println("********************");
			System.out.println("     �����մϴ�     ");
			System.out.println("********************");
		}
	}
	
	public void AddressViewEr() {
		public void addressViewEr() {
			System.out.println("�ٽ� �Է����ּ���");
		}
	}
	
	public void AddressViewList() {
		public void addressViewList() {
			System.out.println("<1.����Ʈ>");
			addressService.AddressList();
			addressService.addressList();
			System.out.println();
		}
	}
	public void AddressViewInsert() {
		public void addressViewInsert() {
			System.out.println("<2.���>");
		}
	}
	public void AddressViewDelete() {
		public void addressViewDelete() {
			System.out.println("<3.����>");
			System.out.println(">��ȣ : ");
			
		}
	}
	public void AddressViewSearch() {
		public void addressViewSearch() {
			System.out.println("<4.�˻�>");
			System.out.println(">�̸� : ");
		}
	}
}
}
