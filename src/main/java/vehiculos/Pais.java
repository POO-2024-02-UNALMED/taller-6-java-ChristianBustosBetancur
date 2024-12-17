package vehiculos;

class Pais {
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
    
}
