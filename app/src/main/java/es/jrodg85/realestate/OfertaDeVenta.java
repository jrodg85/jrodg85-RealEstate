package es.jrodg85.realestate;

public class OfertaDeVenta extends Oferta implements OfertaDeVentaInterfaz {

  // atributos

  private Double precioDeVenta;

  // get


  @Override
  public Double getPrecioDeVenta() {
    return precioDeVenta;
  }

  // setter


  @Override
  public void setPrecioDeVenta(Double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  // contructor

  public OfertaDeVenta() {}

  public OfertaDeVenta(String tituloOferta, Double precioDeVenta) {
    super(tituloOferta);
    this.precioDeVenta = precioDeVenta;
  }

  @Override
  public String toString() {
    return "Oferta De Venta [PrecioDeVenta = " + getPrecioDeVenta() + ", Titulo Oferta = "
        + getTituloOferta() + " ]";
  }

}
