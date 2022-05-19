package es.jrodg85.realestate;

public class OfertaDeAlquiler extends Oferta implements OfertaDeAlquilerInterfaz {

  // atributos

  private double precioDeVenta;

  // get

  @Override
  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  // setter

  @Override
  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }


  // contructor

  public OfertaDeAlquiler() {}

  public OfertaDeAlquiler(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

}
