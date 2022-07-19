package es.jrodg85.realestate;

public class OfertaDeVenta extends Oferta {

  // atributos

  private Double precioDeVenta;

  // get


  public Double getPrecioDeVenta() {
    return precioDeVenta;
  }

  // setter


  public void setPrecioDeVenta(Double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  // contructor

  public OfertaDeVenta() {
    super();
  }

  public OfertaDeVenta(Vivienda vivienda, String tituloOferta, Double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  @Override
  public String toString() {
    return "Oferta De Venta [PrecioDeVenta = " + getPrecioDeVenta() + " ]";
  }

}
