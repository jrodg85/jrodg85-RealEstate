package es.jrodg85.realestate;

public class OfertaDeVenta extends Oferta implements OfertaDeVentaInterfaz {

  // añado campos a oferta de venta

  private float precioVenta;

  // añado getter a oferta de venta

  @Override
  public float getPrecioVenta() {
    return precioVenta;
  }

  // añado setter a oferta de venta

  @Override
  public void setPrecioVenta(float precioVenta) {
    this.precioVenta = precioVenta;
  }

  // añado constructores

  public OfertaDeVenta() {};



  public OfertaDeVenta(String tituloOferta, float precioVenta) {
    super(tituloOferta);
    this.precioVenta = precioVenta;
  }

  @Override
  public String toString() {
    return "La orferta de venta tiene un precio de renta venta  de " + getPrecioVenta();
  }

}
