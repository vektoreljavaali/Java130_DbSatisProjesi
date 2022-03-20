import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Runner {
    public static void main(String[] args) {

        try{
            //1- Driver ı kullan
            Driver.class.forName("org.postgresql.Driver");
            //2- Başlantı Yap
            /**
             * ConnectionString -> her veritabanı için ayrı yazılır.
             * bir veritabanı için connectionstring arayacaksanız. veri tabanını
             * kendi sitesine bakın.
             */
            String URL="jdbc:postgresql://localhost:5432/SatisDB";
            String username="postgres";
            String password="123"; // root olabilir unutmayın.
            Connection conn =
                    DriverManager.getConnection(URL,username,password);
            //3- Emir ver.
            String SQL = "insert into tblmusteri(ad,soyad) values('Muhammet','HOCA')";
            PreparedStatement pst = conn.prepareCall(SQL);
            //4- Emri İşle
            pst.executeUpdate();
            //5- Bağlantıyı Kapat
            conn.close();

        }catch (Exception e){
            System.out.println("Hata..: "+ e.toString());
        }

    }
}
