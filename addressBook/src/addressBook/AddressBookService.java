package addressBook;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import java.util.StringTokenizer;



public class AddressBookService {
	static final String rootPath = System.getProperty("user.dir") + "\\";
	static final String filename = rootPath + " AdressBook.txt";
	
	protected void AddressList() {
		List<AddressBook> adr = AddressBookList();
		protected void addressList() {
			List<AddressBook> adr = addressBookList();
			for(int i = 0; i < adr.size(); i++) {
				System.out.println((i + 1) + "." + adr.get(i).getName() + "\t" + adr.get(i).getHp() + "\t"
						+ adr.get(i).getTel() + "\n");
			}
		}
		
		protected void AddressInset(AddressBook address) {
			protected void addressInset(AddressBook address) {
			Writer writer = null;
			BufferedWriter bw = null;
			try {
				writer = new FileWriter(filename, true);
				bw = new BufferedWriter(writer);
				bw.newLine();
				bw.append(address.getName() + "," + address.getHp() + "," + address.getTel());
				bw.flush();
			} catch (IOException e) {
				System.err.println("�����߻�");
				e.printStackTrace();
			} finally {
				try {
					writer.close();
					bw.close();
				} catch (Exception e) {
				}
			}
		}
			protected AddressBook AddressInfo(Scanner sc) {
				protected AddressBook addressInfo(Scanner sc) {

					System.out.print(">�̸� : ");
					String name = sc.next();
					System.out.print(">�޴���ȭ : ");
					String hp = sc.next();
					System.out.print(">����ȭ : ");
					String tel = sc.next();
					AddressBook address = new AddressBook(name, hp, tel);
					return address;
				}
				protected List<AddressBook> AddressBookList() {
					protected List<AddressBook> addressBookList() {
						Reader reader = null;
						BufferedReader br = null;
						try {
							reader = new FileReader(filename);
							br = new BufferedReader(reader);
							String line = null;
							while ((line = br.readLine()) != null) {
								StringTokenizer st = new StringTokenizer(line, ",");
								AddressBook address = new AddressBook(st.nextToken(), st.nextToken(), st.nextToken());
								list.add(address);
							}
						} catch (FileNotFoundException e) {
							System.err.println("������ ã�� �� �����ϴ�.");
						} catch (IOException e) {
							e.printStackTrace();
						} finally {
							try {
								br.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
							return list;
						}
						protected void AddressDelete(int num) {
							protected void addressDelete(int num) {
								Writer writer = null;
								BufferedWriter bw = null;
								try {
									List<AddressBook> list = AddressBookList();
									List<AddressBook> list = addressBookList();
									list.remove(num - 1); // ����Ʈ�� 0���� �����̱⶧���� +1

									writer = new FileWriter(filename);
									bw = new BufferedWriter(writer);
									for (int i = 0; i < list.size(); i++) {
										if (i == list.size() - 1) {
											bw.write(list.get(i).getName() + "," + list.get(i).getHp() + "," + list.get(i).getTel());

										} else {
											bw.write(list.get(i).getName() + "," + list.get(i).getHp() + "," + list.get(i).getTel());
											bw.newLine();
										}
									}
									bw.flush();
								} catch (IOException e) {
									System.err.println("�����߻�");
									e.printStackTrace();
								} finally {
									try {
										bw.close();
									} catch (Exception e) {
									}
								}
							}
							protected void AddressSearch(String str) {
								protected void addressSearch(String str) {
//										int i = 1;
//										while ((line = br.readLine()) != null) {
//											if(line.contains(str)) {
//												StringTokenizer st = new StringTokenizer(i+". "+line, ",");
//												while (st.hasMoreTokens()) {
//													String token = st.nextToken();
//													System.out.print(token + "\t");
//												}
//												System.out.println();
//											}
//											i++;
//										}
									// ���� �˻������� �̸��� �̶��
									List<AddressBook> list = AddressBookList();
									List<AddressBook> list = addressBookList();
									for (int i = 0; i < list.size(); i++) {
										if (list.get(i).getName().contains(str)) {
											System.out.println((i + 1) + ". " + list.get(i).toString());
										}
									}
									System.out.println();
								}
							
						
						
						
					}

