package by.library.domain;

public class Library {
	
	private Phone[] list;
	
	public Library(){
		list = new Phone[0];
	}
	public Library(Phone[] list){
		this.list = list;
	}
	public Phone[] getList() {
		return list;
	}
	public void addToList(Phone a) {
		Phone[] b = new Phone[list.length+1];
		for(int i = 0;i<list.length;i++){
			b[i]= list[i];
		}
		b[list.length] = a;
		list = b;
	}
	public void PrintByTimeTownCall(double a){
		for(int i = 0;i<list.length;i++){
			if(list[i].getTimeInterTownCall()>a)
				System.out.println(list[i].toString());
		}
		System.out.println("");
	}
	public void PrintByTimeInterTownCall(){
		for(int i = 0;i<list.length;i++){
			if(list[i].getTimeTownCall()>0)
				System.out.println(list[i].toString());
		}
		System.out.println("");
	}
	public void SortPrint(){
		Phone[] a = list;
		Phone t;
		int max;
		for(int i = 0;i<a.length;i++){
			max = i;
			for(int j = i+1;j<a.length;j++){
				if(a[j].getLastName().compareTo(a[max].getLastName())<0)
					max = j; 
			}
			t = a[i];
			a[i] = a[max];
			a[max] =  t;
		}
		for(Phone x: list){
			System.out.println(x.toString());
		}
		System.out.println("");
	}
}
