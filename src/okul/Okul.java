package okul;


public class Okul {
	int ogrenci_no;
	String ogrenci_adi;
	int ogrenci_yasi;
	private String ogrenci_sehri;
	double mat_notu;
	double fizik_notu;
	double algo2_notu;
	
	
	Okul(){
	this.ogrenci_no=991122771;
	this.ogrenci_yasi=18;
	this.ogrenci_adi="Mohamed";
	this.ogrenci_sehri="ELAZIĞ";
	
	};
	
	void göster(){
	System.out.println("Öğrenci olan:"+ogrenci_adi+" , Yaşı:"+ogrenci_yasi+" , Öğrenci numarası:"+ogrenci_no+" , Şehrini:"+ogrenci_sehri);
	};
	
	void kayit_guncel(int og_no,int og_yasi,String og_adi,String og_sehri){
	ogrenci_no=og_no;
	ogrenci_yasi=og_yasi;
	ogrenci_adi=og_adi;
	ogrenci_sehri=og_sehri;
		System.out.println("Kayıt güncellendi, yeni bilgileriniz: ");
		göster();	
	};
	private void kayit_sil(int og_no,int og_yasi,String og_adi,String og_sehri){
	ogrenci_no=og_no;
	ogrenci_yasi=og_yasi;
	ogrenci_adi=og_adi;
	ogrenci_sehri=og_sehri;
	
		System.out.println("Kaydınız silindi");
	}
	
	void mat_sonucu(double not){
	mat_notu=not;
	if(not>=50){
		System.out.println("geçti");
	}
	else {
		System.out.println("kaldı");
		};
	};
	
	void fizik_sonucu(double not){
	fizik_notu=not;
	if(not>=50){
		System.out.println("geçti");
	}
	else {
		System.out.println("kaldı");
		};
	};

	void algo2_sonucu(double not){
	algo2_notu=not;
	if(not>=60){
		System.out.println("geçti");
	}
	else {
		System.out.println("kaldı");
		};
	};

	void fizik_sonucu(double fizik_not,double algo2_not){
	fizik_notu=fizik_not;
	algo2_notu=algo2_not;
	if(fizik_not<50 && fizik_not>=40){
	if(algo2_not>=95){
		System.out.println("geçti, kurtuldun");	
	}
	else{
		System.out.println("kaldı");
	}
	}
	else{
	if(fizik_not>=50){
		System.out.println("geçti");
	}	
	}
	};
	
	
	public static void main(String[] args) {
		
	Okul ogrenci=new Okul();
	ogrenci.göster();
	ogrenci.kayit_guncel(998866117,23, "Ahmed", "GAZİANTEP");
	ogrenci.kayit_sil(1954123, 25, "mehmet", "istanbul");
	ogrenci.mat_sonucu(83);
	ogrenci.fizik_sonucu(39);
	ogrenci.algo2_sonucu(100);
	ogrenci.fizik_sonucu(40, 94);
	System.out.println("");
	
	Yap e=new Yap();
	e.göster();
	e.kontrol(991122771);
	}
	
}


class Yap extends Okul{
	
public void kontrol(int og_no){
int rakam;
ogrenci_no=og_no;
rakam=ogrenci_no%10;	
	

if(rakam==1){
	System.out.println("Kitap kazandınız, kütüphaneden seçip alabilirsiniz");
}
else{
	System.out.println("GAME OVER");
}
}
	
	
};