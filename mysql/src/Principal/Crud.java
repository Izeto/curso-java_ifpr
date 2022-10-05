package Principal;
import java.sql.*;

public class Crud {

    private static Connection connection;

    public static void main(String[] args) {
        try{

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");

            PreparedStatement stm = connection.prepareStatement(
                    "create table if not exists veiculos(codigo INT, modelo TEXT, cor TEXT)"
            );
            stm.executeUpdate();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
        inserirVeiculo(1,"Jeep", "Azul");
        inserirVeiculo(2,"Corsa", "Branco");
        inserirVeiculo(3,"Cruze", "Verde");
        inserirVeiculo(4,"Palio", "Cinza");
        inserirVeiculo(5,"Onix", "Prata");

        mostrarVeiculo();

        //atualizarVeiculo(5, "Fusca", "Amarelo");
        //mostrarVeiculo();
        //excluirVeiculo(5);
        //mostrarVeiculo();
    }

    private static void inserirVeiculo(int codigo, String modelo, String cor){
        if(temVeiculo(codigo)){
            System.out.println("Já tem um veículo registrado!");
        } else{
            try {
                PreparedStatement stm = connection.prepareStatement(
                        "insert into veiculos(codigo,modelo,cor) values(?,?,?)"
                );
                stm.setInt(1, codigo);
                stm.setString(2, modelo);
                stm.setString(3, cor);
                stm.executeUpdate();
            }catch(SQLException exception){
                exception.printStackTrace();
            }
        }
    }
    private static void atualizarVeiculo(int codigo, String modelo, String cor){
        try {
            PreparedStatement stm = connection.prepareStatement(
                    "update veiculos set modelo = ?, cor = ? where codigo = ?"
            );
            stm.setString(1, modelo);
            stm.setString(2, cor);
            stm.setInt(3, codigo);
            stm.executeUpdate();
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
    private static void mostrarVeiculo(){
        try {
            PreparedStatement stm = connection.prepareStatement(
                    "select * from veiculos"
            );
            ResultSet resultSet = stm.executeQuery();
            while(resultSet.next()){
                int codigo = resultSet.getInt("codigo");
                String modelo = resultSet.getString("modelo");
                String cor = resultSet.getString("cor");

                System.out.println("Código: "+codigo);
                System.out.println("Modelo: "+modelo);
                System.out.println("Cor: "+cor);
            }
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
    private static void excluirVeiculo(int codigo){
        try {
            PreparedStatement stm = connection.prepareStatement(
                    "delete from veiculos where codigo = ?"
            );
            stm.setInt(1, codigo);
            stm.executeUpdate();

        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
    private static boolean temVeiculo(int codigo) {

        try {
            PreparedStatement stm = connection.prepareStatement(
                    "select * from veiculos where codigo = ?"
            );
            stm.setInt(1, codigo);
            ResultSet resultSet = stm.executeQuery();
            return resultSet.next();
        } catch (SQLException exception) {
            exception.printStackTrace();
            return false;
        }
    }
}
