package es.jrodg85.realestate;

public class OfertaDeAlquiler extends Oferta implements OfertaDeAlquilerInterfaz {

  // atributos

  private Double precioAlquilerMensual;
  private Integer mesesFianza;

  // geters

  @Override
  public Double getPrecioAlquilerMensual() {
    return precioAlquilerMensual;
  }

  @Override
  public Integer getMesesFianza() {
    return mesesFianza;
  }

  // setters

  @Override
  public void setPrecioAlquilerMensual(Double precioAlquilerMensual) {
    this.precioAlquilerMensual = precioAlquilerMensual;
  }

  @Override
  public void setMesesFianza(Integer mesesFianza) {
    this.mesesFianza = mesesFianza;
  }

  public OfertaDeAlquiler() {}

  public OfertaDeAlquiler(String tituloOferta, Double precioAlquilerMensual, Integer mesesFianza) {
    super(tituloOferta);
    this.precioAlquilerMensual = precioAlquilerMensual;
    this.mesesFianza = mesesFianza;
  }

  @Override
  public String toString() {
    return "OfertaDeAlquiler [Precio Alquiler Mensual = " + getPrecioAlquilerMensual()
        + ", Meses Fianza = " + getMesesFianza() + ", Titulo Oferta = " + getTituloOferta() + " ]";
  }

}
