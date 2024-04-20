package Cliente;


public class Cliente {
    private String Nombre;
    private String Tipo;
    private String Modelo;
    private String Descripcion;
    private float Precio;

    public Cliente() {}

    public Persona(String Nombre, String Tipo, float Precio, String Descripcion , String Modelo) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Modelo = sexo;
    }

    public Cliente(Cliente cliente) {
        Nombre = cliente.Nombre;
        Tipo = cliente.Tipo;
        Precio = cliente.Precio;
        Descripcion = cliente.Descrpcion;
        Modelo = cliente.Modelo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public float getPrecio() {
        return Precio;
    }

    public float setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = descripcion;
    }

    public char getModelo() {
        return Modelo;
    }

    public void setModelo(char Modelo) {
        this.Modelo = Modelo;
    }
}