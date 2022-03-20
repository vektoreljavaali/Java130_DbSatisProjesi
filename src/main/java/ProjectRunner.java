import controller.MusteriController;
import repository.entity.Musteri;
import services.MusteriService;

public class ProjectRunner {
    public static void main(String[] args) {
        MusteriController musteriController = new MusteriController();
        //musteriController.MusteriKaydet();
        MusteriService ms = new MusteriService();
        for(Musteri musteri:  ms.findAll()){
            System.out.println("müşteri id.....: "+ musteri.getId());
            System.out.println("müşteri ad.....: "+ musteri.getAd());
            System.out.println("müşteri soyad..: "+ musteri.getSoyad());
            System.out.println("--------------------------------");
        }



    }
}
