package es.jrodg85.realestate;

public class OfertaDeAlquiler extends Oferta implements OfertaDeAlquilerInterfaz {

  // añado campos de oferta de alquiler

  private float precioAlquilerMensual;
  private int mesesFianza;

  // añado getters a oferta de alquiler

  @Override
  public float getPrecioAlquilerMensual() {
    return precioAlquilerMensual;
  }

  @Override
  public int getMesesFianza() {
    return mesesFianza;
  }

  // añado setters a oferta de alquiler

  @Override
  public void setPrecioAlquilerMensual(float precioAlquilerMensual) {
    this.precioAlquilerMensual = precioAlquilerMensual;
  }

  @Override
  public void setMesesFianza(int mesesFianza) {
    this.mesesFianza = mesesFianza;
  }

  // añado constructor de la clase vivienda

  public OfertaDeAlquiler() {};



  public OfertaDeAlquiler(String tituloOferta, float precioAlquilerMensual, int mesesFianza) {
    super(tituloOferta);
    this.precioAlquilerMensual = precioAlquilerMensual;
    this.mesesFianza = mesesFianza;
  }

  @Override
  public String toString() {
    return "La orferta de alquiler " + getIdOferta() + ", tiene un precio de renta mensual de "
        + getPrecioAlquilerMensual() + "€/mes, y una fianza de " + getMesesFianza() + " meses.";
  }

}
