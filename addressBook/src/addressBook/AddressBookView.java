package addressBook;

public class AddressBookView {
public void AddressViewStart() {
	public void addressViewStart(){
		System.out.println("********************");
		System.out.println("  전화번호 관리 프로그램    ");
		System.out.println("********************");
		
	}
	
	public void AddressViesmenu() {
		public void addressViesMenu() {
			System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
			System.out.println("------------------");
			System.out.println(">메뉴 번호 : ");
		}
	}
	public void AddressViewEnd() {
		public void addressViewEnd() {
			System.out.println("********************");
			System.out.println("     감사합니다     ");
			System.out.println("********************");
		}
	}
	
	public void AddressViewEr() {
		public void addressViewEr() {
			System.out.println("다시 입력해주세요");
		}
	}
	
	public void AddressViewList() {
		public void addressViewList() {
			System.out.println("<1.리스트>");
			addressService.AddressList();
			addressService.addressList();
			System.out.println();
		}
	}
	public void AddressViewInsert() {
		public void addressViewInsert() {
			System.out.println("<2.등록>");
		}
	}
	public void AddressViewDelete() {
		public void addressViewDelete() {
			System.out.println("<3.삭제>");
			System.out.println(">번호 : ");
			
		}
	}
	public void AddressViewSearch() {
		public void addressViewSearch() {
			System.out.println("<4.검색>");
			System.out.println(">이름 : ");
		}
	}
}
}
