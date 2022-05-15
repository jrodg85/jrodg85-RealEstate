package es.jrodg85.realestate;

public abstract class Oferta {

  // añado campos a Oferta

  private long idOferta;
  private String tituloOferta;

  // Añado getters a Oferta

  public long getIdOferta() {
    return idOferta;
  }

  public String getTituloOferta() {
    return tituloOferta;
  }

  // Añado setters a Oferta

  public void setIdOferta(int idOferta) {
    this.idOferta = idOferta;
  }

  public void setTituloOferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }


  // añado constructores

  public Oferta() {}

  public Oferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }

}
