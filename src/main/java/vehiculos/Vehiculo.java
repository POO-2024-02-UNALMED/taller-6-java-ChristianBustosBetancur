package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected double precio;
    protected double peso;
    protected String traccion;
    protected Fabricante fabricante;

    protected static int cantidadVehiculos = 0;
    protected static int cantidadAutomoviles = 0;
    protected static int cantidadCamionetas = 0;
    protected static int cantidadCamiones = 0;

    private static List<Vehiculo> vehiculosCreados = new ArrayList<>();

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;

        cantidadVehiculos++;
        vehiculosCreados.add(this);

        fabricante.incrementarVentas();
        fabricante.getPais().incrementarVentas();
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    public static List<Vehiculo> getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setCantidadVehiculos(int cantidad) {
        cantidadVehiculos = cantidad;
    }

    public static String vehiculosPorTipo() {
        return "Automoviles: " + cantidadAutomoviles + "\n" +
               "Camionetas: " + cantidadCamionetas + "\n" +
               "Camiones: " + cantidadCamiones;
    }

    public static Pais paisMasVendedor() {
        Pais paisMasVendedor = null;
        int maxVentas = 0;

        for (Vehiculo v : Vehiculo.getVehiculosCreados()) {
            Pais pais = v.getFabricante().getPais();
            if (pais.getVentas() > maxVentas) {
                maxVentas = pais.getVentas();
                paisMasVendedor = pais;
            }
        }
        return paisMasVendedor;
    }
    
    public static Fabricante fabricaMayorVentas() {
        Fabricante fabricaMayorVentas = null;
        int maxVentas = 0;

        for (Vehiculo v : Vehiculo.getVehiculosCreados()) {
            Fabricante fabricante = v.getFabricante();
            if (fabricante.getVentas() > maxVentas) {
                maxVentas = fabricante.getVentas();
                fabricaMayorVentas = fabricante;
            }
        }
        return fabricaMayorVentas;
    }   

    public String getPlaca() { 
        return placa; 
    }

    public void setPlaca(String placa) { 
        this.placa = placa; 
    }

    public int getPuertas() { 
        return puertas; 
    }

    public void setPuertas(int puertas) { 
        this.puertas = puertas; 
    }

    public int getVelocidadMaxima() { 
        return velocidadMaxima; 
    }

    public void setVelocidadMaxima(int velocidadMaxima) { 
        this.velocidadMaxima = velocidadMaxima; 
    }

    public String getNombre() { 
        return nombre; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public double getPrecio() { 
        return precio; 
    }

    public void setPrecio(double precio) { 
        this.precio = precio; 
    }

    public double getPeso() { 
        return peso; 
    }

    public void setPeso(double peso) { 
        this.peso = peso; 
    }

    public String getTraccion() { 
        return traccion; 
    }

    public void setTraccion(String traccion) { 
        this.traccion = traccion; 
    }

    public Fabricante getFabricante() { 
        return fabricante; 
    }

    public void setFabricante(Fabricante fabricante) { 
        this.fabricante = fabricante; 
    }
}
