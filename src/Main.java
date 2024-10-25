
import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {

        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base", "postgres", "Pupsik22848");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        Statement statement = c.createStatement();

//        String ClientTable = "CREATE TABLE  BaseClient " +
//                "(id serial PRIMARY KEY, " +
//                "first_name VARCHAR(50) NOT NULL, " +
//                "last_name VARCHAR(50) NOT NULL, " +
//                "date_of_birth DATE NOT NULL, " +
//                "address VARCHAR(255) NOT NULL" +
//                ")";
//        statement.executeUpdate(ClientTable);
//        System.out.println("Таблица BaseClient создана.");

        // Создание таблицы Products
//        String ProductsTable = "CREATE TABLE Products " +
//                "(id serial PRIMARY KEY, " +
//                "product_name VARCHAR(100) NOT NULL, " +
//                "price DECIMAL(10, 2) NOT NULL" +
//                ")";
//        statement.executeUpdate(ProductsTable);
//        System.out.println("Таблица Products создана.");

        // Создание таблицы Basket
//        String BasketTable = "CREATE TABLE Basket " +
//                "(id serial PRIMARY KEY, " +
//                "client_id INT NOT NULL, " +
//                "product_id INT NOT NULL, " +
//                "purchase_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP, " +
//                "FOREIGN KEY (client_id) REFERENCES BaseClient(id), " +
//                "FOREIGN KEY (product_id) REFERENCES Products(id)" +
//                ")";
//        statement.executeUpdate(BasketTable);
//        System.out.println("Таблица Basket создана.");



    }






}