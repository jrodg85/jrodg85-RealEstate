package es.jrodg85.realestate;

public abstract class Oferta implements OfertaInterfaz {

  // añado campos a Oferta

  private String tituloOferta;

  // Añado getters a Oferta

  @Override
  public String getTituloOferta() {
    return tituloOferta;
  }

  // Añado setters a Oferta

  @Override
  public void setTituloOferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }


  // añado constructores

  public Oferta() {}

  public Oferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }

}
