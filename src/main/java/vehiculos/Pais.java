package vehiculos;

public class Pais {
    private String nombre;
    private int ventas;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.ventas = 0;
    }

    
    public String getNombre() { 
    	return nombre; 
    	}
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    	}
    public void incrementarVentas() {
        this.ventas++;
    }
    public int getVentas() { 
    	return ventas; 
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

     
    
}
