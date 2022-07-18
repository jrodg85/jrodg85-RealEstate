package es.jrodg85.realestate;

public class OfertaDeAlquiler extends Oferta {

  // atributos

  private Double precioAlquilerMensual;
  private Integer mesesFianza;

  // geters


  public Double getPrecioAlquilerMensual() {
    return precioAlquilerMensual;
  }


  public Integer getMesesFianza() {
    return mesesFianza;
  }

  // setters


  public void setPrecioAlquilerMensual(Double precioAlquilerMensual) {
    this.precioAlquilerMensual = precioAlquilerMensual;
  }


  public void setMesesFianza(Integer mesesFianza) {
    this.mesesFianza = mesesFianza;
  }

  public OfertaDeAlquiler() {}

  public OfertaDeAlquiler(Double precioAlquilerMensual, Integer mesesFianza) {
    this.precioAlquilerMensual = precioAlquilerMensual;
    this.mesesFianza = mesesFianza;
  }

  @Override
  public String toString() {
    return "OfertaDeAlquiler [Precio Alquiler Mensual = " + getPrecioAlquilerMensual()
        + ", Meses Fianza = " + getMesesFianza() + " ]";
  }

}
