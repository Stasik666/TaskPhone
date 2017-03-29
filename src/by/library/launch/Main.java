package by.library.launch;

import by.library.domain.Library;
import by.library.domain.Phone;

public class Main {
	public static void main(String[] args){
		Library library = new Library();
		
		library.addToList(new Phone(1,"Stanislav","Dmitrievich","Kleinikov","Minsk ,Znynskaya 25-81",55552222322225555l,2323.22,3434.23, 0 , 10.3));
		library.addToList(new Phone(1,"Stanislav","Dmitrievich","Borisov","Minsk ,Znynskaya 25-81",55552222322225555l,2323.22,3434.23, 15.8 , 11.3));
		library.addToList(new Phone(1,"Stanislav","Dmitrievich","Antonov","Minsk ,Znynskaya 25-81",55552222322225555l,2323.22,3434.23 , 0 , 8.3));
		library.addToList(new Phone(1,"Stanislav","Dmitrievich","Petrov","Minsk ,Znynskaya 25-81",55552222322225555l,2323.22,3434.23, 15.7 , 7.3));
		library.addToList(new Phone(1,"Stanislav","Dmitrievich","Vasiliev","Minsk ,Znynskaya 25-81",55552222322225555l,2323.22,3434.23 , 0 , 5.3));
		library.addToList(new Phone(1,"Stanislav","Dmitrievich","Procopovich","Minsk ,Znynskaya 25-81",55552222322225555l,2323.22,3434.23, 15.8 , 12.3));
		
		for(Phone a:library.getList()){
			System.out.println(a.toString());
		}
		System.out.println("");
		
		library.SortPrint();//сведения об абонентах в алфавитном порядке.
		
		library.PrintByTimeInterTownCall();//сведения об абонентах, которые пользовались междугородной связью;
		
		library.PrintByTimeTownCall(10.1);//сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
	
			
	}
}
		