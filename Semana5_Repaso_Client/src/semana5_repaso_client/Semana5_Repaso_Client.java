package semana5_repaso_client;

import java.util.List;


public class Semana5_Repaso_Client {
    
    public static void main(String[] args) {
        
        List<VentasVo> ventas = listarVentas();
            
        for (VentasVo venta : ventas) {
            System.out.println("ID venta: " + venta.getIdVenta());
            System.out.println("Asesor: " + venta.getNombre());
            System.out.println("DNI: " + venta.getDni());
            System.out.println("Código Bicicleta: " + venta.getCodigoBici());
            System.out.println("Nombre Bicicleta: " + venta.getNombreBici());
            System.out.println("Stock: " + venta.getStock());
            System.out.println("**------------------------------**");
        }
        
        int stockMinimo = 2;
        
        List<BicicletaVo> bicicletas = getBicicletasByStock(stockMinimo);
        
        System.out.println("Reporte de Stock de biciletas");
        System.out.println("Cantidad de Stock ingresado: " + stockMinimo);
        System.out.println("**------------------------------**");
        
        for (BicicletaVo bicicleta : bicicletas) {
            System.out.println("Cantidad de Stock: " + bicicleta.getStock());
            System.out.println("Código de Bicicleta: " + bicicleta.getCodigo());
            System.out.println("Nombre de Bicicleta: " + bicicleta.getBiciNombre());
            System.out.println("**------------------------------**");
        }
    }

    private static java.util.List<semana5_repaso_client.VentasVo> listarVentas() {
        semana5_repaso_client.VentasWs_Service service = new semana5_repaso_client.VentasWs_Service();
        semana5_repaso_client.VentasWs port = service.getVentasWsPort();
        return port.listarVentas();
    }

    private static java.util.List<semana5_repaso_client.BicicletaVo> getBicicletasByStock(int stock) {
        semana5_repaso_client.BicicletaWs_Service service = new semana5_repaso_client.BicicletaWs_Service();
        semana5_repaso_client.BicicletaWs port = service.getBicicletaWsPort();
        return port.getBicicletasByStock(stock);
    }

}
