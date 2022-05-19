package es.jrodg85.realestate;

public class OfertaDeVenta extends Oferta implements OfertaDeVentaInterfaz {

  // atributos

  private double precioAlquilerMensual;
  private int mesesFianza;

  // geters

  @Override
  public double getPrecioAlquilerMensual() {
    return precioAlquilerMensual;
  }

  @Override
  public int getMesesFianza() {
    return mesesFianza;
  }

  // setters

  @Override
  public void setPrecioAlquilerMensual(float precioAlquilerMensual) {
    this.precioAlquilerMensual = precioAlquilerMensual;
  }

  @Override
  public void setMesesFianza(int mesesFianza) {
    this.mesesFianza = mesesFianza;
  }

  public OfertaDeVenta() {}

  public OfertaDeVenta(String tituloOferta, double precioAlquilerMensual, int mesesFianza) {
    super(tituloOferta);
    this.precioAlquilerMensual = precioAlquilerMensual;
    this.mesesFianza = mesesFianza;
  }

}
