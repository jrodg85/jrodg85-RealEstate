package es.jrodg85.realestate;

public abstract class Oferta {

  // atributos

  private long idOferta;
  private String tituloOferta;

  // getters

  public long getIdOferta() {
    return idOferta;
  }

  public String getTituloOferta() {
    return tituloOferta;
  }

  // setters

  public void setIdOferta(long idOferta) {
    this.idOferta = idOferta;
  }

  public void setTituloOferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }

  // contructores

  public Oferta() {}

  public Oferta(long idOferta, String tituloOferta) {
    this.idOferta = idOferta;
    this.tituloOferta = tituloOferta;
  }

}
