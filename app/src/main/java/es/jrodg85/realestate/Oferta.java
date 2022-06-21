package es.jrodg85.realestate;

public abstract class Oferta {

  // atributos

  private Long idOferta;
  private String tituloOferta;

  // getters

  public Long getIdOferta() {
    return idOferta;
  }

  public String getTituloOferta() {
    return tituloOferta;
  }

  // setters

  public void setIdOferta(Long idOferta) {
    this.idOferta = idOferta;
  }

  public void setTituloOferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }

  // contructores

  public Oferta() {}

  public Oferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }

}
