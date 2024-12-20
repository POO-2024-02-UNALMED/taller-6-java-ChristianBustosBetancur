package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private int ventas;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.ventas = 0;
    }

    public String getNombre() { 
    	return nombre; 
    	}
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    	}
    
    public Pais getPais() { 
    	return pais; 
    	}
    public void setPais(Pais pais) { 
    	this.pais = pais; 
    	}
    
    public int getVentas() { 
    	return ventas; 
    	}
    
    public void incrementarVentas() {
        this.ventas++;
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
    
}