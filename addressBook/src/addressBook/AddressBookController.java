package addressBook;

public class AddressBookController {
	static AddressBookService adressService = new AddressBookService();
	static AddressBookView adressView = new AddressBookView() {

	protected static void AddressBook() {

		adressView.AddressViewStart();
	protected void addressBook() {
		
		AddressBookService adressService = new AddressBookService();
		AddressBookView adressView = new AddressBookView();
				
		adressView.addressViewStart();
		Scanner sc = new Scanner(System.in);
		while (true) {
			adressView.AddressViesMenu();
			adressView.addressViesMenu();

			switch (sc.nextInt()) {
			case 1:
				adressView.AddressViewList();
				adressView.addressViewList();
				continue;
			case 2:
				adressView.AddressViewInsert();
				adressService.AddressInsert(adressService.AddressInfo(sc));
				adressView.addressViewInsert();
				adressService.addressInsert(adressService.addressInfo(sc));
				System.out.println("[등록되었습니다.]\n");
				continue;
			case 3:
				adressView.AddressViewDelete();
				adressService.AddressDelete(sc.nextInt());
				adressView.addressViewDelete();
				adressService.addressDelete(sc.nextInt());
				System.out.println("[삭제되었습니다.]\n");
				continue;
			case 4:
				adressView.AddressViewSearch();
				adressService.AddressSearch(sc.next());
				adressView.addressViewSearch();
				adressService.addressSearch(sc.next());
				continue;
			case 5:
				adressView.AddressViewEnd();
				adressView.addressViewEnd();
				break;
			default:
				adressView.AddressViewEr();
				adressView.addressViewEr();
				continue;
			}
			sc.close();
}
	}
}